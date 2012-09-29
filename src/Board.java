import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements ActionListener {
	private static final long serialVersionUID = -1710241764628038970L;
	Timer time;
	static Graphics2D Drawer;
	
	public Board(){
		Creation.create();
		
		addKeyListener(new InputKeyEvents());
		setFocusable(true);
		time = new Timer(10, this);
		time.start();
	}

	// update
	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
		UpdateAll.update();
	}
	
	// draw method
	public void paint(Graphics g){
		Drawer = (Graphics2D) g;
		DrawAll.draw();
	}
}