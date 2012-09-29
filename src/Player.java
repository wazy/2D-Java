import java.awt.Image;

import javax.swing.ImageIcon;


public class Player {
	private static ImageIcon player = new ImageIcon (Player.class.getResource("world/player1.jpg"));
	
	// coordinates
	private static int x = 0, y = 0;
	private static int xdisplacement;
	
	public static Image getImage(){
		return player.getImage();
	}
	
	public static void update(){
		updateX();
	}
	private static void updateX(){
		x += xdisplacement;
	}
	
	public static int getX(){
		return x;	
	}
	
	public static int getY(){
		return y;
	}
	
	public static int getBlockX(){
		return x/40;
	}
	
	public static int getBlockY(){
		return y/40;
	}
	
	public static void setXDisplacement(int i){
		xdisplacement = i;
	}

}
