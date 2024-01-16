package dongsu;

import java.util.Random;

public class gimal3 {

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
			return "æ»≥Á";
		case 1 :
			return "«œ¿Ã";
		case 2 :
			return "«Ô∑Œ";
			default :
				return null;
		}
		
	}

}
