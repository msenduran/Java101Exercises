import java.util.*;
public class InsertionSort
{
	public static void main (String []args)
	{
		Scanner keyboard= new Scanner(System.in);
		int length=0;

		System.out.println("How many inputs will be there?:");
		length= keyboard.nextInt();
		int Array1[]=new int [length];

		for(int i=0;i<Array1.length;i++)
		{
			System.out.println("Please enter the "+(i+1)+". value:");
			Array1[i]=keyboard.nextInt();
		} 

		for(int i=0;i<Array1.length;i++)
		{
			for(int a=i;a>=0;a--)
			{
			if(a+1!=Array1.length)
			if(Array1[a]>Array1[a+1])
				{
					int temp=Array1[a];
					Array1[a]=Array1[a+1];
					Array1[a+1]= temp;
				}
			}
		}
		System.out.println("The sorted numbers:");

		for(int i=0;i<Array1.length;i++)
		{
			System.out.print(Array1[i]+" ");
		}


	}
}