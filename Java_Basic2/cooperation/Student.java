package cooperation;

public class Student {
    int money;
    String name;

    public Student(String name, int money) {
        this.name=name;
        this.money=money;
    }

    public void takeBus(Bus bus){
        money-=1000;
        bus.take(1000);
    }
    public void show() {
        System.out.println(name + "님의 남은 돈은" + money + "입니다.");

    }

}
