package programs;

public class arrayDemo {

	public static void main(String[] args) 
	{
		
		//1-dimensional array
		int a[]= {1,5,6,3,4};
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Element of a: "+a[i]);
		}
		
		//multi-dimensional array
		int b[][] = {{5,3,6,9},{9,4,6}};
		
		System.out.println("length of row 1: "+b[0].length);
		System.out.println("length of row 2: "+b[1].length);

	}

}
