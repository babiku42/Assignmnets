package day28;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {

	public static void main(String[] args) {
Map<Integer,String> map = new HashMap<>();
map.put(10, "Bikash");
map.put(20, "Adhikari");
map.put(30,"Hello");
System.out.println(map);
System.out.println(map.get(10));


System.out.println(map.containsKey(10));
System.out.println(map.containsValue("Bikash"));

//map.clear();
System.out.println(map);
System.out.println(map.size());
System.out.println(map.isEmpty());
System.out.println(map.remove(10));
System.out.println(map);
System.out.println();
Collection<String>c= map.values();
System.out.println(c);

	}

}
