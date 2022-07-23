package programs;
import java.io.FileWriter;
import java.io.IOException;

public class fileHandlingUpdate 
{
    //main function
	public static void main(String[] args) 
	{
		try
		{
			FileWriter obj = new FileWriter("D:\\\\Mphasis\\\\Java assisted projects\\\\file1.txt",true);
			obj.write(" Welcome to JAVA ");
			obj.close();
			System.out.println("file is updated..");
		}
		catch(IOException e)
		{
			System.out.println("error occured: ");
			e.getMessage();
		}

	}

}
