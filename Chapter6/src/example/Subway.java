package example;

public class Subway {
	int lineNumber;
	int passengersCount;
	int money;
	
	public Subway(int lineNumber, int money) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
			this.money += money;
			passengersCount++;
		}
	
	public void showInfo() {
		System.out.println("����ö" + lineNumber + "���� �°���" +
	passengersCount + "�̰�, ������" + money + "�Դϴ�.");
	}
}
