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
		System.out.println("지하철" + lineNumber + "번의 승객은 " + passangerCount + "명이고 수입은" + money + "입니다.");
	}
}
