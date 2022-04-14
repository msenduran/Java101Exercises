import java.util.*;
public class UserLogin
{
	public static void main(String [] args)
	{
		Scanner keyboard= new Scanner(System.in);

		String name="",password="",inp1="",inp2="";
		System.out.println("Please register before you login!");
		System.out.print("Please type your userName: ");
		name= keyboard.nextLine();
		System.out.print("Please type your passWord: ");
		password= keyboard.nextLine();
		System.out.println("Succesfully registered!");
		
		boolean state=true;

		while(state){

		System.out.println("Please enter your nickName:");
		if(keyboard.nextLine().equals(name))
		{
			System.out.println("Please enter your passWord:");
			if(keyboard.nextLine().equals(password))
			{
				System.out.println("Welcome!!!");
				state= false;
			}
			else state=true;
		}
		else state=true;

	}

	}
}