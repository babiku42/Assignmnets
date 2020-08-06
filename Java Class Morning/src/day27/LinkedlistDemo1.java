package day27;

import java.util.LinkedList;
import java.util.List;

public class LinkedlistDemo1 {

	public static void main(String[] args) {
List<Integer> al= new LinkedList<>();
al.add(10);
al.add(20);
al.add(30);
System.out.println(al);
al.add(40);
System.out.println(al);
al.add(1, 30);
System.out.println(al);
al.remove(3);
System.out.println(al);
al.set(2, 55);
System.out.println(al);
System.out.println(al.size());
System.out.println(al.indexOf(40));
System.out.println(al.get(1));
System.out.println(al.contains(40));
//al.clear();
System.out.println(al.isEmpty());

System.out.println("===============");
List<Integer> l= new LinkedList<Integer>();
l.add(50);
System.out.println(l);
//l.addAll(al);
l.addAll(0, al);
System.out.println(l);
System.out.println(l.containsAll(al));
//l.removeAll(al);
l.retainAll(al);//removes all the value of l 
System.out.println(l);


	}


}
