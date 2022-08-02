package programs;

public class polymorphismDemo 
{
    public int sum(int a,int b)
    {
    	return (a+b);
    }
    
    public int sum(int a,int b,int c)
    {
    	return (a+b+c);
    }
    
    public double sum(double a,double b)
    {
    	return (a+b);
    }
	
    //main function
	public static void main(String[] args) 
	{
		polymorphismDemo p = new polymorphismDemo();
		
		System.out.println("sum: "+p.sum(57,69)+"\n");
		System.out.println("sum: "+p.sum(7,6,2)+"\n");
		System.out.println("sum: "+p.sum(5.9,4.8)+"\n");
		
	}

}
