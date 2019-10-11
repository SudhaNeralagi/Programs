import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
public class Example3 {
	public static void main(String[] args) {
		HashSet<String> h=new HashSet<String> ();
		// add student names in a hash set
		h.add("A");
		h.add("B");
		h.add("C");
		h.add("D");
	    h.add("E");
		h.add("F");
		System.out.println(h);
		// append the specified element to the end of a hash set.
		h.add("P");
		System.out.println(h);
	    //iterate through all elements in a hash list
		Iterator<String> itr=h.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		//get the number of elements in a hash set
		System.out.println(h.size());
		 //convert a hash set to an array
		 Object[] ary=h.toArray();
		 for(int i=0;i<=h.size()-1;i++)
		 {
			System.out.println(ary[i]);
		 }
		 
		//convert a hash set to an LinkedList
		 LinkedList<String> arr1=new LinkedList<String>(h);
		 for(String obj1:arr1)
		 {
			System.out.println(obj1);
		 }
		 // convert a hash set to a ArrayList
		 ArrayList<String> al=new ArrayList<String>(h);
		 for(String obj2:al)
		 {
			System.out.println(obj2);
		 }
		 System.out.println(al);
		 System.out.println(h);
		 // compare two hash set
		 HashSet<String> h2=new HashSet<String> ();
		 h2.add("X");
		 h2.add("B");
		 h2.add("C");
		 System.out.println(h2);
		 HashSet<String> result_H=new HashSet<String> ();
         for(String result:h) {
        	  System.out.println(h2.contains(result)? "YES":"NO");
    	 }
        // compare two sets and retain elements which are same on both sets
         System.out.println(h);
         System.out.println(h2);
         h.retainAll(h2);
         System.out.println(h);
        // remove all of the elements from a hash set.
        h.addAll(h2);
        System.out.println(h);
        h.clear();
        System.out.println(h);
         
                   
}
}
