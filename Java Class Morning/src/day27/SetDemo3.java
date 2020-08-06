package day27;

import java.util.HashSet;
import java.util.Iterator;

import java.util.Set;
import java.util.function.Consumer;

public class SetDemo3 {

	public static void main(String[] args) {
		Set<Integer> al= new HashSet<>();
		al.add(10);
		al.add(20);
		al.add(30);
		/*System.out.println(al.get(0));
		System.out.println(al.get(1));
		System.out.println(al.get(2));*/
		
		/*System.out.println("=========================");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
			
			
		}*/
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
