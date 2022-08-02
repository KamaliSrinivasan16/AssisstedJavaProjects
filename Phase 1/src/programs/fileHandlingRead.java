package programs;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fileHandlingRead 
{
    //main function
	public static void main(String[] args) 
	{
		//read a file
		try
		{
			File obj = new File("D:\\Mphasis\\Java assisted projects\\file1.txt");
			Scanner sc = new Scanner(obj);
			while(sc.hasNextLine())
			{
				System.out.println(sc.nextLine());
			}
			sc.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("error occured: ");
			e.printStackTrace();
		}

	}

}
