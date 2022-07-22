package programs;

import java.util.Scanner;


@SuppressWarnings("serial")
class invalidException extends Exception
{
	invalidException(String str)
	{
		super(str);
	}
}
public class customException {

	public static void validate(int age) throws invalidException
	{
		if(age<18)
		{
			throw new invalidException("you are not eligible to vote..\n");
		}
		else
		{
			System.out.println("you are eligible..\n");
		}
	}
	public static void main(String[] args) 
	{
		try
		{
			@SuppressWarnings("resource")
			Scanner s = new Scanner(System.in);
			System.out.println("enter your age: ");
			validate(s.nextInt());
		}
		catch(Exception e)
		{
			System.out.println("error: "+e.getMessage());
		}

	}

}
