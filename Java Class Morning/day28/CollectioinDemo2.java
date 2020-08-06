package day28;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectioinDemo2 {

	public static void main(String[] args) {
List<Integer>l= new ArrayList<>();
l.add(40);
l.add(30);
l.add(20);

System.out.println(l);
List<Integer> ll= Collections.unmodifiableList(l);
//ll.add(10);
//System.out.println(ll);

}
}
