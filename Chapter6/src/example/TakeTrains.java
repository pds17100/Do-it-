package example;

public class TakeTrains {

	public static void main(String[] args) {
		Student pds = new Student("pds", 3000);
		Student pgs = new Student("pgs", 2000);
	
		Bus bus200 = new Bus(200);
		pds.takeBus(bus200);
		pds.showInfo();
		bus200.showInfo();
	}

}
