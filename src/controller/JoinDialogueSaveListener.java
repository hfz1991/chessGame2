package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.JoinDialogue;

public class JoinDialogueSaveListener implements ActionListener {

	private JoinDialogue joinDia;
	
	public JoinDialogueSaveListener(JoinDialogue joinDialogue) {
		// TODO Auto-generated constructor stub
		joinDia=joinDialogue;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("JoinDialogueSaveListener");
		joinDia.dispose();
	}

}
