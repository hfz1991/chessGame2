package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.GameManager;

import javax.swing.JDialog;

import view.NewGameDialogue;

public class newGameSaveDialogueListener implements ActionListener{
	
	private NewGameDialogue parentView;
	
	public newGameSaveDialogueListener(NewGameDialogue parentView) {
		this.parentView = parentView;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		GameManager gm = GameManager.getSingleton();
		gm.setTotalOfMoves(parentView.getNumberOfMoves());
		this.parentView.dispose(); 
	}
}
