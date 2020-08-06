package day28;

//import java.util.Arrays;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
import java.util.TreeSet;

public class UserTest {

	public static void main(String[] args) {
//List<User>l= Arrays.asList(new User("Bikash",7),new User("Biku",3),new User("Hari",12));
//	System.out.println(l);
		TreeSet<User> set= new TreeSet<User>(new User());
		set.add(new User("BIku",26));
		set.add(new User("BIkash",23));
		
		for(User s:set) { 
			System.out.println(s);
		}
		
}

	} 

