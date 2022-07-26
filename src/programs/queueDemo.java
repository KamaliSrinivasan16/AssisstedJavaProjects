package programs;
import java.util.*;

public class queueDemo 
{
    //main function
	public static void main(String[] args) 
	{
		Queue<String> days = new LinkedList<>();
		//creating a queue
		days.add("Monday");
		days.add("tuesday");
		days.add("wednesay");
		days.add("thursday");
		days.add("friday");
		days.add("saturday");
		days.add("sunday");
		
		//queue operations
		System.out.println("Days of the week :\n"+days+"\n");
		System.out.println("no of days in a week: \n"+days.size()+"\n");
		
		System.out.println("head : "+days.peek());
		days.remove();
		System.out.println("after removing head: "+days);

	}

}
