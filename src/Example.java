import java.util.ArrayList;
import java.util.Collections;
import java.lang.*;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Iterator;

public class Example {
	public static void main(String[] args) {
		ArrayList<String> s=new ArrayList<String>();
		s.add("Bipin");
		s.add("Sunny");
		s.add("Shivalinga");
		s.add("Neha");
		s.add("Divya");
		s.add("prithvi");
		s.add("Avinash");
		System.out.println(s);
		// iterate through all elements in a array list
	   /* for(int  i=0;i<=s.size()-1;i++) {
	   	System.out.println(s.get(i) + " ");  
	    } */ 
		Iterator<String> x=s.iterator();
		while(x.hasNext()) {
			System.out.println(x.next());
		}
		//insert an element into the array list at the first position
		s.add(1,"Manju");
		System.out.println(s);
        //retrieve an element (at a specified index) from a given array list
		System.out.println(s.get(4));
		// update specific array element by given element
		s.set(4,"Goutham");
		System.out.println(s);
		// remove the third element from a array list
		s.remove(3);
		System.out.println(s);
		// search an element in a array list
		System.out.println(s.contains("Manju"));
		System.out.println(s.contains("Chaya")); 
		//print before sorting a given array list
		System.out.println(s);
		//sorting a given array list
		Collections.sort(s);
		System.out.println(s);
		//copy one array list into another
		ArrayList<String> s1=new ArrayList<String> ();
		s1.add("Harshita");
		s1.add("Subha");
		Collections.copy(s,s1);
		System.out.println(s);
		// reverse elements in a array list
		/*for(int i=s.size()-1;i>=0;i--) {
			System.out.println(s.get(i) +  " ");
		}*/
		ListIterator<String> it=s.listIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("reverse order of element");
		while(it.hasPrevious())
		{
			System.out.println(it.previous());
		}
		//join two array lists
		ArrayList<String> s2=new ArrayList<String> ();
		s2.add("Diya");
		s2.add("Tanu");
		s2.addAll(s);
		System.out.println(s2);
		//clone an array list to another array list
		ArrayList<String> s3=new ArrayList<String> ();
	    s3=(ArrayList<String>)s2.clone();
		 System.out.println(s3);
		//empty an array list
		s3.removeAll(s3);
		System.out.println(s3);
		//test an array list is empty or not
        System.out.println(s3.isEmpty());
        
      
 }

}


