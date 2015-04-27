package controller;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;

import model.AbstractPiece;
import model.Board;
import model.GameManager;
import view.SplitDialogue;
import view.SquarePanel;
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
	private ArrayList<Point> pointList;
	private SquarePanel currSquares[][];
	
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
		pointList = new ArrayList<Point>();
		GameManager.getSingleton().getBoard().checkingValidPathPiece(ap, pointList, point.y, point.x);
		
		View v = View.getView();
		currSquares = v.getBoardPanel().getSquares();
		
		for (int i = 0; i < currSquares.length; i++) 
		{
			for (int j = 0; j < currSquares.length; j++) 
			{
				for (int m = 0; m < pointList.size(); m++) 
				{
					if (currSquares[i][j].getGridLocation().equals(
							pointList.get(m))) 
					{
						currSquares[j][i].setBorder(BorderFactory
								.createLineBorder(Color.RED, 3));

					}
				}
			}
		}
		
	}
	
	

}
