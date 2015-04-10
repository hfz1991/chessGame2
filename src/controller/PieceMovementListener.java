package controller;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import model.GameManager;
import model.PieceGroup;
import view.BoardPanel;
import view.SquarePanel;

public class PieceMovementListener implements MouseListener {

	private SquarePanel parentSquarePanel;
	
	public static SquarePanel selectedPieceSquarePanel = null;
	
	public PieceMovementListener(SquarePanel psp) {
		this.parentSquarePanel = psp;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		
		
	}

	
	
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		if(this.parentSquarePanel.getCurrentPieceGroup() != null) {
			PieceMovementListener.selectedPieceSquarePanel = this.parentSquarePanel;
		} else {
			if(PieceMovementListener.selectedPieceSquarePanel != null) {
				
				// move from
				Point from = selectedPieceSquarePanel.getGridLocation();
				// move to
				Point to = this.parentSquarePanel.getGridLocation();
				
				GameManager.getSingleton().getBoard().movePieces(from, to);
			}
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
