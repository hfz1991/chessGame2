package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.UndoDialogue;

public class UndoDialogueListener implements ActionListener {

	UndoDialogue undoDia;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		undoDia = new UndoDialogue();
	}

}
