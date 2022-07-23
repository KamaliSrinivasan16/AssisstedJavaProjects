package programs;
import java.io.File;

public class fileHandlingDelete 
{
    //main function
	public static void main(String[] args) 
	{
		File obj = new File("D:\\\\Mphasis\\\\Java assisted projects\\\\file1.txt");
		if(obj.delete())
		{
			System.out.println("file name: "+obj.getName());
			System.out.println("file is deleted..");
		}
		else
		{
			System.out.println("file can't be deleted..");
		}

	}

}
