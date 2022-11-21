package interface1;

public class TwoTest {

	public static void main(String[] args) {
		Customer cust=new Customer();
		Buy buy = cust;
		buy.buy();
		
		Sell sell=cust;
		sell.sell();
		
		cust.order();
		buy.order();
		sell.order();
	}

}
