package programs;

public class orderStatistics 
{
	//to sort the array
	public static void sort(int[] arr,int n)
	{
		int temp;
		for(int i=0;i<n-1;i++)
		{
			for(int j = i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
            
		}
	}
	
    //main function
	public static void main(String[] args) 
	{
        int arr[] = {12, 3, 5, 7, 4, 19, 26}; 
        int n = arr.length,k = 4; 
        sort(arr,n);
        System.out.println("K'th smallest element is "+ arr[k-1]); 

		

	}

}
