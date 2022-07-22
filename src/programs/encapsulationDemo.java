package programs;

class employee
{
	private int Id;
	private String Role;
	private long Salary;
	
	public int getId()
	{
		return Id;
	}
	
	public String getRole()
	{
		return Role;
	}
	
	public long getSalary()
	{
		return Salary;
	}
	
	public void setId(int a)
	{
		Id=a;
	}
	
	public void setRole(String b)
	{
		Role=b;
	}
	
	public void setSalary(long c)
	{
		Salary=c;
	}
	
}
public class encapsulationDemo 
{

	public static void main(String[] args) 
	{
		employee e = new employee();
		e.setId(165);
		e.setRole("manager");
		e.setSalary(50000);
		
		System.out.println("Employee Details: \n");
		System.out.println("Id: "+e.getId());
		System.out.println("Role: "+e.getRole());
		System.out.println("Salary: "+e.getSalary());
		
		

	}

}
