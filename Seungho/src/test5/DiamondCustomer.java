package test5;

public class DiamondCustomer extends Customer {

    double saleRatio;
    int agentID;
    String train;

    public DiamondCustomer(String custmerName, int custmerID, int agentID, String train) {
        super(custmerName, custmerID);
        bonusRatio = 0.3;
        saleRatio = 0.5;
        grade = "DIAMOND";
        this.agentID = agentID;
        this.train = train;
    }

    public int calc(int price) {
        bonusPoint = (int) (price * bonusRatio);

        return price - (int) (price * saleRatio);
    }

    public String show() {

        return super.show() + "담당 상담원의 아이디는" + agentID + "입니다." + "추가로 전용탈것은 " + train + " 입니다";
    }

}