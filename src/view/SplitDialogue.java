package view;

import java.awt.FlowLayout;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import controller.CancelListener;
import controller.SplitDialogueSaveListener;

/**
 * A view class to show the split dialogue.
 * @author Yidan Zhang
 * @author Chao Wang
 */

public class SplitDialogue extends JDialog
{

	private JLabel selectPiece;
	private JComboBox pieceGroup;
	
	private JButton save;
	private JButton cancel;
	
	private Box base;
	private Box piece;
	private Box button;
	
	private int verticalAxis=400;
	private int horizontalAxis=160;
	
	
	public SplitDialogue()
	{
		
		//select number of moves
		piece = Box.createHorizontalBox();
		selectPiece = new JLabel("Select the piece you would like to move next: ");
		piece.add(selectPiece);
		piece.add(Box.createHorizontalStrut(2)); 
		
		pieceGroup = new JComboBox();
		pieceGroup.addItem("Bishop");
		pieceGroup.addItem("Knight");
		piece.add(pieceGroup);	  
		
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
		base.add(piece);
		base.add(Box.createVerticalStrut(25));
		base.add(button);
		
		setLayout(new FlowLayout());
		add(base);		
		
		//setup dialogue
		setTitle("Split pieces");
		setSize(verticalAxis, horizontalAxis);
		setResizable(false);
		View v = View.getView();
		setLocationRelativeTo(v);
	    setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
	    setVisible(true); 
	}
	
}
