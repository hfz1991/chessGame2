package view;

import javax.swing.JDialog;

public class SplitDialogue extends JDialog{

	private int verticalAxis=400;
	private int horizontalAxis=160;
	
	public SplitDialogue(){
		
		//setup frame
		setTitle("Set Number of Moves");
		setSize(verticalAxis, horizontalAxis);
		setResizable(false);
		setLocationRelativeTo(null);
	    setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
	    setVisible(true); 
	}
	
}
