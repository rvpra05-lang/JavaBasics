package Module1.Programs;

import java.util.Date;

public class Date_prog 
{
	public static void main(String[]args)
	{
		Date d=new Date();
		long d1=d.getTime();
		System.out.println(d1);
		Date d2=new Date(d1);
		System.out.println(d2);
		String s=d2.toString();
		System.out.println("String="+s);
		String date=s.substring(8, 10);
		System.out.println(date);
		String month=s.substring(4, 7);
		System.out.println(month);
		String year=s.substring(s.length()-4);
		System.out.println(year);
		String format1=date+"."+month+"."+year;
		System.out.println(format1);
		String format2=date+"/"+month+"/"+year;
		System.out.println(format2);
		
		
		
		
		
		
		
	}

}
