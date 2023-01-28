package template;

public class CarTest {

    public static void main(String[] args) {
        Car car1 = new ManualCar();
        AICar car2 = new AICar();

        car1.run();
        System.out.println("====================");
        car2.run();

    }

}
