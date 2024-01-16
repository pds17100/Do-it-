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
		System.out.println("지하철" + lineNumber + "번의 승객은" +
	passengersCount + "이고, 수입은" + money + "입니다.");
	}
}
