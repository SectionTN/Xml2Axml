package axml.xml;

public class Main {
	public static void main(String[] args) {
		try {
			if (args[0].endsWith("d")) {
				AxmlUtil.decode(args[1], args[2]);
			} else if(args[0].endsWith("e")){
				AxmlUtil.encodeFile(args[1], args[2]);
			} else if(args[0].endsWith("help")){
				System.out.printf("AxmlXml version 1.0\nTo decode binary xml use this command : [-d] <input> <output>\nTo encode xml use this command : [-e] <input> <output>\nThank you for using our tool.\n");
			} else {
				System.out.printf("Invalid command. Please tye --help and see how to use it.\n");
			}
		} catch (Exception e) {
			System.out.printf("%s\n", e.toString());
		}
	}
}