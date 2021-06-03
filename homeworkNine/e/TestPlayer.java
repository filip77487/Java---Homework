package homeworkNine.e;

public class TestPlayer {

	public static void main(String[] args) {
//		Player p1 = new Player();
//			p1.pickPlayer();
		
		PointGuard pg1 = new PointGuard();
		pg1.pickPlayer();
		
		
		Player[] p2 = new Player[5];
		p2[0] = new PointGuard();
		p2[1] = new Shootingguard();	
		p2[2] = new Forward();	
		p2[3] = new PowerForward();
		p2[4] = new PointGuard();
		
		PlayerSwitcher.pickAllPLayers(p2);
		
	}
}

