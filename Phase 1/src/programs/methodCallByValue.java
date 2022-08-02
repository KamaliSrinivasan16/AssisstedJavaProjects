package programs;

public class methodCallByValue {

	//initialize value of a
	int a = 30;
	
	//called method
	int operation(int a)
	{
		a = (a*5)-10;
		System.out.println("INSIDE METHOD: "+a);
		return(a);
	}
	
	//main function
	public static void main(String[] args) {
		methodCallByValue obj = new methodCallByValue();
		System.out.println("BEFORE CALLING: "+obj.a);
		obj.operation(50);
		System.out.println("AFTER CALLING: "+obj.a);
	}

}
