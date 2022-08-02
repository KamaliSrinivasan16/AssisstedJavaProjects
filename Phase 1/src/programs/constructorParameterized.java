package programs;

//parameterized constructor
class studentDetail
{
	int studentId;
	String studentName;
	
	studentDetail(int i,String n)
	{
		studentId = i;
		studentName = n;
	}
	//display function
	void display()
	{
		System.out.println(studentId+" "+studentName);
	}
}
public class constructorParameterized {

	//main function
	public static void main(String[] args) 
	{
		studentDetail s1 = new studentDetail(16,"Rakshitha");
		studentDetail s2 = new studentDetail(30,"Rakshan");

		s1.display();
		s2.display();

	}

}
