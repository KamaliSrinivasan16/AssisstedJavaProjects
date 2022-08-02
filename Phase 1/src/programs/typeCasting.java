package programs;

public class typeCasting {

	public static void main(String[] args) {
		
		//implicit typeCasting:
		
		System.out.println("Implicit typecasting: ");
		char a = 'P';
		System.out.println("char : "+a);
		float b =a;
		double c=a;
		long d=a;
		
		System.out.println("float : "+b);
		System.out.println("double : "+c);
		System.out.println("long : "+d);
		
		//explicit typeCasting:
		
		System.out.println("explicit typecasting: ");
		System.out.println("char : "+a);
		float e =(float)a;
		double f=(double)a;
		long g=(long)a;
		
		System.out.println("float : "+e);
		System.out.println("double : "+f);
		System.out.println("long : "+g);
		
	}

}
