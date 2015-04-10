package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.SplitDialogue;

public class SplitDialogueListener implements ActionListener {

	private SplitDialogue splitDia;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		splitDia = new SplitDialogue();
	}

}
