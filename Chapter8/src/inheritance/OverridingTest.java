package inheritance;

public class OverridingTest {

	public static void main(String[] args) {
	/*	Customer customerLee = new Customer(100010, "LEE");
		int price = customerLee.calPrice(10000);
		System.out.println("지불 금액은" + price + "이고, " + customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer(100010, "Kim", 100);
		price = customerLee.calPrice(10000);
		System.out.println("지불 금액은" + price + "이고, " + customerKim.showCustomerInfo());
	*/
		
		Customer customerWho = new VIPCustomer(100010, "Who", 100);
		int price = customerWho.calPrice(10000);
		System.out.println("지불 금액은 " + price + "이고, " + customerWho.showCustomerInfo());
		
		Customer customerGold = new GoldCustomer();
		
		
	}

}
