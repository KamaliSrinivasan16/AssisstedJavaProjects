package programs;
import java.util.Scanner;

public class linearSearch 
{
    //main function
	public static void main(String[] args) 
	{
		int[] arr = {6,2,9,4,3,5,8,1,7,0};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value to be searched: \n");
		int key = sc.nextInt();
		sc.close();
		
		boolean flag = false;
		
		//linear search to find the key
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				flag = true;
				System.out.println("\nelement "+key+" is found at index "+i);
			}
		}
		if(flag==false)
		{
			System.out.println("\nelement not found ");
		}

	}

}
