import javax.swing.*;
	
public class JGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Board board = new Board();
		JFrame frame = new JFrame("JGame");
		
		frame.add(board);
		frame.setFocusable(false);
		
		frame.setSize(500, 500);
		frame.setLocation(200, 200);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(3);
		frame.setVisible(true);
		
		board.requestFocus(true);
	}

}
