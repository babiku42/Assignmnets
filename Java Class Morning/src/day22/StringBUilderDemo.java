package day22;

public class StringBUilderDemo {

	public static void main(String[] args) {
		String s1 ="Good";
		System.out.println();
		s1.concat("MOrning");
		System.out.println(s1);


		String r= "";
		for (int i = s1.length()-1; i >=0; i--) {
			r= r+s1.charAt(i);
		}System.out.println(r);

		System.out.println("===================");
		StringBuffer sb= new StringBuffer("Good MOrning");
		System.out.println(sb);
		sb.append("Hellos");
		System.out.println(sb);

		sb.reverse();
		System.out.println(sb);
		sb.delete(5, 13);
		System.out.println(sb);

		sb.insert(0, "HEllo");
		System.out.println(sb);
			}
//Always written synchronized 
	//threadshaped
	//if we have to use multithreading method then we use stringbuffer and its expensive
	
		

	}


