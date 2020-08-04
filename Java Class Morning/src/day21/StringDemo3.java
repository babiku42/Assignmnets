package day21;

public class StringDemo3 {
	String name;
	public StringDemo3(String name) {
		this.name=name;
	}
		/*public String toString() {
			return name;
		}*/
	

	public static void main(String[] args) {
String s1= new String("Ram");
System.out.println(s1);

System.out.println("========================");

StringDemo3 ob = new StringDemo3("Ram");
System.out.println(ob); 

	}

}
