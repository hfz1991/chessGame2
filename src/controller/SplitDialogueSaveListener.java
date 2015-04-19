package controller;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.AbstractPiece;
import model.Board;
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
		splitDia = splitDialogue;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		Board board = GameManager.getSingleton().getBoard();
		Point point = board.getcurrentSelectedPoint();
		int index = splitDia.getIndex();
		AbstractPiece ap = GameManager.getSingleton().getBoard().getPiece(point.y, point.x).getPieces().get(index);
		splitDia.dispose();
	}
	
	

}
