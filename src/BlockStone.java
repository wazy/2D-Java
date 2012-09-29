import java.awt.Image;

import javax.swing.ImageIcon;


public class BlockStone {
	private static ImageIcon stone = new ImageIcon(BlockStone.class.getResource("/blocks/Stone.jpg"));
	
	public static Image getStone(){
		return stone.getImage();
	}
	
	
}
