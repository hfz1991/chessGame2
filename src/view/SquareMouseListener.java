package view;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class SquareMouseListener implements MouseListener{

	int newX=0;
	int newY=0;
	//BoardPanel board;
	
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		SquarePanel panel=(SquarePanel) e.getSource();
		newX=panel.getGridLocation().x;
		newY=panel.getGridLocation().y;
		
		System.out.println("X"+newX+" Y"+newY);
		
		//BoardPanel.getPieceBlack();
		//System.out.println(board.getPieceBlack().size());
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
