package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.GameManager;
import view.SplitDialogue;

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
		GameManager gm = GameManager.getSingleton();
		
		splitDia=splitDialogue;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		splitDia.dispose();
	}

}
