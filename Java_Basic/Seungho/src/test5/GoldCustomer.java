package test5;

public class GoldCustomer extends Customer {

    double saleRatio = 0.05;

    public GoldCustomer(String custmerName, int custmerID) {
        super(custmerName, custmerID);
        bonusRatio = 0.03;
        grade = "GOLD";
    }

    public int calc(int price) {
        bonusPoint = (int) (price * bonusRatio);

        return price - (int) (price * saleRatio);

    }
}
