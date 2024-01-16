package gamelevel;

public class AdvancedLevel extends PlayerLevel {

    @Override
    public void run() {
        System.out.println("조금 빨리 달립니다");

    }

    @Override
    public void jump() {
        System.out.println("점프 합니다");

    }

    @Override
    public void turn() {
        System.out.println("턴합니다.");

    }

    @Override
    public void showLevelMessage() {
        System.out.println("중급자입니다.");

    }

}
