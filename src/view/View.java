
package view;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.LineBorder;

public class View extends JFrame{ 

	private BoardPanel board;
	private InfoPanel info;

	public View() { 
  
		this.board=new BoardPanel(); 
		this.info=new InfoPanel(this, board);
		this.add(board,BorderLayout.WEST);
		this.add(info,BorderLayout.EAST);
	    
		this.setTitle("Chess");
		this.setSize(840, 640);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setVisible(true); 
	} 
	
	public BoardPanel getBoardPanel() {
		return this.board;
	}
	
}