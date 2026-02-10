package Module1.Programs;

class launch_quit
{
	static void launch()
	{
		System.out.println("launch");
	}
}

public class Inheritance_login_to_amazon extends launch_quit
{
	public static void test_data()
	{
		System.out.println("test data");
	}
	public static void main(String[]args)
	{
		test_data();
		launch();
		
	}
	
}