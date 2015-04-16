package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.SplitDialogue;

/**
 * A controller class -- split save dialogue listener.
 * @author Yidan Zhang
 * @author Chao Wang
 */

public class SplitDialogueSaveListener implements ActionListener 
{

	private SplitDialogue splitDia;
	
	public SplitDialogueSaveListener(SplitDialogue splitDialogue) 
	{
		// TODO Auto-generated constructor stub
		splitDia=splitDialogue;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		// TODO Auto-generated method stub
		splitDia.dispose();
	}

}
