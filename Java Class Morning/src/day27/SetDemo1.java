package day27;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo1 {

	public static void main(String[] args) {
Set<Integer> set= new HashSet<>();
set.add(10);
set.add(20);
set.add(30);
System.out.println(set);
System.out.println("=============");
set.add(40);
System.out.println(set);
List<Integer>list= new ArrayList<>();
list.add(11);
list.add(12);
list.add(14);
System.out.println(list);




	}

}
//Set doesnot have indext based method;
