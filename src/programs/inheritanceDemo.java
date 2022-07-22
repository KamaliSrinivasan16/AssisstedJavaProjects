package programs;

//parent class
class parent
{
	void display1()
	{
		System.out.println("Properties: \n");
		System.out.println("house");
		System.out.println("rubber factory");
	}
	
}

//child class
class child extends parent
{
	void display2()
	{
		display1();                           //inherits the property of the parent
		System.out.println("rice mill");
		System.out.println("guest house");
		System.out.println("tea estate");
	}
	
}

public class inheritanceDemo 
{
    //main function
	public static void main(String[] args) 
	{
		child c = new child();
		c.display2();

	}

}
