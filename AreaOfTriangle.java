import java.util.*;
public class AreaOfTriangle
{
	public static void main (String []args)
	{
		Scanner keyboard= new Scanner(System.in);

		double edge1=0, edge2=0,edge3=0,perimeter=0 ,semiPerimeter=0,Area2=0;

		System.out.println("Please enter the edges of a Triangle in order:");

		edge1= keyboard.nextDouble();
		edge2= keyboard.nextDouble();
		edge3= keyboard.nextDouble();

		perimeter= edge1+edge2+edge3;

		semiPerimeter=perimeter/2.0;

		//Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)

		Area2= semiPerimeter*(semiPerimeter-edge1)*(semiPerimeter-edge2)*(semiPerimeter-edge3);

		System.out.println("√"+Area2);
	}

}