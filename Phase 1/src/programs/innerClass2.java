package programs;

public class innerClass2 {

	//inner class
	void display()
	{
		class inner2
		{
			void show()
			{
				System.out.println("inner class");
			}
		}
		
		inner2 i2 = new inner2();
		i2.show();
	}
	
	//main function
	public static void main(String[] args) {
		innerClass2 obj= new innerClass2();
		obj.display();

	}

}
