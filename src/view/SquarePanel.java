package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class SquarePanel extends JPanel
{
	private Point location;
	
	public SquarePanel(int x, int y) 
	{
			location = new Point(x,y);
			
			//this.addMouseListener(this);
 
	}
	
	public Point getGridLocation()
	{
		return this.location;
	}
	
	
	
}
