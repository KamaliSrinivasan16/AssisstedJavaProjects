package programs;

public class rangeQueries 
{
    //to calculate sum of the given range
	public static int sum(int[] arr,int n, int start, int end)
	{
		int sum =0;
		for(int i=start;i<=end;i++)
		{
			sum +=arr[i];
		}
		return sum;
	}
	
	//main function
	public static void main(String[] args) 
	{
	     int arr[] = { 3, 7, 2, 5, 8, 9 }; 
	     int n = arr.length; 
	       
	     System.out.println(sum(arr,n,0, 5)); 
	     System.out.println(sum(arr,n,3, 5)); 
	     System.out.println(sum(arr,n,2, 4)); 

			
	}
	
}
