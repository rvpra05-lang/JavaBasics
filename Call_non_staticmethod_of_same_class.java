package Module1.Programs;

public class Call_non_staticmethod_of_same_class 
{

	void add()
	{
		System.out.println("addition");
	}
	void sub()
	{
		System.out.println("subtraction");
	}
	public static void main(String[]args)
	{
		Call_non_staticmethod_of_same_class a1=new Call_non_staticmethod_of_same_class();
		a1.add();
		a1.sub();
	}
}
