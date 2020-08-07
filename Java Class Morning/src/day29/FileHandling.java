package day29;

import java.io.File;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) {
String path= "/Users/bikashadhikari/Desktop/test/bikub.txt";
File file= new File(path);
try {
	if(file.createNewFile()) {
		System.out.println("File is created");
	}
	else {
		System.out.println("Opps!!!!! File alreadyexists");
	}
} catch (IOException e) {
	e.printStackTrace();
}
	}

}
