package day27;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo4 {

	public static void main(String[] args) {
		Set<Integer> t= new HashSet<>();
		t.add(10);
		t.add(5);
		t.add(30);
		System.out.println("Using hashset");
		for(int v:t) {
			System.out.println(v);
	}System.out.println("linkedHashset");
		Set<Integer> lit= new LinkedHashSet<>();
lit.add(10);
		lit.add(20);
		lit.add(5);
	
		for(int k:lit) {
			System.out.println(k);
}
		System.out.println("Using treeset");
		Set<Integer> tset= new TreeSet<>();
		tset.add(10);
		tset.add(5);
		tset.add(30);
	
		for(int a:tset) {
			System.out.println(a);
}
	}
}
