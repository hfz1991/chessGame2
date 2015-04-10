package view;

import java.awt.FlowLayout;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;

import controller.CancelListener;
import controller.SplitDialogueSaveListener;
import controller.NewGameSaveDialogueListener;

public class SplitDialogue extends JDialog{

	private JLabel selectNum;
	private JComboBox pieceGroup;
	
	private JButton save;
	private JButton cancel;
	
	private Box base;
	private Box Num;
	private Box button;
	private Boolean isCanceled;
	
	private int numMove=40;
	private int startNum=10;
	private int verticalAxis=400;
	private int horizontalAxis=160;
	
	
	public SplitDialogue(){
		
		//select number of moves
		Num = Box.createHorizontalBox();
		selectNum = new JLabel("Select Number of Moves for each Player: ");
		Num.add(selectNum);
		Num.add(Box.createHorizontalStrut(2)); 
		
		isCanceled = true;
		pieceGroup = new JComboBox();
		
		//for test, Should get array list from model!!!!!!!!!!!!!!!!!!!!!!!!!!
		pieceGroup.addItem("Bishop");
		pieceGroup.addItem("Knight");
		
		Num.add(pieceGroup);	  
		
		this.setModal(true);
		
		//setup buttons
		save = new JButton("OK");
		save.addActionListener(new SplitDialogueSaveListener(this));
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
		setLocationRelativeTo(null);
	    setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
	    setVisible(true); 
	}
	
}
