package day27;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo2 {
	public static void main(String[] args) {
		Set<Integer> set= new HashSet<>();
		set.add(10);
		set.add(40);
		set.add(30);
		System.out.println(set);
		System.out.println("=============");
		set.add(40);
		System.out.println(set);
		List<Integer>list= new ArrayList<>();
		list.add(10);
		list.add(30);
		list.add(20);
		list.add(30);
		System.out.println(list);




			}
}
