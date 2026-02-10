package string;

public class string_functions 
{
	public static void main(String[]args)
	{
		String a="Automation Testing";
		int b=a.length();
		System.out.println(b);
		String c=a.toUpperCase();
		System.out.println(c);
		String d=a.toLowerCase();
		System.out.println(d);
		boolean e=a.equals("abc");
		System.out.println(e);
		boolean f=a.equalsIgnoreCase("automation testing");
		System.out.println(f);
		boolean g=a.contains("Testing");
		System.out.println(g);
		String h=a.concat("batch 63");
		System.out.println(h);
		char i=a.charAt(2);
		System.out.println(i);
		int j=a.indexOf('T');
		System.out.println(j);
		String k=a.substring(2);
		System.out.println(k);
		String l=a.substring(0, 11);
		System.out.println(l);//it will execute from index 0 to (n-1) means 10
		
		
	}

	
	

}
