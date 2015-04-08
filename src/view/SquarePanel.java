package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.PieceMovementListener;
import model.AbstractPiece;
import model.PieceGroup;


public class SquarePanel extends JPanel
{
	private Point location;
	
	private PieceGroup currentPieceGroup;
	
	public SquarePanel(int x, int y) 
	{
			location = new Point(x,y);
			
			// Remember: the listener should not work if the game is not in progress>???
			// !!!!!!!!!!!!!!!!!!!!
			this.addMouseListener(new PieceMovementListener(this));
 
	}
	
	public PieceGroup getCurrentPieceGroup() {
		return this.currentPieceGroup;
	}
	
	public void setCurrentPieceGroup(PieceGroup currentPieceGroup) {
		this.currentPieceGroup = currentPieceGroup;
		
		repaint();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if(this.currentPieceGroup != null) {
			ArrayList<AbstractPiece> pieces = this.currentPieceGroup.getPieces();
			for(AbstractPiece p : pieces) {
				try {
					// check colour or whether the piece belongs ot a team, temprary checking star
					File f = null;
					if(p.getName().equals("star")) {
						 f = new File("src/img/star.png");
					} else {
						f = new File("src/img/" + p.getName() + "_Black.png");
					}
					
					g.drawImage(ImageIO.read(f), 0, 0, null);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
	}
	
	public Point getGridLocation()
	{
		return this.location;
	}
	
	
	
}
