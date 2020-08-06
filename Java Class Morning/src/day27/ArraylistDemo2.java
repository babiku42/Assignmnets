package day27;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class ArraylistDemo2 {

	public static void main(String[] args) {
		List<Integer> al= new LinkedList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		System.out.println(al.get(2));
		
		System.out.println("=========================");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
			
			
		}
		System.out.println("=======================");
		for(int a:al) {
			System.out.println(a);
		
		}
		System.out.println("=====================");
		Iterator<Integer> lit= al.iterator();
		while(lit.hasNext()) {
			System.out.println(lit.next());
			
		}
		System.out.println("=====================");
	ListIterator<Integer> it= al.listIterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	System.out.println("==================");	
	}
	while(it.hasPrevious()) {
		System.out.println(it.previous());
		
	}
	System.out.println("=================");
	al.forEach(new Consumer<Integer>() {

		@Override
		public void accept(Integer t) {
System.out.println(t);	

		}	
		
	});
	System.out.println("================");
	al.forEach((t) -> {
		System.out.println(t);
	});
	System.out.println("======================");
	al.forEach(t -> System.out.println(t));//lamda expression
	
	
	
	}

}
