package programs;

//anonymous inner class
abstract class anonymous
{
	public abstract void display();
}
public class innerClassAnonymous {

	//main function
	public static void main(String[] args) {
		anonymous a = new anonymous(){
			public void display()
			{
				System.out.println("Anonymous inner class");
			}
		};
		a.display();
		
	}

}
