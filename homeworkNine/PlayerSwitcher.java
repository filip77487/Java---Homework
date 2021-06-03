package homeworkNine;

public abstract class PlayerSwitcher extends Player {
	public static void pickAllPLayers(Player[] players) {
		for (Player player : players) {
			player.pickPlayer();
		}
	}

}
