package programs;

interface class1
{
	default void display()
	{
		System.out.println("class one");
	}
}

interface class2
 {
	 default void display()
		{
			System.out.println("class second");
		}
 }
public class diamondProblem implements class1,class2{

	//display function
	public void display()
	{
		class1.super.display();
		class2.super.display();
	}
	
	//main function
	public static void main(String[] args) 
	{
		diamondProblem d = new diamondProblem();
		d.display();

	}

}
