package day29;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo4 {

	public static void main(String[] args) {
String filePath= "/Users/bikashadhikari/Desktop/test/bik.txt";
FileInputStream fis= null;
FileOutputStream fos= null;
try {
	fis= new FileInputStream(filePath);
	fos= new FileOutputStream("/Users/bikashadhikari/Desktop/biku/bi.txt" );

	int len;
	while((len=fis.read()) !=-1) {
		System.out.println(len);
		fos.write(len);
	}
} catch (IOException e) {
	
	e.printStackTrace();
}
finally {
	try {
		fis.close();
		fos.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	
}
	}

}
 