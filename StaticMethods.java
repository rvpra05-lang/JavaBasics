package Module1.Programs;

public class StaticMethods 
{
	public static void main(String []args)
	{
		System.out.println("main method");
		add();
		sub();
	}
	static void add()
	{
		int a=10;
		int b=20;
		int add=a+b;
	  System.out.println(add);
	  
	}
	static void sub()
	{
		int a=10;
		int b=20;
		int sub=b-a;
		System.out.println(sub);
	}

}
