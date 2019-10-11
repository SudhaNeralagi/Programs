import java.util.TreeSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Collections;
import java.util.Comparator;
public class Example4 {
	public static void main(String[] args) {
	//create a new tree set, add some random numbers (Integer) and print out the tree set
	TreeSet<Integer> t=new TreeSet<Integer>();
	t.add(10);
	t.add(5);
	t.add(20);
	t.add(30);
	t.add(50);
	t.add(40);
	t.add(85);
	t.add(90);
	t.add(100);
	t.add(25);
	System.out.println(t);
	//iterate through all elements in a tree set
	Iterator<Integer> itr=t.iterator();
	while(itr.hasNext()) 
	{
		System.out.println(itr.next() + "");
	}
	//add all the elements of a specified tree set to another tree set
	TreeSet<Integer> t2=new TreeSet<Integer>();
	t2.addAll(t);
	System.out.println(t2);
	//create a reverse order view of the elements contained in a given tree set
	Iterator<Integer> it=t2.descendingIterator();
	System.out.println("reverse order of elements contained in treeset");
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
   //get the first and last elements in a tree set
	System.out.println("first element in tree set is:"+t2.first());
	System.out.println("last element in tree set is:"+t2.last());
   //get the number of elements in a tree set
	System.out.println("number of elements in a tree set:"+t2.size());
	
   //find the numbers less than 50 in a tree set
	System.out.println(t2.headSet(50));
	/*TreeSet<Integer> head_set=new TreeSet<Integer>();
	head_set=(TreeSet<Integer>) t2.headSet(50);
	Iterator x;
	x=head_set.iterator();
	System.out.println("print elements less than 50 ");
	while(x.hasNext()) {
		System.out.println(x.next());	
	} can also do this method */
	
	// get the element in a tree set which is greater than or equal to the given element
	System.out.println(t2.tailSet(50));
	/*TreeSet<Integer>  tail_set=new TreeSet<Integer>();
	tail_set=(TreeSet<Integer>) t2.tailSet(50);
	Iterator y;
	y=tail_set.iterator();
	System.out.println("print elements greater than or equal to 50 from given treeset");
	while(y.hasNext())
	{
		System.out.println(y.next());
	 } can also do this method*/
	
	//get the element in a tree set between 20 and 90
	System.out.println(t2.subSet(20,90));
	/*TreeSet<Integer> sub_set=new TreeSet<Integer>();
	sub_set=(TreeSet<Integer>)t2.subSet(20,90);
	System.out.println("print elements between 20 and 90 from given treeset");
	Iterator z;
	z=sub_set.iterator();
	while(z.hasNext())
	{
		System.out.println(z.next());
	} can also do this method*/
	
	// retrieve and remove the first element of a tree set
	System.out.println(t2.pollFirst());
	System.out.println(t2);
	//retrieve and remove the last element of a tree set
	System.out.println(t2.pollLast());
	System.out.println(t2);
	//remove a given element from a tree set
	System.out.println(t2.remove(85));
	System.out.println(t2);
		
  }

}