package example;

public class TakeTrain {

	public static void main(String[] args) {

		Student pds = new Student("pds", 5000);
		Student pgs = new Student("pds", 5000);
		
		Bus bus200 = new Bus(200);
		pds.takeBus(bus200);
		pds.showInfo();
		bus200.showInfo();
	}

}
