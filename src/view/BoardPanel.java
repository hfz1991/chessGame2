package view;

import java.awt.*;
import java.util.*;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import model.Board;
import model.PieceGroup;

/**
 * A view class to show the board panel.
 * 
 * @author Yidan Zhang
 * @author Chao Wang
 */

public class BoardPanel extends JPanel implements Observer 
{

	GridLayout layout = new GridLayout(6, 6);
	SquarePanel squares[][] = new SquarePanel[6][6];
	
	public SquarePanel[][] getSquares() 
	{
		return squares;
	}

	public void setSquares(SquarePanel[][] squares)
	{
		this.squares = squares;
	}

	public BoardPanel() 
	{
		// setup Chess board
		setLayout(layout);
		setPreferredSize(new Dimension(600, 600));
		setBorder(new LineBorder(new Color(0, 0, 0)));

		//paint the chess board
		for (int i = 0; i < 6; i++) 
		{
			for (int j = 0; j < 6; j++) 
			{
				squares[i][j] = new SquarePanel(j, i);
				squares[i][j].setPreferredSize(new Dimension(95, 95));

				squares[i][j].setBackground(Color.WHITE);
				
				if (((i + j) % 2) == 0) 
				{
					squares[i][j].setBackground(Color.DARK_GRAY);
				}
				add(squares[i][j]);
			}
		}
	}

	// end of Chess board

	/**
	 * @pre a PieceGroup must exist
	 * @post set board pieces for squares
	 */
	private void setBoardPieces(PieceGroup[][] pieces) 
	{
		for (int i = 0; i < pieces.length; i++) 
		{
			for (int j = 0; j < pieces[i].length; j++) 
			{
				if (pieces[i][j] != this.squares[i][j].getCurrentPieceGroup()) 
				{
					this.squares[i][j].setCurrentPieceGroup(pieces[i][j]);
				}
			}
		}
	}

	@Override
	public void update(Observable o, Object arg) 
	{
		Board gameBoard = (Board) o;
		PieceGroup[][] pieces = gameBoard.getSquareArray();
		this.setBoardPieces(pieces);
	}
}