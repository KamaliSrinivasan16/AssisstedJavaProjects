package programs;
import java.io.File;
import java.io.IOException;

public class fileHandlingCreate 
{
    //main function
	public static void main(String[] args) 
	{
		//creating a file
		try
		{
			File obj = new File("D:\\Mphasis\\Java assisted projects\\file1.txt");
			if(obj.createNewFile())
			{
				System.out.println("file is created");
				System.out.println(obj.getName());
			}
			else
			{
				System.out.println("file already exist");
			}
		}
		catch(IOException e)
		{
			System.out.println("error occured");
			e.getMessage();
		}
		
		

	}

}
