import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class InputKeyEvents extends KeyAdapter {
	public void keyPressed(KeyEvent e){
		int keys = e.getKeyCode();
		if (keys == KeyEvent.VK_A){
			Player.setXDisplacement(-2);
		} else if (keys == KeyEvent.VK_D){
			Player.setXDisplacement(2);
		}
	}
	public void keyReleased(KeyEvent e){
		int keys = e.getKeyCode();
		if (keys == KeyEvent.VK_A || keys == KeyEvent.VK_D){
			Player.setXDisplacement(0);
		}
	}
}
