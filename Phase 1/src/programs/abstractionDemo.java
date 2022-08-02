package programs;

abstract class Animal 
{
	  abstract void name();

	  public void food() 
	  {
	    System.out.println("meat");
	  }
}

class Dog extends Animal 
{
	  //abstract method
	  public void name() 
	  {
	    System.out.println("Scoby");
	  }
}

public class abstractionDemo 
{
    //main function
	public static void main(String[] args) 
	{
		 Animal d1 = new Dog();

		 d1.name();
		 d1.food();

	}

}

