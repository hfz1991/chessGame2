package controller;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.GameManager;
import view.SplitDialogue;
import view.View;

/**
 * A controller class -- split save dialogue listener.
 * @author Yidan Zhang
 * @author Chao Wang
 * @author Fang Zhou He
 */

public class SplitDialogueSaveListener implements ActionListener 
{

	private SplitDialogue splitDia;
	
	
	public SplitDialogueSaveListener(SplitDialogue splitDialogue) 
	{
		Point point = GameManager.getSingleton().getBoard().getcurrentSelectedPoint();
		splitDia = splitDialogue;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		System.out.println("#SELECTED: " +splitDia.getSelectedIndex());
		splitDia.dispose();
	}
	
	

}
