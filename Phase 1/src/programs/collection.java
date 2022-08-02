package programs;
import java.util.*;

public class collection {

	public static void main(String[] args) {
		
		//ArrayList:
		System.out.println("Array: ");
		ArrayList<String> course = new ArrayList<String>();
		course.add("rdbms");
		course.add("sql");
		course.add("java");
		System.out.println(course);
		System.out.println("\n");
		
		//Vector:
		System.out.println("Vector: ");
		Vector<Integer> v = new Vector<Integer>();
		v.addElement(20);
		v.addElement(10);
		v.addElement(30);
		System.out.println(v);
		System.out.println("\n");
		
		//LinkedList:
		System.out.println("Linked list: ");
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(500);
		l.add(300);
		l.add(400);
		Iterator<Integer> i = l.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("\n");
	
	    //HashSet:
		System.out.println("Hashset: ");
	    HashSet<Integer> h = new HashSet<Integer>();
	    h.add(5);
	    h.add(25);
	    h.add(15);
	    h.add(15);
	    System.out.println(h);
	    System.out.println("\n");
	
	    //Linked HashSet:
	    System.out.println("Linked Hashset: ");
	    LinkedHashSet<Integer> lh = new LinkedHashSet<Integer>();
	    lh.add(15);
	    lh.add(5);
	    lh.add(25);
	    System.out.println(lh);
	    System.out.println("\n");
	}

}
