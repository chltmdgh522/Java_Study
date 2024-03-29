package gamelevel;

public class Player {

    private PlayerLevel level;

    public Player() {
        level = new AdvancedLevel();
        level.showLevelMessage();
    }

    public PlayerLevel getLevel() {
        return level;
    }

    public void upgradeLevel(PlayerLevel level) {
        this.level = level;
        level.showLevelMessage();
    }

    public void playe(int count) {
        level.go(count);

    }

}
