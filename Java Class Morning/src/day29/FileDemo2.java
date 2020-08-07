package day29;

import java.io.File;


public class FileDemo2 {

	public static void main(String[] args) {
String filePath= "/Users/bikashadhikari/Desktop/biku";
File file= new File(filePath);

if(file.mkdir()) {
System.out.println("Folder is created");	
}else {
	System.out.println("opps!! folder already exist");
}
	}

}
