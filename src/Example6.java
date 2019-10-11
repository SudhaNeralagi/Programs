import java.util.TreeMap;
import java.util.Comparator;
import java.lang.*;

public class Example6 {
	public static void main(String[] args) {
		// to create a TreeMap
		TreeMap<Integer, String> m = new TreeMap<Integer, String>(new MyAssign());
		m.put(2,"sahana");
		m.put(3,"ditya");
		m.put(4,"diya");
		m.put(5,"shreya");
		m.put(6,"nitya");
		m.put(7,"tanu");
		
		System.out.println(m);
		// get the first (lowest) key and the last (highest) key currently in a map
		System.out.println("first key is:" + m.firstKey());
		System.out.println("last key is:" + m.lastKey());
		System.out.println("reverse order of keys:" + m.descendingKeySet());
		//get all keys from the given a Tree Map
		System.out.println("keys of given tree map:" + m.keySet());
        // delete all elements from a given Tree Map
		m.clear();
		System.out.println( m);
		
	}
}

//sort keys in Tree Map by using comparator
class MyAssign implements Comparator<Integer> {
	public int compare(Integer s1, Integer s2) {

		return -s2.compareTo(s1);
	}
}
