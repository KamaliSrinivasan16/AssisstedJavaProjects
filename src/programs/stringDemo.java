package programs;

public class stringDemo {

	public static void main(String[] args) {
		System.out.println("String Methods: ");
		String s1 = "Hello";
		String s2 = "HeLlo";
		
		//length
		System.out.println(s1.length());
		
		//substring
		System.out.println(s2.substring(2));
		
		//comparison
		System.out.println(s1.compareTo(s2));
		
		//IsEmpty
		System.out.println(s1.isEmpty());
		
		//toLowerCase
		System.out.println(s2.toLowerCase());
		
		//toUpperCase
		System.out.println(s1.toUpperCase());
		
		//replace
		System.out.println(s1.replace('l', 'p'));
		
		//equal
		System.out.println(s1.equals(s2));
		
		System.out.println("\n");
		
		//String Buffer
		System.out.println("String Buffer: ");
		StringBuffer s3 = new StringBuffer("Welcome");
		
		//append
		s3.append(" user ");
		System.out.println(s3);
		
		//insert
		s3.insert(0,'a');
		System.out.println(s3);
		
		//replace
		s3.replace(0, 4, "AWEL");
		System.out.println(s3);
		
		//delete
		s3.delete(0, 1);
		System.out.println(s3);
		
		System.out.println("\n");
		
		//String Builder
		System.out.println("String Builder: ");
		StringBuilder s4 = new StringBuilder("Universal");
		
		System.out.println(s4.append(" key"));
		System.out.println(s4.insert(0, 'A'));
		System.out.println(s4.delete(0,1));
		System.out.println(s4.reverse());
		
		System.out.println("\n");
		
		//conversion of string
		System.out.println("conversion of string: ");
		String s5 = "World";
		
		//string to string buffer
		StringBuffer sb1 = new StringBuffer(s5);
		sb1.reverse();
		System.out.println("string to string buffer: "+ sb1);
		
		//string to string builder
		StringBuilder sb2 = new StringBuilder(s5);
		sb2.append(" wide");
		System.out.println("string to string builder: "+ sb2);

	}

}
