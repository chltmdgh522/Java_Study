package witharraytest;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		
		ArrayList<Customer> customerlist=new ArrayList<Customer>();
		
		Customer Moon=new Customer(1,"문홍욱");
		
		VIPCustomer Kim=new VIPCustomer(2,"김용현",11);
	
		GoldCustomer Choi=new GoldCustomer(3,"최승호");
	
		GoldCustomer Lee=new GoldCustomer(4,"이민수");
		
		Customer Jang=new Customer(5,"장유성");

		
	
		
		customerlist.add(Kim);
		customerlist.add(Moon);
		customerlist.add(Choi);
		customerlist.add(Lee);
		customerlist.add(Jang);
		
		System.out.println("======고객정보 출력=======");
		
		for(Customer customer: customerlist) {
			System.out.println(customer.show());
			
		}
		
		System.out.println("======할인율과 포인트결과=======");
		
		int price=10000;
		for(Customer customer: customerlist) {
			int cost=customer.calcPrice(price);
			
			System.out.println(cost+"지불하셨습니다.  "+customer.show());
			
		}


	}

}
