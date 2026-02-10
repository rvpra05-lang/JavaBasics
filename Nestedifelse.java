package Module1.Programs;

public class Nestedifelse 
{
	public static void main(String[]args)
	{
		int age=12;
		char gender='f';
		if(gender=='m')
		{
			if(age>=18)
			{
				System.out.println("full ticket");
			}
			else
			{
				System.out.println("half ticket");
			}
				
		}
		else
		{
			System.out.println("other than male");
		}
	}
}
	