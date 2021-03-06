package cal;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Cal {

	public static void main(String[] args) {
//		Calendar cal = new GregorianCalendar(1994, 04, 28);
//		Date date = new Date(cal.getTimeInMillis());
//		
//		SimpleDateFormat f = new SimpleDateFormat("yyyy년 MM월 dd일");
//		
//		System.out.println(f.format(date));
		
		Calendar cal = new GregorianCalendar(1994, 04, 28);
		System.out.println(cal.getTimeInMillis());
//		Date date = new Date(cal.getTimeInMillis());
//		System.out.println(date);
		Calendar now = Calendar.getInstance();
		
		
		long day = now.getTimeInMillis() - cal.getTimeInMillis();
		
		SimpleDateFormat f = new SimpleDateFormat("yyyy년 MM월 dd일");
		
		System.out.println(day);
		System.out.println(day/1000+"초");
		System.out.println(day/1000/60+"분");
		System.out.println(day/1000/60/60+"시");
		System.out.println(day/1000/60/60/24+"일");
		System.out.println(day/1000/60/60/24/30+"월");
		System.out.println(day/1000/60/60/24/30/12+"년");
//		System.out.println(f.format(date));
//		System.out.println(day);
	}

}
