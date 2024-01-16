package example;

public class Student {
	String studentName;
	int money;
	int grade;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		money -= 1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1500);
		money -= 1500;
	}
	
	public void showInfo() {
		System.out.println(studentName + "�� ���� ����" + money + "�Դϴ�.");
	}
	
}
