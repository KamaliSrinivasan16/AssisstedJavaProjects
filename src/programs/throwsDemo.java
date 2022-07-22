package programs;

public class throwsDemo {

	//print function
	void printElement()throws Exception 
	{
		int[] arr = {5,3,9};
		System.out.println(arr[3]);
		
	}
	
	//main function
	public static void main(String[] args) 
	{
		throwsDemo t = new throwsDemo();
		
		//try-catch statement
		try
		{
			t.printElement();
		}
		catch(Exception e)
		{
			System.out.println("Error: "+e.getMessage()+"\n");
		}
		
		System.out.println("end of program");

	}

}
