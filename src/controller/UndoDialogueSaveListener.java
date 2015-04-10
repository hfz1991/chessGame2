package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.UndoDialogue;

public class UndoDialogueSaveListener implements ActionListener {

	private UndoDialogue undoDia;
	
	public UndoDialogueSaveListener(UndoDialogue undoDialogue) {
		// TODO Auto-generated constructor stub
		undoDia=undoDialogue;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("UndoDialogueSaveListener");
		undoDia.dispose();
	}

}
