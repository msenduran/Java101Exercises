//this program will calculate average for 8 numbers
import java.util.*;
public class AverageWithoutIfElse{
	public static void main (String [] args){
		Scanner keyboard= new Scanner (System.in);

double num1=0,num2=0,num3=0,num4=0,num5=0,num6=0,num7=0,num8=0,average=0;

	System.out.println("Please enter 1st num:");
	num1= keyboard.nextInt();

	System.out.println("Please enter 2nd num:");
	num2= keyboard.nextInt();

	System.out.println("Please enter 3rd num:");
	num3= keyboard.nextInt();


	System.out.println("Please enter 4th num:");
	num4= keyboard.nextInt();


	System.out.println("Please enter 5th num:");
	num5= keyboard.nextInt();


	System.out.println("Please enter 6th num:");
	num6= keyboard.nextInt();


	System.out.println("Please enter 7th num:");
	num7= keyboard.nextInt();


	System.out.println("Please enter 8th num:");
	num8= keyboard.nextInt();


	average=(num1+num2+num3+num4+num5+num6+num7+num8)/(8.0);

	System.out.println("Average="+average);

	//program will give response pass if average is > 50 else it will say fail;


	System.out.println(average <50 ? "Fail" : "Pass" );


}
}