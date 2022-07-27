package programs;

import java.util.Arrays;
import java.util.Scanner;

public class binarySearch 
{
	//binary search of element in an array
    public static boolean search(int[] arr,int key)
    {
    	boolean flag = false;
		int start = 0;
		int end = arr.length-1 ;
		int mid =0;
		
    	while(start<=end)
		{
			mid = (start+end)/2;
			if(arr[mid] == key)
			{
				flag = true;
				break;
			}
			else if(arr[mid]<key)
			{
				start = mid+1;
			}
			else
			{
				end = mid-1;
			}
		}
    	return flag;
    }
    
    //main function
	public static void main(String[] args) 
	{
		int[] arr = {6,2,9,4,3,5,8,1,7,0};
		Arrays.sort(arr);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value to be searched: ");
		int key = sc.nextInt();
		boolean ans = search(arr,key);
		
		if(ans)
		{
			System.out.println("\nElement found");
		}
		else
		{
			System.out.println("\nElement not found");
		}
		sc.close();
	}

}
