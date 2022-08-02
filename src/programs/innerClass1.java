package programs;

public class innerClass1 {

	//inner class
	class inner1
	{
		void display()
		{
			System.out.println("inner class");
		}
	}
	
	//main function
	public static void main(String[] args) {
		innerClass1 obj= new innerClass1();
		innerClass1.inner1 i1 = obj.new inner1();
		i1.display();

	}

}
