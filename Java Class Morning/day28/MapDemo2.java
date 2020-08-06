package day28;

import java.util.HashMap;
import java.util.Map;


public class MapDemo2 {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		map.put(10, "Bikash");
		map.put(20, "Adhikari");
		map.put(30,"Hello");
		System.out.println(map);
		System.out.println(map.get(10));
System.out.println();
for(Map.Entry<Integer, String> m:map.entrySet()) {
	System.out.println(m.getKey()+" "+ m.getValue());
	
}
	}

}
