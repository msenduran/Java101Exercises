import java.util.*;
public class AreaOfCircle
{
	public static void main (String []args)
	{
		Scanner keyboard= new Scanner(System.in);
		double rad=0,area=0,pi=3.14,angle=0;
		System.out.println("Pleas enter the radious:");
		rad= keyboard.nextDouble();

		System.out.println("Please enter the angle in radious:");
		angle =keyboard.nextDouble();
		
		area=pi*rad*rad;
		angle=angle%360;
		System.out.println("Your circle clise has an area of:"+area*(angle/360));

	}
}