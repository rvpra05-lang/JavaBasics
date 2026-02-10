package string;

import java.util.Arrays;

public class string_methods 
{
	public static void main(String[]args)
	{
		String s="this is cat";
		
		String st=s.trim();
		System.out.println(st);
		  System.out.println(s.replace("t", "d"));
		System.out.println( s.replaceAll("[a-z]", "a"));
		System.out.println(s.split(""));
		System.out.println(s.matches("....."));
		String s1="spiderman";
		System.out.println(s1.matches("(.*)man(.*)"));
		String[] sp=s.split(" ");
		System.out.println(Arrays.toString(sp));
		String[] sp1=s.split(" ",2);
		System.out.println(Arrays.toString(sp1));
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
