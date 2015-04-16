package view;


import java.awt.Graphics;
import java.awt.Point;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import controller.PieceMovementListener;
import model.AbstractPiece;
import model.GameManager;
import model.MovablePiece;
import model.PieceGroup;

/**
 * A view class to show the square panel.
 * @author Yidan Zhang
 * @author Chao Wang
 */

public class SquarePanel extends JPanel
{
	private Point location;
	
	private PieceGroup currentPieceGroup;
	
	public SquarePanel(int x, int y) 
	{
			location = new Point(x,y);
			
			this.addMouseListener(new PieceMovementListener(this));
 
	}
	
	public PieceGroup getCurrentPieceGroup() 
	{
		return this.currentPieceGroup;
	}
	
	public void setCurrentPieceGroup(PieceGroup currentPieceGroup) 
	{
		this.currentPieceGroup = currentPieceGroup;
		
		repaint();
	}
	
	public void paintComponent(Graphics g) 
	{
		super.paintComponent(g);
		if(this.currentPieceGroup != null) 
		{
			ArrayList<AbstractPiece> pieces = this.currentPieceGroup.getPieces();
			for(AbstractPiece p : pieces) 
			{
				try 
				{
					// check colour or whether the piece belongs ot a team, temprary checking star
					File f = null;
					if(p instanceof MovablePiece)
					{
						MovablePiece mp = (MovablePiece) p;
						String color = null;
						if(mp.getColour() == GameManager.BLACK_PLAYER) color="Black";
						else color="White";
						
						f = new File("src/img/" + p.getName() + "_" + color + ".png");
					}
					else
					{
						 f = new File("src/img/star.png");
					}
					
					g.drawImage(ImageIO.read(f), 0, 0, null);
				} catch (IOException e) 
				{
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
