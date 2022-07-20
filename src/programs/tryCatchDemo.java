package programs;

public class tryCatchDemo 
{
    //main function
	public static void main(String[] args) 
	{
		int a = 15,b = 0;
		int result=0;
		
		//try-catch statement
		try
		{
			result = a/b;
			System.out.println("Result: "+result);
		}
		catch(Exception e)
		{
			System.out.println("The function has an error \n ");
			System.out.println("Error: " +e.getMessage());
		}

	}

}
