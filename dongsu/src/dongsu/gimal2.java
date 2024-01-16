package dongsu;

import java.text.SimpleDateFormat;
import java.util.Date;

public class gimal2 {
	public static void main(String[] args) {
		System.out.println(showClock());//showClock메서드호출
		
	}
	public static String showClock() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");//
		return sdf.format(date);//날짜를뺀현재시각return
	}
}
