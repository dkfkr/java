package sub5;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {
	
	public static void main(String[] args) {
		
	 Date date = new Date();
	 System.out.println("date : " + date);
		
	 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
	 String result = sdf.format(date);
	 
	 System.out.println("result : " + result);
	 
	 // Calendar 클래스
	 Calendar cal = Calendar.getInstance();
	 
	 int year = cal.get(Calendar.YEAR);
	 int month = cal.get(Calendar.MONTH) + 1;
	 int d = cal.get(Calendar.DATE);
	 int hour = cal.get(Calendar.HOUR);
	 int min = cal.get(Calendar.MINUTE);
	 int sec = cal.get(Calendar.SECOND);
		
	 System.out.printf("%d-%d-%d %d:%d:%d", year, month, d, hour, min, sec);
	 
	 
	}
}
