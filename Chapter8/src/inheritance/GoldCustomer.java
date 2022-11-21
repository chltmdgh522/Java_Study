package inheritance;

public class GoldCustomer extends Customer{

	public GoldCustomer(int customerID, String customerName) //처음에 고객이 생성이 되면 아래와 같이 지정함. 
	{
		//super(); 본인의 상위클래스를 가르침 pre 컴파일단계에서 들어감 디폴트 생성자(내가 여기를 디폴트로 해났을떄.) 
		super(customerID,customerName); //명시적으로 불러야함
		customerGrade="Gold";
		bonusRatio=0.05;
		
	}
	
	@Override
	public int calcPrice(int price) {
		
		return  calcPrice(price);
	}

	
	
	

}
