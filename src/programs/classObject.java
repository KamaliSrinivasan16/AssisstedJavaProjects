package programs;

public class classObject 
{
	String name;
	int age;
	String job;
	
	public classObject(String name,int age,String job)
	{
		this.name = name;
		this.age = age;
		this.job = job;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String getJob()
	{
		return job;
	}
	
	public String toString()
	{
		return("Hi, I am "+this.getName()+". My age is "+this.getAge()+". My job is "+this.getJob());
	}

	public static void main(String[] args) 
	{
		classObject c = new classObject("Scooby",26,"trainer");
		System.out.println(c.toString());

	}

}
