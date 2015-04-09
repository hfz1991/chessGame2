package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;

import view.NewGameDialogue;

public class CancelListener implements ActionListener {
	
	private JDialog dialog;
	
	public CancelListener(JDialog dialog){
		this.dialog=dialog;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		dialog.dispose();
	}

}
