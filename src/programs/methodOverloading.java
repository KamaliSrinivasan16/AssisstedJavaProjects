package programs;

public class methodOverloading {

	//overloading method
	public void sum(int a,int b,int c)
	{
		System.out.println("The sum is: "+(a+b+c));
	}
	
	public void sum(int a,int b)
	{
		System.out.println("The sum is: "+(a+b));
	}
	
	//main function
	public static void main(String[] args) {
		methodOverloading obj = new methodOverloading();
		obj.sum(5,8,7);
		obj.sum(6,9);

	}

}
