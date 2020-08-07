package day29;

import java.io.File;

public class FileDemo3 {

	public static void main(String[] args) {
String filePath= "/Users/bikashadhikari/Desktop/biku/bi.txt";
File file= new File(filePath);
System.out.println(file.getName());
System.out.println(file.getAbsolutePath());
System.out.println(file.canRead());
System.out.println(file.canWrite());
System.out.println(file.exists());
System.out.println(file.getParent());
System.out.println(file.isHidden());
System.out.println(file.getTotalSpace());
System.out.println(file.isFile());
System.out.println(file.isDirectory());
file.setWritable(true);

filePath= "/Users/bikashadhikari/Desktop/test/hello.txt ";  
File dest= new File(filePath);
file.renameTo(dest);





	}

}
