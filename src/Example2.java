import java.util.LinkedList;
import java.util.ListIterator;
import java.util.ArrayList;
public class Example2 {
	public static void main(String[] args) {
		LinkedList<String> l=new LinkedList<String>();
		l.add("Lion");
		l.add("Tiger");
		l.add("Deer");
		l.add("Dog");
		l.add("Cow");
		l.add("Ox");
		System.out.println(l+"1");
    	//append the specified element to the end of a linked list
    	l.addLast("Parrot");
    	System.out.println(l);
	   // iterate through all elements in a linked list
		ListIterator<String> itr=l.listIterator();
    	while(itr.hasNext()) 
    	{
			System.out.println(itr.next());
    	}
		//iterate a linked list in reverse order
		while(itr.hasPrevious()) 
		{			
		     System.out.println(itr.previous());
		}
		//insert the specified element at the specified position in the linked list
		l.add(3,"peacock");
		System.out.println(l);
		//insert the specified element at the front of a linked list
    	l.addFirst("Stork");
		System.out.println("linkedlist123456");
		System.out.println(l);
		//insert the specified element at the end of a linked list
		l.addLast("Penguin");
		System.out.println("linkedlist");
    	System.out.println(l);
	   // display the elements and their positions in a linked list
		for(int i=0;i<=l.size()-1;i++) 
	        {
			System.out.println(l.get(i) + "... "+i);
     		}
    	//remove first and last element from a linked list
		l.removeFirst();
		l.removeLast();
		System.out.println(l+"2");
	    //join two linked lists
        LinkedList<String> l2=new LinkedList<String>();
        l2.push("A");
        l2.push("B");
        l2.push("C");
        l2.push("D");
        l2.push("E");
        l2.addAll(l);
        System.out.println(l2);        
        //clone an linked list to another linked list
        LinkedList<String> l3=new LinkedList();
        l3 =(LinkedList<String>)l2.clone();
        System.out.println(l3);
        //remove and return the first element of a linked list
       System.out.println( l2.removeFirst());
       System.out.println( l2.getFirst());
       System.out.println( l2);      
      //retrieve but does not remove, the first element of a linked list
       System.out.println( l2.getFirst());
       System.out.println(l2);
      //check if a particular element exists in a linked list
      System.out.println(l2.contains(40));
      //convert a linked list to array list.
     ArrayList<String> arr=new ArrayList<String>(l3);
      for(String B:arr) {
    	  System.out.println(B);
      }
      //remove all the elements from a linked list.
      l.clear();
      System.out.println(l);    
  }
   
}
