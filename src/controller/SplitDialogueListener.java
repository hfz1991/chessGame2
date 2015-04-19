package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.SplitDialogue;

/**
 * A controller class -- split dialogue listener.
 * @author Yidan Zhang
 * @author Chao Wang
 * @author Fang Zhou He
 */

public class SplitDialogueListener implements ActionListener 
{
	private SplitDialogue splitDia;
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		splitDia = new SplitDialogue();
	}

}
