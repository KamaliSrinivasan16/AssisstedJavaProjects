package programs;

public class methodExecution {

	//factorial method
	public int factorial(int n)
	{
		int fact =1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	
	//main function
	public static void main(String[] args) 
	{
		methodExecution obj = new methodExecution();
		int a = obj.factorial(5);
        System.out.println("factorial of 5 is: "+a);
	}

}
