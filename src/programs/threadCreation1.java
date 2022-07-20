package programs;

//using extends thread:

public class threadCreation1 extends Thread 
{
	//void method
	@Override 
	public void run()
	{
		System.out.println("Inside thread function...");
	}
    
	//main function
	public static void main(String[] args) 
	{
		threadCreation1 t1 = new threadCreation1();
		t1.start();
		
	}

}
