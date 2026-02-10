package Module1.Programs;

public class Final_variable 
{
	final static double pivalue= Math.PI;
	static void area_of_circle()
	{
		int r=10;
		double area=pivalue*r*r;
		System.out.println(area);
	}
	public static void main(String[]args)
	{
		area_of_circle();
		
	}
			

}
