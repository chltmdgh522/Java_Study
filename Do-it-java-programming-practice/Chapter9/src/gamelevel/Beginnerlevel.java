package gamelevel;

public class Beginnerlevel extends PlayerLevel {

    @Override
    public void run() {
        System.out.println("천천히 달립니다");

    }

    @Override
    public void jump() {
        System.out.println("점프 못합니다");

    }

    @Override
    public void turn() {
        System.out.println("턴도 못합니다.");

    }

    @Override
    public void showLevelMessage() {
        System.out.println("초보자입니다.");

    }

}
