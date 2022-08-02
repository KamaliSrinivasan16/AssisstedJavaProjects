package programs;
import java.util.*;

public class map {

	//main function
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) 
	{
		//HashMap:
		
		HashMap<Integer,String> h1 = new HashMap<Integer,String>();
		h1.put(1,"apple");
		h1.put(2, "ball");
		h1.put(3, "cat");
		System.out.println("HashMap: ");
		for(Map.Entry m:h1.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println("\n");
		
		//HashTable:
		
		Hashtable<Integer,String> h2 = new Hashtable<Integer,String>();
		h2.put(4,"dog");
		h2.put(5, "elephant");
		h2.put(6, "frog");
		System.out.println("Hashtable: ");
		for(Map.Entry m:h2.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println("\n");
		
		//TreeMap:
		
		TreeMap<Integer,String> h3 = new TreeMap<Integer,String>();
		h3.put(7,"goat");
		h3.put(8, "hat");
		h3.put(9, "ice-cream");
		System.out.println("TreeMap: ");
		for(Map.Entry m:h3.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println("\n");
	}

}
