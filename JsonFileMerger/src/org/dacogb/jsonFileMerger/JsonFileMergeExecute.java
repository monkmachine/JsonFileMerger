package org.dacogb.jsonFileMerger;

import java.io.IOException;

public class JsonFileMergeExecute {

	public static void main(String[] args) throws IllegalArgumentException, IOException {
		String InputFolder = args[0];
		String OutputFolder = args[1];
		String SoftType = args[2];
		String JSONEncoding = args[3];
		JsonFileMerger jsonFileMerger = new JsonFileMerger();
		jsonFileMerger.setArrayField(SoftType);
		jsonFileMerger.setInputFolder(InputFolder);
		jsonFileMerger.setJSONEncoding(JSONEncoding);
		jsonFileMerger.setOutputFolder(OutputFolder);
		jsonFileMerger.execute();
	}

}
