package Module1.Programs;

import java.util.Scanner;
public class Scanner1_Class1 
{
	public static void main(String[]args)
	{
		System.out.println("write a number");
		Scanner a1=new Scanner(System.in);
		int a= a1.nextInt();
		System.out.println("write a string");
		String b=a1.next();
		System.out.println("write a boolean");
		boolean c=a1.nextBoolean();
	}

}
