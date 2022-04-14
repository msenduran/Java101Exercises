import java.util.*;
public class StatementExercise1
{
	public static void main(String [] args)
	{
		Scanner keyboard= new Scanner(System.in);

		double input=0;

		System.out.println("Please enter a value:");

		input = keyboard.nextDouble();

		System.out.println(input<1000?(input*(118.0/100.0)):(input*(108.0/100.0)));


	}
}