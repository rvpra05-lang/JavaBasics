package Module1.Programs;

public class Method_overloading 
{
	static void add(int a,int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	static void add(double a,double b)
	{
		double sum=a+b;
		System.out.println(sum);
	}
	void sub(int a,int b)
	{
		int minus=a-b;
		System.out.println(minus);
		
	}
	public static void main(String []args)
	{
		add(10,20);
		add(2.4,3.6);
		Method_overloading m1=new Method_overloading ();
		m1.sub(5,3);
	}

}
