package inheritance;

public class VIPCustomer extends Customer {

	  private int agentID;
	  double saleRatio;
	
	  public VIPCustomer()
	  {
		  customerGrade = "VIP";
		  bonusRatio = 0.05;
		  saleRatio = 0.1;
	  }
	  
	public VIPCustomer(int customerID, String customerName, int agentID)
	{
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
		
		//System.out.println("VIPCustomer(int, String) ȣ��");
	}
	
	public int calPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
	public int getAgentID() {
		return agentID;
	}


}
	
