 package day29;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo5 {

	public static void main(String[] args) {
String filePath= "/Users/bikashadhikari/Desktop/test/bik.txt";

try (
	FileReader fr= new FileReader(filePath);
	FileWriter fw= new FileWriter("/Users/bikashadhikari/Desktop/biku/bik1  .txt");
	 ){
int len;
while((len=fr.read())!=-1) {
	 System.out.println(len);
	 fw.write(len);
}} catch (IOException e) {
	e.printStackTrace();
}

	}

}
