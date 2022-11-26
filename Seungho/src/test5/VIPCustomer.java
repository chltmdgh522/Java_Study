package test5;

public class VIPCustomer extends Customer {

    int agentID;
    double saleRatio = 0.1;

    public VIPCustomer(String custmerName, int custmerID, int agentID) {
        super(custmerName, custmerID);
        grade = "VIP";
        bonusRatio = 0.05;
        this.agentID = agentID;

    }

    public int calc(int price) {

        bonusPoint = (int) (price * bonusRatio);


        return price - (int) (price * saleRatio);
    }


    public String show() {

        return super.show() + "담당 상담원의 아이디는" + agentID + "입니다.";
    }


}
