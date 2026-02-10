package Module1.Programs;

public class Local_variable 
{
    void add()
	{
		int a=100;
		int b=200;
		System.out.println(a+b);
		
	}
	static void sub()
	{
		int a=2;
		int b=4;
		System.out.println(a-b);
	}
	public static void main(String[]args)
	{
		int a=3;
		int b=4;
		 Local_variable a1= new Local_variable();
		 a1.add();
		sub();
		System.out.println(a*b);
				
	}

}
