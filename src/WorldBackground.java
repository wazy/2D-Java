import java.awt.Image;
import javax.swing.ImageIcon;


public class WorldBackground {
	private static ImageIcon background = new ImageIcon(WorldBackground.class.getResource("world/forestbk.jpg"));
	
	public static Image getBk() 
	{
		return background.getImage();
	}
}
