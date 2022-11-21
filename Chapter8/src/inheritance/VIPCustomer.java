package inheritance;

public class VIPCustomer extends Customer{

	private double saleRatio;
	private int agentID;

	
	public VIPCustomer(int customerID, String customerName, int agentID) //처음에 고객이 생성이 되면 아래와 같이 지정함. 
	{
		//super(); 본인의 상위클래스를 가르침 pre 컴파일단계에서 들어감 디폴트 생성자(내가 여기를 디폴트로 해났을떄.) 
		super(customerID,customerName); //명시적으로 불러야함
		customerGrade="VIP";
		bonusRatio=0.05;
		saleRatio=0.1;      
		this.agentID=agentID;
	}
	public int calcPrice(int price) {
		
		bonusPoint +=price*bonusRatio;
		
		return price - (int)(price*saleRatio);
	}


	public int getAgentID() {
		return agentID;
	}// agentID를 바꾸는것을 제공하지 않기 위해서 씀 
	
	
		
}


