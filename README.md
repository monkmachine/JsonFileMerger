<h1 class="code-line" data-line-start=0 data-line-end=1 ><a id="JsonFileMerger_0"></a>JsonFileMerger</h1>
<p class="has-line-data" data-line-start="1" data-line-end="7">Simple Java Program Merges Json files in a folder into one big json file. I have used it to create a 10GB+ json file from 1m+ small json files, memory is kept below 100MB whilst<br>
running. The program accepts 4 arguments<br>
Input Folder (The folder containing all the small Json files)<br>
Output Folder (The folder where the large json file is to be output)<br>
Array Name (The array name for the combined objects)<br>
Encoding (Encoding for the json, accepted values are: UTF8 (default if not set),UTF16_BE, UTF16_LE, UTF32_BE, UTF32_LE)</p>
<p class="has-line-data" data-line-start="8" data-line-end="16">Example:<br>
3 json files<br>
File John.json:<br>
{“name”:“John”, “age”:30}<br>
File Mark.json:<br>
{“name”:“Mark”, “age”:30}<br>
File Phil.json:<br>
{“name”:“Phil”, “age”:30}</p>
<p class="has-line-data" data-line-start="17" data-line-end="34">With an Array Name of “People” will output to:<br>
{<br>
“People”: [<br>
{<br>
“name”: “John”,<br>
“age”: 30<br>
},<br>
{<br>
“name”: “Mark”,<br>
“age”: 30<br>
},<br>
{<br>
“name”: “Phil”,<br>
“age”: 30<br>
}<br>
]<br>
}</p>
