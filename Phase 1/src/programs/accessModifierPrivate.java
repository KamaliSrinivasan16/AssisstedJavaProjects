package programs;

public class accessModifierPrivate {
	
	private static void privateDisplay()
	{
		System.out.println("private access modifier");
	}
	
	static void defaultDisplay()
	{
		System.out.println("default access modifier");
	}
	
	protected void protectDisplay()
	{
		System.out.println("protected access modifier");
	}
	
	public static void publicDisplay()
	{
		System.out.println("public access modifier");
	}
	
	public static void main(String[] args) {
		
        privateDisplay();
	}

}
