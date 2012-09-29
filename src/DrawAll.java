
public class DrawAll extends Board {
	private static final long serialVersionUID = -4094860093132101728L;
	public static void draw(){
		DrawBackground.drawBk();
		DrawPlayer.drawPlayer();
		DrawBlocks.drawBlocks();
	}	
}
