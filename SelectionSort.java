import java.util.*;

//This simple program will sort the elements by usig SelectionSort
public class SelectionSort
{
	private static int min=0;
	private static int temp=0;

	public static int[] SortBySelection(int array[])
	{
		for(int i=0;i<array.length;i++)
		{
			min=array[i];
			
			//this for loop will find the min value of the array
			for(int a=i;a<array.length;a++)
			{
				if(array[a]<min)
				{
					min=array[a];
					temp=a;
				}
			}

			array[temp]=array[i];

			array[i]=min;

		}
		return array;
	}


	public static void main(String [] args)
	{
		int array1[]= {12,21,4,1432,65412,11,7654,65};

	
		int newArray[]= Arrays.copyOfRange(SortBySelection(array1),0,(array1.length));

		for(int i=0;i<array1.length;i++)
		{
			System.out.print(newArray[i]+" ");
		}

	}
}