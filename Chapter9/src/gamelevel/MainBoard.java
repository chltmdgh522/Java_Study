package gamelevel;

public class MainBoard {

	public static void main(String[] args) {
		
		Player player1= new Player();
		player1.playe(1);
		SuperLevel sLevel= new SuperLevel();
		player1.upgradeLevel(sLevel);
		player1.playe(3);

		AdvancedLevel aLevel= new AdvancedLevel();
		player1.upgradeLevel(aLevel);
		player1.playe(2);
		
		
	}

}
