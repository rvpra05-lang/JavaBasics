package Module1.Programs;

public class AmazonLogin_Constructor 
{
	AmazonLogin_Constructor(long mobile)
	{
		System.out.println("login using mobile");
		
	}
	AmazonLogin_Constructor(String emailid)
	{
		System.out.println("login through emailid");
	}
	
	public static void main(String[]args)
	{
		AmazonLogin_Constructor c1=new AmazonLogin_Constructor (1234567890);
		AmazonLogin_Constructor c2=new AmazonLogin_Constructor ("ravi@gmail.com");
		new AmazonLogin_Constructor (1234567890);
		new AmazonLogin_Constructor ("ravi@gmail.com");
	}

}
