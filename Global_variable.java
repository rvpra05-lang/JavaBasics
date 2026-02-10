package Module1.Programs;

public class Global_variable 
{
	static int a=10;
    int b=20;
    static void add()
	{
		Global_variable a1=new Global_variable ();
		a1.b=20;
		System.out.println(a+a1.b);
		
	}
    void sub()
    {
    	System.out.println(b-a);
    }
	
	public static void main(String[]args)
	{
		
		add();
		Global_variable a2=new Global_variable ();
		a2.sub();
		
		
	
		
		
	}

}
