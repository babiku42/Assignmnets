package day28;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo3 {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		map.put(20, "Bikash");
		map.put(10, "Adhikari");
		map.put(30,"Hello");
System.out.println();
for(Map.Entry<Integer, String> m:map.entrySet()) {
	System.out.println(m.getKey()+" "+ m.getValue());
	
	System.out.println();
	Map<Integer,String> map1 = new LinkedHashMap<>();
	map1.put(20, "Bikash");
	map1.put(10, "Adhikari");
	map1.put(30,"Hello");
System.out.println("Using Linkedhash");
for(Map.Entry<Integer, String> m1:map1.entrySet()) {
System.out.println(m1.getKey()+" "+ m1.getValue());
}
System.out.println();
Map<Integer,String> map2 = new TreeMap<>();
map2.put(10, "Bikash");
map2.put(20, "Adhikari");
map2.put(30,"Hello");
System.out.println("Using Tree Map");
for(Map.Entry<Integer, String> m2:map2.entrySet()) {
System.out.println(m2.getKey()+" "+ m2.getValue());

}
	}

	}
}
