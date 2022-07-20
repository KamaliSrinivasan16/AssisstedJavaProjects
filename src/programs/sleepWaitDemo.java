package programs;

public class sleepWaitDemo 
{
    //object creation
	public static Object o = new Object();
	
	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("Inside main thread function...\n");
		
		Thread.sleep(2000);
		
		System.out.println("Thread "+Thread.currentThread().getName()+" is woken after sleeping for 2 sec \n");
		
		//synchronized context
		synchronized(o)
		{
			o.wait(3000);
			
			System.out.println("object"+o+" is woken after waiting for 3 sec");
			
		}

	}

}
