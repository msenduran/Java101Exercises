import java.util.*;
public class SimpleCalculator
{
	public static void main (String [] args)
	{
		Scanner keyboard= new Scanner(System.in);
		double inp1=0,inp2=0;
		int choice=0;

		System.out.println("Please enter 2 values and then select the operation that you want\n");
		System.out.println("Please enter the first value:");
		inp1= keyboard.nextInt();
		System.out.println("Please enter the second value:");
		inp2= keyboard.nextInt();
		System.out.println("Please select the operation:\ntype (1) for addition \ntype (2) for extraction\ntype (3) for multiplication\ntype (4) division");
		
		boolean state= true;

		while(state){
			choice= keyboard.nextInt();

		switch(choice)
		{
		case 1:
			System.out.println(inp1+inp2);
			state=false;
			break;
		case 2:
			System.out.println(inp1-inp2);
			state=false;
			break;
		case 3: 
			System.out.println(inp1*inp2);
			state=false;
			break;
		case 4:
			System.out.println(inp1/inp2);
			state=false;
			break;
		default:
			state=true;
			System.out.println("Wrong value!");
		}
	}


	}
}