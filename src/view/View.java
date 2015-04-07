
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
	    add(board,BorderLayout.WEST);
	    add(info,BorderLayout.EAST);
	    
		setTitle("Chess");
		setSize(840, 640);
		setResizable(false);
		setLocationRelativeTo(null);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	    setVisible(true); 
	} 
	
	
}