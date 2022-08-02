package programs;

public class stackDemo 
{
	final static int MAX =100;
    int top;
    int[] a = new int[MAX];
    
    //constructor
    stackDemo()
    {
    	top =-1;
    }
    
    //to find whether stack is empty
    boolean isEmpty()
    {
    	return (top<0);
    }
    
    //push an element
    void push(int x)
    {
    	if(top>MAX)
    	{
    		System.out.println("stack overflow");
    	}
    	else
    	{
    		a[++top]=x;
    		System.out.println("pushed : "+x);
    	}	
    }
    
    //pop an element
    void pop()
    {
    	if(top<0) 
    	{
    		System.out.println("stack underflow");
    	}
    	else
    	{
    		int x = a[top--];
    		System.out.println(" popped : "+x);
    	}
    }
    
    //main function
	public static void main(String[] args) 
	{
		stackDemo s = new stackDemo();
		
		System.out.println("At begining: stack empty is : "+s.isEmpty()+"\n");
		
		s.push(5);
		s.push(10);
		s.push(15);
		s.pop();
		s.push(20);
		
		System.out.println("\nAt end: stack empty is : "+s.isEmpty()+"\n");	

	}

}
