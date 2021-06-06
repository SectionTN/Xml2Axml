## Description
This tool is used to decode binary xml file from android apps into human readable xml file and to encode human readable xml file into binary xml file.
## Adding in project
Just copy axml folder and add it in your project directory or download AxmlXml.jar from releases and put it in libs folder of your project.
## Usage - Decoding binary xml
If you want to decode a binary xml file from sdcard and take decoded xml as a ` String `. Then call this function.
```java
InputStream inputFile = new FileInputStream("BinaryXmlFilePath");
String decodedXml = AxmlUtil.decode(inputFile);  
```
If you want to decode a binary xml file and put it somewhere in sdcard then call this function
```java
InputStream inputFile = new FileInputStream("BinaryXmlFilePath");
AxmlUtil.decode(inputFile, "OutputFilePath");
```
## Usage - Encoding normal xml
If you want to encode a xml file and take encoded xml as byte array then use this function
```java
byte[] encodedXml = AxmlUtil.encodeFile("NormalXmlFilePath");
```
If tou want to encode xml file and put it somewhere in sdcard then use this function
```java
AxmlUtil.encodeFile("NormalXmlFilePath", "OutputFilePath");
```
## Usage - Using cli version
To decode a binary xml file use this command
```nginx
java -jar AxmlXml-CLI.jar -d inputFilePath outputFilePath
```
To encode a xml file use this command
```nginx
java -jar AxmlXml-CLI.jar -e inputFilePath outputFilePath
```
## Note
Don't forget to add this rule in your proguard config file if you are using proguard.
```nginx
-keep class axml.xml.** { *; } 
```
If you don't add this in proguard then AxmlUtil will not work while encoding a xml file.
