package Module1.Programs;

import java.util.Date;

public class Date_time_string
{
	public static void main(String[]args)
	{
		Date d1=new Date();
		System.out.println(d1.getTime());
		Date d2=new Date(d1.getTime());//Date d2=new Date(d1.getTime()+(1000*60*60*24*1));
		
		System.out.println(d2);
		System.out.println(d2);
		String full=d2.toString();
		String date=full.substring(8, 10);
		System.out.println(date);
		String month=full.substring(4, 7);
		System.out.println(month);
		String year=full.substring(full.length()-4);
		System.out.println("year");
		//write in a format dd/mm/yy
		String format1=date+"/"+month+"/"+year;
		System.out.println(format1);
		String format2=date.concat("-").concat(month).concat("-").concat(year);
		System.out.println(format2);
		
		
	}

}
