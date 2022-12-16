package test2;

public class Student {
    String studentName;
    int grade;
    int money;


    public Student(String studentName, int grade, int money) {
        this.studentName = studentName;
        this.money = money;
        this.grade = grade;
    }

    public void takeBus(Bus bus)//어떤 버스를 탈건지 그 버스에 대한정보
    {
        money -= 1000;
        bus.take(1000);    // Bus가 객체라서 .을하면 쓸수 있는 멤버변수와 메서드를 볼수 있다.
    }

    public void takeSubway(Subway sub) {
        money -= 1000;
        sub.take(1000);
    }

    public void takeTaxi(Taxi taxi) {
        money -= 1000;
        taxi.take(1000);
    }

    public void show() {
        System.out.println(grade + "학년" + studentName + "님의 남은 돈은" + money +
                "입니다.");
    }

}