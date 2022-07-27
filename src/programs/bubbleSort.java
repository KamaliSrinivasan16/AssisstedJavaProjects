package programs;

import java.util.Scanner;

public class bubbleSort 
{
	//to sort the array
	public static void sort(int[] arr,int n)
	{
		int temp;
		for(int i = 0;i<n-1;i++)
		{
			for(int j =0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1]) 
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			//to display the sorting process
			System.out.println("Step: "+(i+1));
			for(int x: arr)
			{
				System.out.print(x+" ");
			}
			System.out.println("\n");
		}
	}

	//main function
	public static void main(String[] args) 
	{
		//user input
        System.out.println("enter no of elements: ");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		System.out.println("\nenter array elements: ");
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		sc.close();
		
		System.out.println("\nBubble Sort: \n");
		sort(arr,n);
		
		//to print sorted array
		System.out.println("Sorted Array: \n");
		for(int x: arr)
		{
			System.out.print(x+" ");
		}


	}

}
