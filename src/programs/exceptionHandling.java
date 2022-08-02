package programs;

@SuppressWarnings("serial")
class invalidException2 extends Exception
{
	String s1;
	invalidException2(String s)
	{
		s1=s;
	}
	public String toString()
	{
		return("error: "+s1);
	}
}

public class exceptionHandling {

	public static void main(String[] args) 
	{
		try
		{
			System.out.println("block starts..\n");
			throw new invalidException2("--Error message--");
		}
		catch(invalidException2 e)
		{
			System.out.println("catch block\n");
			System.out.println(e);
		}

	}

}
