package dongsu;

import java.util.Random;

public class gimal6 {

	public static void main(String[] args) {
		String insa;
		insa = getGreeting();
		System.out.println(insa);
		

	}
	public static String getGreeting() {
		Random rand = new Random();
		int i;
		i = rand.nextInt(3);
		
		switch (i) {
		case 0 :
			return "오늘도 수고하십시오";
		case 1 :
			return "안녕하세요";
		case 2 :
			return "좋은 아침입니다";
			default :
				return null;
		}
	}

}
