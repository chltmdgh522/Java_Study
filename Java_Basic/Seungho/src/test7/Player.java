package test7;

public class Player {

    PlayerLevel level;
    String name;

    public Player() {
        level = new Bronze("김경진");
        level.showMessage();

    }


    public PlayerLevel getLevel() {
        return level;
    }

    public void upgradeLevel(PlayerLevel level) {
        this.level = level;
        level.showMessage();
    }

    public void jumpEx(int count) {
        level.show(count);

    }

}
