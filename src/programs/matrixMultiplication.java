package programs;

public class matrixMultiplication 
{
	//matrix multiplication
	public static int[][] multiplymatrix(int[][] arr1,int[][] arr2,int r1,int c1,int c2)
    {
    	int[][] result = new int[r1][c2];
    	
    	for(int i=0;i<r1;i++)
    	{
    		for(int j=0;j<c2;j++)
    		{
    			for(int k=0;k<c1;k++)
    			{
    				result[i][j] += arr1[i][k] * arr2[k][j];
    			}
    		}
    	}
    	return result;
    }

	//displaying the resultant array
	public static void displayResult(int[][] result)
	{
		System.out.println("Resultant matrix : \n");
		
		for(int[] row: result)
		{
			for(int column : row)
			{
				System.out.print(column+" ");
			}
			System.out.println();
		}
	}
	
	//main function
	public static void main(String[] args) 
	{
		int r1 = 2,c1 =2,r2 = 2,c2 =2;
		int[][] arr1 = {{5,3},{4,2}};
		int[][] arr2 = {{3,7},{-1,6}};
		
		if(c2!=r2)
		{
			System.out.println("Invalid operation");
		}
		
		int[][] result = multiplymatrix(arr1,arr2,r1,c1,c2);
		displayResult(result);	}
	 
}
