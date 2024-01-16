package cooperation;

public class TakeTrains {
    public static void main(String[] args) {
        Student s1= new Student("최승호", 10000);
        Bus b1=new Bus(1);
        s1.takeBus(b1);
        s1.show();
        b1.show();
    }
}
