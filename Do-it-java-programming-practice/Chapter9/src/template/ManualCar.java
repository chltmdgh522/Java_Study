package template;

public class ManualCar extends Car {

    @Override
    public void drive() {
        System.out.println("사람이 운전합니다.");
        System.out.println("사람이 핸들을 조작합니다.");

    }

    public void wiper() {
        System.out.println("사람이 비를 인지하고 와이퍼를 킵니다.");

    }

    @Override
    public void stop() {
        System.out.println("사람이 브레이크를 감지합니다.");

    }

}
