package day23;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo7 {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		parseDatetoString(date);
		
		String d = "2013-01-13";
		System.out.println(d);
		try {
			parseStringtoDate(d);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
	}
	public static void parseDatetoString(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat();
		String formattedDate= sdf.format(date);
		System.out.println(formattedDate);
	}
	public static void parseStringtoDate(String d) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date =sdf.parse(d);
		System.out.println(date);
	}
}
