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
			return "���õ� �����Ͻʽÿ�";
		case 1 :
			return "�ȳ��ϼ���";
		case 2 :
			return "���� ��ħ�Դϴ�";
			default :
				return null;
		}
	}

}
