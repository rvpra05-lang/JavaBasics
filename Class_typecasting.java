package Module2_Inheritance;

class google2
{
	void login()
	{
		System.out.println("login to google");
	}
	void logout()
	{
		System.out.println("logout from google");
		
	}
}


public class Class_typecasting extends google2
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
		google2 m1=(google2)new Class_typecasting ();//upcasting
		m1.login();
		m1.logout();
		Class_typecasting m2=(Class_typecasting)m1;//downcasting
		m2.add();
		m2.sub();
		
		
	
	
	
	}
	

}
