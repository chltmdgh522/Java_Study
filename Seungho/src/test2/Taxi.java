package test2;

public class Taxi {

    int taxiNum;
    int passenger;
    int money;

    public Taxi(int taxiNum) {
        this.taxiNum = taxiNum;
    }

    public void take(int money) {
        this.money += money;
        passenger++;
    }

    public void looser(int money) {

        System.out.println("버스가 먹었네용");


    }

    public void show() {
        System.out.println("택시" + taxiNum + "번의 승객은" + passenger +
                "명이고, 수입은" + money + "입니다.");

    }

}