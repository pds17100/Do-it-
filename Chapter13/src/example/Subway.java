package example;

public class Subway {

	int lineNumber;
	int passangerCount;
	int money;
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.money = money;
		passangerCount++;
	}
	
	public void showInfo() {
		System.out.println("����ö" + lineNumber + "���� �°��� " + passangerCount + "���̰� ������" + money + "�Դϴ�.");
	}
}
