package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class BoardPanel extends JPanel implements Observer{
	
	GridLayout layout =new GridLayout(6,6);
	JPanel squares[][]= new JPanel[6][6];
	
	JPanel testX = null;
	

	
	boolean isClicked;
	String existKey;
	MouseEvent oldE;
	
//	
	
	public BoardPanel() {
		//setup Chess board
	    setLayout(layout);
	    setPreferredSize(new Dimension(600, 600));
	    setBorder(new LineBorder(new Color(0, 0, 0)));
	    
	    for (int i = 0; i < 6; i++) 
	    { 
	        for (int j = 0; j < 6; j++) 
	        { 
	        	squares[i][j] = new SquarePanel(i,j); 
				squares[i][j].setPreferredSize(new Dimension(95, 95));
				
				squares[i][j].setBackground(Color.DARK_GRAY);;
	        if(((i + j) % 2) == 0)
	        {
	            squares[i][j].setBackground(Color.WHITE);
	        }
            add(squares[i][j]);
	        } 
	    } 
	}
	    //end of Chess board
	
	private void initChess()
	{
		
	}
	
	private void addChessPiecesToBoard()
	{
		this.initChess();
		
	}
	
	private void initBarrier()
	{
		

	}
	
	private void addBarrierPiecesToBoard()
	{
		initBarrier();
		
	}
	
	public void setInitGame()
	{
		finaliseGame();
		this.addChessPiecesToBoard();
		this.addBarrierPiecesToBoard();	
		isClicked=false;
		//final String currentKey;
		
		for(int i = 0; i < 36 ;i++)
		{
			squares[i/6][i%6].addMouseListener(new MouseAdapter(){

				public void mouseClicked(MouseEvent e) {
					 String currentKey;
					 
					// TODO Auto-generated method stub
					
				}
				
			});
		}
	}
	
	
	public void finaliseGame()
	{
		for(int i = 0; i < 36 ;i++)
		{
			squares[i/6][i%6].removeAll();
		}
	}

	@Override
	public void update(Observable o, Object arg) {
		
	}
	

}


