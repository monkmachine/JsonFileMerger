package JsonFileMerger;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class jsonFileMerger {

	private JsonFactory jfactory = new JsonFactory();

	public void main(String args[]) throws IOException {

		String InputFolder = args[0];
		String OutputFolder = args[1];
		String SoftType = args[2];
		FileOutputStream fos = new FileOutputStream(new File(OutputFolder + SoftType + ".json"));

		JsonGenerator jGenerator = jfactory.createGenerator(fos, JsonEncoding.UTF8);
		jGenerator.writeStartObject();
		jGenerator.writeFieldName(SoftType);
		jGenerator.writeStartArray();
		ObjectMapper mapper = new ObjectMapper();
		Files.walk(Paths.get(InputFolder)).filter(p -> p.toString().endsWith(".json")).forEach(p -> {
			try {

				InputStream jsonStream = new FileInputStream(p.toFile());
				JsonParser jsonParser = new JsonFactory().createParser(jsonStream);
				TreeNode treeNode = mapper.readTree(jsonParser);
				jGenerator.setCodec(mapper);
				jGenerator.writeTree(treeNode);
				jsonStream.close();
				jsonParser.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		});

		jGenerator.writeEndArray();

		jGenerator.close();
		fos.close();

	}

}