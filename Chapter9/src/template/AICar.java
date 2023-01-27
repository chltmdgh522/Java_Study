package template;

public class AICar extends Car {

    @Override
    public void drive() {
        System.out.println("자율 주행합니다.");
        System.out.println("자동차가 스스로 방향을 전환합니다.");


    }

    public void wiper() {
        System.out.println("자동차가 비를 인지하고 와이퍼를 킵니다.");

    }
    @Override
    public void washCar() {
        System.out.println("자동차가 스스로 샤워합니다.");
    }

    @Override
    public void stop() {
        System.out.println("자동차가 스스로 멈춥니다.");

    }

}
