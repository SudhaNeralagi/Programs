import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Collections;

public class Example5 {
	public static void main(String[] args) {
		//create a HashMap of key as student id(Integer) and value as Student name (String). Add some entries and print the hash map
		HashMap<Integer,String>  hm=new HashMap<Integer,String>();
		hm.put(50,"Neha");
		hm.put(51,"Subha");
		hm.put(52,"Divya");
		hm.put(53,"Kuili");
		hm.put(54,"Subbu");
		hm.put(55,"Dassan");
		hm.put(56,"Shivalinga");
		System.out.println(hm);
		//iterate over all the entries in the HashMap
		Iterator<Entry<Integer,String>> itr=hm.entrySet().iterator();
		while(itr.hasNext()) {
		Map.Entry<Integer,String> z= (Map.Entry<Integer,String>)itr.next();
		System.out.println(z.getKey()+ "="+ z.getValue());
		}
		//get the specified value with the specified key in a HashMap
         String val=hm.get(53);
		 System.out.println("value of 53 key is:"+val);
		 //count the number of key-value (size) mappings in a map
		 Integer n=hm.size();
		 System.out.println("number of key value pair is:"+n);
		// copy all of the mappings from the specified map to another map
		 HashMap<Integer,String> hm2=new HashMap<Integer,String>();
		 hm2.putAll(hm);
		 System.out.println(hm2);
		/* hm2=(HashMap)hm.clone();
		 System.out.println(hm2); can also do this method */
		 //test if a map contains a mapping for the specified key
	      System.out.println("is this key contain");
	      for(int i=50;i<=58;i++)
	      {
	        if(hm2.containsKey(i))
	        {
	    	  System.out.println("yes! then its value is:" +hm2.get(i) );
	        }
	      else 
	        {
	    	  System.out.println("no");
	        }
	      }  
	    //test if a map contains a mapping for the specified value	  
	      System.out.println("is this value contains");
	      if(hm2.containsValue("Neha"))
	        {
	    	  System.out.println("yes");
	        }
	      else 
	        {
	    	  System.out.println("no");
	        }
	       //get the value of a specified key in a map.	  
	       String vall=hm2.get(55);
		   System.out.println(vall);
           //get a set view of the keys contained in this map
		   System.out.println("set view is: "+ hm2.keySet());
		   /*Set s=hm2.keySet();
		   System.out.println(s);*/
		  // get a collection view of the values contained in this map
		   System.out.println("Collection view is: "+ hm2.values());
		  /* Collections vi=(String)hm2.values();
		   System.out.println(vi);*/
		  //get key value pairs in this map
		   Set e=hm2.entrySet();
		   System.out.println(e);
	      // remove all of the mappings from a map
			hm2.clear();
		   System.out.println(hm2);

 }
}
