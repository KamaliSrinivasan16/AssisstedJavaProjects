package programs;

import java.util.Arrays;
import java.util.Scanner;

public class exponentialSearch 
{
	public static int search(int[] arr,int n,int key)
	{
		if(arr[0]==key)
		{
			return 0;
		}
		int i =1;
		while(i>0 && arr[i]<=key)
		{
			i = i*2;
		}
		return Arrays.binarySearch(arr, i/2, Math.min(i, n-1), key);
	}

	public static void main(String[] args) 
	{
		int[] arr = {6,2,9,4,3,5,8,1,7,0};
		Arrays.sort(arr);
		int n = arr.length;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value to be searched: ");
		int key = sc.nextInt();
		int ans = search(arr,n,key);
		
		if(ans>0)
		{
			System.out.println("\nElement found at index "+ans);
		}
		else
		{
			System.out.println("\nElement not found");
		}
		
		sc.close();

	}

}
