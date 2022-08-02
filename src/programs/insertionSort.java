package programs;

import java.util.Scanner;

public class insertionSort 
{
	public static void sort(int[] arr,int n)
	{
		int key,j;
		for(int i=1;i<n;i++)
		{
			j=i-1;
			key = arr[i];
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
			
			//to display the sorting process
			System.out.println("Step: "+(i));
			for(int x: arr)
			{
				System.out.print(x+" ");
			}
			System.out.println("\n");
		}
	}

	public static void main(String[] args) 
	{
		//user-input
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
				
				System.out.println("\nInsertion Sort: \n");
				sort(arr,n);
				
				//to print sorted array
				System.out.println("Sorted Array: \n");
				for(int x: arr)
				{
					System.out.print(x+" ");
				}

	}

}
