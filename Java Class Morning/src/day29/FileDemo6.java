package day29;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo6 {

	public static void main(String[] args) {
String filepath= "/Users/bikashadhikari/Desktop/test/bik.txt";
try ( FileReader fr= new FileReader(filepath);
BufferedReader br = new BufferedReader(fr);
		FileWriter fw= new FileWriter("/Users/bikashadhikari/Desktop/biku/biku.text");
		BufferedWriter bw= new BufferedWriter(fw);
		
		
		
){
	String len;
	while((len= br.readLine())!=null) {
		System.out.println(len);
		bw.write(len);
		
		
	}
	
} catch (IOException e) {
	e.printStackTrace();
	
}
	}

}
    