package view;

import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

import controller.CancelListener;
import controller.NewGameDialogueListener;
import controller.NewGameSaveDialogueListener;

public class NewGameDialogue extends JDialog{

	private JLabel selectNum;
	private JComboBox numOfMove;
	
	private JButton save;
	private JButton cancel;
	
	private Box base;
	private Box Num;
	private Box button;
	
	private int numMove=40;
	private int startNum=10;
	private int verticalAxis=400;
	private int horizontalAxis=160;
	private InfoPanel infoPanel;
	
	/*public NewGameDialogue(InfoPanel infoPanel) {
		// TODO Auto-generated constructor stub
		this.infoPanel=infoPanel;
	}*/
	
	public NewGameDialogue(InfoPanel infoPanel){
		
		//select number of moves
		Num = Box.createHorizontalBox();
		selectNum = new JLabel("Select Number of Moves for each Player: ");
		Num.add(selectNum);
		Num.add(Box.createHorizontalStrut(2)); 
		
		numOfMove = new JComboBox();
		
		for(int i = 0; i <= numMove; i++){
			numOfMove.addItem(i+startNum);
		}
		
		Num.add(numOfMove);	  
		
		this.setModal(true);
		
		//setup buttons
		save = new JButton("OK");
		save.addActionListener(new NewGameSaveDialogueListener(this,infoPanel));
		cancel = new JButton("Cancel");
		cancel.addActionListener(new CancelListener(this));
		
		button = Box.createHorizontalBox();
		button.add(save);
		button.add(cancel);
		
		base = Box.createVerticalBox();
		base.add(Box.createVerticalStrut(20));
		base.add(Num);
		base.add(Box.createVerticalStrut(25));
		base.add(button);
		
		setLayout(new FlowLayout());
		add(base);		
		
		//setup frame
		setTitle("Set Number of Moves");
		setSize(verticalAxis, horizontalAxis);
		setResizable(false);
		View v = View.getView();
		setLocationRelativeTo(v);
	    setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
	    setVisible(true); 
	}

	public int getNumberOfMoves(){
		return Integer.parseInt(this.numOfMove.getSelectedItem().toString());
	}
}
