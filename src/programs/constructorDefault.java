package programs;

//default constructor
class studentDetails
{
	int studentId;
	String studentName;
	
	//display function
	void display()
	{
		System.out.println(studentId+" "+studentName);
	}
}
public class constructorDefault {

	//main function
	public static void main(String[] args) 
	{
		studentDetails s1 = new studentDetails();
		studentDetails s2 = new studentDetails();

		s1.display();
		s2.display();
	}

}
