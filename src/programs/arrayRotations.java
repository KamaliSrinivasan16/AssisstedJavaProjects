package programs;

import java.util.Arrays;
import java.util.Scanner;

public class arrayRotations 
{
	//left rotation of an array
	public static void leftRotateArray(int[] arr,int r,int l)
	{
		while(r>0)
		{
			int temp = arr[0];
			for(int i=0;i<(arr.length-1);i++)
			{
				arr[i] = arr[i+1];
			}
			arr[arr.length-1]=temp;
			r--;
		}
	}
	
	//right rotation of an array
	public static void rightRotateArray(int[] arr, int r,int l)
	{
		
		r=l-r;
		while(r>0)
		{
			int temp = arr[0];
			for(int i=0;i<(arr.length-1);i++)
			{
				arr[i] = arr[i+1];
			}
			arr[arr.length-1]=temp;
			r--;
		}
		
	}
	
	//main function
	public static void main(String[] args) 
	{
		int[] arr = {4,5,1,2,3};
		int r = 3;  //number of rotations
	
		int l = arr.length;   //array length
		
		if(r<0)     //negative rotation
			return;
		if(r>l)     //no.of rotation  > array length
			r=r-l;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("for Right rotation: Press 0");
		System.out.println("for left rotation: Press 1 ");
		int a = sc.nextInt();
		sc.close();
		
		//printing output
		if(a == 0)
		{
			rightRotateArray(arr,r,l);
			 
			System.out.println("Right rotation: \n");
	        System.out.println(Arrays.toString(arr)+"\n");
		}
		else if(a == 1)
		{
			leftRotateArray(arr,r,l);
	    	
	        System.out.println("left rotation: \n");
	        System.out.println(Arrays.toString(arr)+"\n");
		}
		
	}


}
