package programs;

public class finallyDemo {

	//main function
	public static void main(String[] args) 
	{
		int[] arr = {5,8,6};
		
		//try-catch statement
		try
		{
			System.out.println(arr[3]);
			throw(new Exception("array limit exceeded"));
		}
		catch(Exception e)
		{
			System.out.println("Error: "+e.getMessage()+"\n");
		}
		
		//finally statement
		finally 
		{
			System.out.println("Array length : "+arr.length);
		}

	}

}
