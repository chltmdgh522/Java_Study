package test2;

public class Bus {

    int busNum;
    int passenger;
    int money;

    public Bus(int busNum) {
        this.busNum = busNum;

    }

    public void take(int money) {
        this.money += 1000;
        passenger++;
        if (money == 2000) {


        }

    }

    public void show() {
        if (money == 2000) {

            System.out.println("d");

        }
        System.out.println("버스" + busNum + "번의 승객은" + passenger +
                "명이고, 수입은" + money + "입니다.");

    }


}