package template;

public abstract class Car {

    public abstract void drive();

    public abstract void stop();

    public abstract void wiper();

    public void washCar() {
    } // 구현은 했는데 내용이 없는거임
    // 필요에 의해서 재정의 해봐라, 추가기능인듯

    public void startCarOn() {

        System.out.println("시동을 킵니다.");
    }
    public void startCarOff() {

        System.out.println("시동을 껍니다.");
    }

    public final void run() {
        startCarOn();
        drive();
        wiper();
        stop();
        washCar();
        startCarOff();
    }// 시나리오는 바뀌면 안되서 파이널 씀 오버라이딩x 이게 템플릿메서드

}
