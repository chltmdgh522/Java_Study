package study8inheritance;

public class VIPCustomer extends Customer {
    double saleRatio;
    int agentID;

    public int getAgentID() {
        return agentID;
    }



    public VIPCustomer(int customerID, String customerName, int agentID) {
        super(customerID, customerName);
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        this.agentID = agentID;
    }

    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int) (price * saleRatio);
    }

    @Override
    public String show() {
        return super.show()+"담당 상담원의 아이디는" + agentID+"입니다.";
    }
}

