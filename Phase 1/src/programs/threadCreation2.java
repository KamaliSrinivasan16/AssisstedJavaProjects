package programs;

//using runnable interface:

public class threadCreation2 implements Runnable 
{
	public static int a=0;
	//void method
	@Override
	public void run()
	{
		System.out.println("Entered thread function...\n");
		while(a<5)
		{
			try
			{
				System.out.println("Inside thread function..."+(++a));
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				System.out.println("exception: "+e.getMessage());
			}
			
		}
		System.out.println("\n Exit thread function...");
		
	}

	//main function
	public static void main(String[] args) 
	{
		//Thread t = new Thread(new threadCreation2()); (combining line 17 & 18)
		threadCreation2 t2 = new threadCreation2();
		Thread t = new Thread(t2);
		
		System.out.println("Entered main thread function...\n");
		t.start();
		System.out.println("Exit main thread function...");

	}

}
