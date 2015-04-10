package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.JoinDialogue;

public class JoinDialogueListener implements ActionListener{

	private JoinDialogue joinDia;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		joinDia= new JoinDialogue();
		
	}
	
}
