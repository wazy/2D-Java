import java.awt.Image;

import javax.swing.ImageIcon;


public class BlockDirt {
	private static ImageIcon dirt = new ImageIcon(BlockDirt.class.getResource("/blocks/Dirt.jpg"));
	private static ImageIcon dirtGrass = new ImageIcon(BlockDirt.class.getResource("/blocks/DirtGrass.jpg"));

	public static Image getDirt(){
		return dirt.getImage();
	}
	
	public static Image getDirtGrass(){
		return dirtGrass.getImage();
	}

}
