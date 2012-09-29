
public class DrawPlayer extends Board {
	private static final long serialVersionUID = -3030556921103776018L;

	public static void drawPlayer(){
		Drawer.drawImage(Player.getImage(), Player.getX(), Player.getY(), null);
	}
}
