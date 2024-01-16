package inheritance;

public class Customer {

    protected int customerID; // protected는 상속관계에서 쓸수 있음 추가로 패키지가 달라도 쓸수 있음
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;
	
	/*public Customer() //처음에 고객이 생성이 되면 아래와 같이 지정함. 
	{
		//super(); 이 친구는 object클래스로 감 
		customerGrade="SILVER";
		bonusRatio=0.01;
	}*/

    public Customer(int customerID, String customerName) {
        this.customerID = customerID;
        this.customerName = customerName;
        customerGrade = "SILVER";
        bonusRatio = 0.01;
    }

    public int calcPrice(int price) {
        if (customerGrade == "SILVER") {
            bonusPoint += price * bonusRatio;
        }

        return price;
    }

    public String show() {
        return customerName + "님의 등급은" + customerGrade + " 입니다." + "  " + bonusPoint + "적립되었습니다.";
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }


}
