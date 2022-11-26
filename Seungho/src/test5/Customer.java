package test5;

public class Customer {


    String custmerName;
    int custmerID;
    int bonusPoint = 1;
    double bonusRatio;
    String grade;

    public Customer(String custmerName, int custmerID) {
        this.custmerName = custmerName;
        this.custmerID = custmerID;
        grade = "SILVER";
        bonusRatio = 0.01;

    }


    public int calc(int price) {
        bonusPoint = (int) (price * bonusRatio);

        return price;

    }

    public String show() {

        return grade + "등급 " + custmerName + "님의 포인트는" + bonusPoint + "입니다.";
    }

}
