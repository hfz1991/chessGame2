package controller;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import model.GameManager;
import model.PieceGroup;
import view.BoardPanel;
import view.SquarePanel;

public class PieceMovementListener implements MouseListener {

	private SquarePanel parentSquarePanel;
	
	private List<JPanel> panelList= new ArrayList<JPanel>();
	
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
			
			//need to check if the piece is movable piece!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
			//show border if player click a square
			parentSquarePanel.setBorder(BorderFactory.createLineBorder(Color.BLUE, 3)); 
			
			
			//change panelList to !!!!!!!!!!!!!!the function to get all possible square in a arraylist!!!!!!!!!! 
			
			/*panelList.add(parentSquarePanel);
			
			for(int i=0; i<panelList.size();i++){
				panelList.get(i).setBorder(BorderFactory.createLineBorder(Color.GREEN, 3));
			}*/
			
			
		} else {
			if(PieceMovementListener.selectedPieceSquarePanel != null) {
				
				// move from
				Point from = selectedPieceSquarePanel.getGridLocation();
				// move to
				Point to = this.parentSquarePanel.getGridLocation();
				
				GameManager.getSingleton().getBoard().movePieces(from, to);
				
				//change back to no border -- show selected piece
				selectedPieceSquarePanel.setBorder(BorderFactory.createLineBorder(Color.BLUE, 0));
				
				//chenge back to no border -- show valid path
				/*for(int i=0; i<panelList.size();i++){
					panelList.get(i).setBorder(BorderFactory.createLineBorder(Color.GREEN, 0));
					System.out.println("change color");
				}*/
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
