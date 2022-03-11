# JsonFileMerger
Simple Java Program Merges Json files in a folder into one big json file. I have used it to create a 10GB+ json file from 1m+ small json files, memory is kept below 100MB whilst 
running. The program accepts 4 arguments
Input Folder (The folder containing all the small Json files)
Output Folder (The folder where the large json file is to be output)
Array Name (The array name for the combined objects)
Encoding (Encoding for the json, accepted values are: UTF8 (default if not set),UTF16_BE, UTF16_LE, UTF32_BE, UTF32_LE)

Example:
3 json files
File John.json:
{"name":"John", "age":30}
File Mark.json:
{"name":"Mark", "age":30}
File Phil.json:
{"name":"Phil", "age":30}

With an Array Name of "People" will output to:
{
  "People": [
    {
      "name": "John",
      "age": 30
    },
    {
      "name": "Mark",
      "age": 30
    },
    {
      "name": "Phil",
      "age": 30
    }
  ]
}
