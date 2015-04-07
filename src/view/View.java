
package view;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.LineBorder;

public class View extends JFrame{ 

	private BoardPanel board;
	private InfoPanel info;

	public ChessGameFrame() { 

		this.board=new BoardPanel(); 
		this.info=new InfoPanel(this, board);
	    add(board,BorderLayout.WEST);
	    add(info,BorderLayout.EAST);
	} 
	
	public static void main(String[] args) {
		ChessGameFrame frame = new ChessGameFrame();
		frame.setTitle("Chess");
		frame.setSize(840, 640);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	    frame.setVisible(true); 
	}
}