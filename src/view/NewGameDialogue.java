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

public class NewGameDialogue extends JDialog{

	private JLabel selectNum;
	private JComboBox numOfMove;
	
	private JButton save;
	private JButton cancel;
	
	private Box base;
	private Box Num;
	private Box button;
	private Boolean isCanceled;
	public NewGameDialogue(){
		
		//select number of moves
		Num = Box.createHorizontalBox();
		selectNum = new JLabel("Select Number of Moves for each Player: ");
		Num.add(selectNum);
		Num.add(Box.createHorizontalStrut(2)); 
		isCanceled = true;
		numOfMove = new JComboBox();
		
		for(int i = 0; i <= 40; i++){
			numOfMove.addItem(i+10);
		}
		
		Num.add(numOfMove);	  
		
		this.setModal(true);
		
		//setup buttons
		save = new JButton("OK");
		save.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				isCanceled = false;
				dispose();
			}
			
		});
		cancel = new JButton("Cancel");
		cancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                isCanceled = true;
                dispose();
            }});
		
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
		setSize(400, 160);
		setResizable(false);
		setLocationRelativeTo(null);
	    setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
	    setVisible(true); 
	}
	
	public Boolean getIsCanceled()
	{
		return isCanceled;
	}

}
