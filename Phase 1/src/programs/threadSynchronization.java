package programs;

class ticket
{
	//function to be executed synchronize
	public void bill(int a)
	{
		System.out.println("\tTicket no: "+a+"\n");
		try
		{
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			System.out.println("Payment pending");
		}
		System.out.println("hey tck no: "+a+".. enjoy your movie..\n");
	}
}

class payment extends Thread
{
	//initialization 
	Thread t;
	int num;
	ticket tkt;
	
	//constructor
	payment(int a,ticket tk)
	{
		num = a;
		tkt = tk;
	}
	
	@Override
	public void run()
	{
		synchronized(tkt)
		{
			tkt.bill(num);
		}
	}
	
}
public class threadSynchronization 
{
    //main function
	public static void main(String[] args) 
	{
		ticket t = new ticket();
		
		payment p1 = new payment(250, t);
		payment p2 = new payment(260,t);
		
		p1.start();
		p2.start();
		
		try
		{
			p1.join();
			p2.join();
		}
		catch(Exception e1)
		{
			System.out.println("Interrupted");
		}

	}

}
