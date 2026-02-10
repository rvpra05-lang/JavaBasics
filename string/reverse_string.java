package string;

public class reverse_string 
{
	public static void main(String[] args) {
		
	
	String a="Testing";
	String output="";
	for(int i=a.length()-1;i>=0;i--)
	{
		char c=a.charAt(i);
		output=output+c;
		//System.out.println(output); print outside loop
	}
	System.out.println(output);
	
	
	
	
	}
	
	
	
	
	
	
	

}
