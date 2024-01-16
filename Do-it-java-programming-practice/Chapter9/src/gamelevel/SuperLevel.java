package gamelevel;

public class SuperLevel extends PlayerLevel {

    @Override
    public void run() {
        System.out.println("빨리 달립니다");

    }

    @Override
    public void jump() {
        System.out.println("크게 점프합니다.");

    }

    @Override
    public void turn() {
        System.out.println("크게 턴합니다.");

    }

    @Override
    public void showLevelMessage() {
        System.out.println("고급자입니다.");

    }


}
