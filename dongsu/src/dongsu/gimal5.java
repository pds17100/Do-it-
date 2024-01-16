package dongsu;

import java.text.SimpleDateFormat;
import java.util.Date;

public class gimal5 {

	public static void main(String[] args) {
		System.out.println(showClock());
		

	}
	public static String showClock() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		return sdf.format(date);
	}

}
