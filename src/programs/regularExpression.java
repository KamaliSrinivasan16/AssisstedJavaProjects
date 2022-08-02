package programs;
import java.util.regex.*;

public class regularExpression {

	public static void main(String[] args) {
		String a = "[0-9]+";
		String b = "Mango123";
		
		Pattern p = Pattern.compile(a);
		Matcher m = p.matcher(b);
		
		while(m.find())
		{
			System.out.println(b.substring(m.start(), m.end()));
		}

	}

}
