package cooperation;

public class Bus {
    int emoney;
    int passengerCount;
    int busNumber;

    public void take(int money) {
        emoney+= money;
        passengerCount++;
    }

    public Bus(int busNumber) {
        this.busNumber = busNumber;
    }

    public void show() {
        System.out.println("버스" + busNumber + "번의 승객은" + passengerCount +
                "명이고, 수입은" + emoney + "입니다.");

    }

}
