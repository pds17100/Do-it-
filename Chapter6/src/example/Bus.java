package example;

public class Bus {
	int busNumber;
	int passengersCount;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
		this.money = money;
		passengersCount++;
	}
	
	public void showInfo() {
		System.out.println("����" + busNumber + "���� �°���" +
	passengersCount + "�̰�, ������" + money + "�Դϴ�.");
	}
}
