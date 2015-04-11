package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.GameManager;

import javax.swing.JDialog;

import view.InfoPanel;
import view.NewGameDialogue;
import view.View;

public class NewGameSaveDialogueListener implements ActionListener{
	
	private NewGameDialogue parentView;
	private InfoPanel infoPanel;
	
	public NewGameSaveDialogueListener(NewGameDialogue parentView, InfoPanel infoPanel) {
		this.parentView = parentView;
		this.infoPanel=infoPanel;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		GameManager.getSingleton().setTotalOfMoves(parentView.getNumberOfMoves());
		GameManager.getSingleton().getBoard().initialisePieces();
		
		this.parentView.dispose(); 
		this.infoPanel.getGoBack().setEnabled(true);
		this.infoPanel.getSplit().setEnabled(true);;
		

		
		//set Time function
		//setTimer(); 
		
	}
}
