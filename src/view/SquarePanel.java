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

import ChessPieces.AbstractPiece;

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
	
	public static String checkIfOccupied(
			HashMap<String, AbstractPiece> pieceBlack,
			HashMap<String, AbstractPiece> pieceWhite, MouseEvent e){
		String stringB;
		String stringW;
		SquarePanel panel;
		SquarePanel clickPanel;
		String saveKey;
		
		
		boolean ifPieceExist=false;
		
		ifPieceExist=false;
		saveKey=null;
		clickPanel=(SquarePanel) e.getSource();
		for (Map.Entry me : pieceBlack.entrySet()) {

			  stringB=(String) me.getKey();
	          
	          panel= (SquarePanel) pieceBlack.get(stringB).getParent();
	          
	          
	          if(panel==clickPanel){
	        	  System.out.println("exist"+me.getKey());
	        	  ifPieceExist=true;
	        	  saveKey=(String) me.getKey();
	        	  //player="Black";
	        	 
	          }
	    }
		
		if(ifPieceExist==false){
			
			for (Map.Entry wh : pieceWhite.entrySet()) {

				stringW=(String) wh.getKey();

		          panel= (SquarePanel) pieceWhite.get(stringW).getParent();

		          if(panel==clickPanel){
		        	  System.out.println("exist: "+wh.getKey());
		        	  ifPieceExist=true;
		        	  saveKey=(String) wh.getKey();
		        	  //player="White";
		        	 
		          }
		    }
		}
		return saveKey;
	}
	
	public static void RemovePiece(String existKey, MouseEvent e, HashMap<String, AbstractPiece> pieceBlack, HashMap<String, AbstractPiece> pieceWhite){
		
		SquarePanel clickPanel;
		String eKey;
		String stringB;
		String stringW;
		boolean removed;
		
		clickPanel=(SquarePanel) e.getSource();
		eKey=existKey;
		removed=false;
		
		for (Map.Entry me : pieceBlack.entrySet()) {

			  stringB=(String) me.getKey();

	          if(eKey==stringB){
	        	  clickPanel.remove(pieceBlack.get(eKey));
	        	  System.out.println("removeB");
	        	  removed=true;
	          }
	    }
		
		if(removed==false){
			
			for (Map.Entry wh : pieceWhite.entrySet()) {

				stringW=(String) wh.getKey();

		          if(eKey==stringW){
		        	  clickPanel.remove(pieceWhite.get(eKey));
		        	  System.out.println("removeW");
		        	  removed=true;
		          }
		    }
		}	
	}
	
	public static void AddPiece(String existKey, MouseEvent e, HashMap<String, AbstractPiece> pieceBlack, HashMap<String, AbstractPiece> pieceWhite){
		SquarePanel nPanel;
		String eKey;
		String stringB;
		String stringW;
		boolean added; 
		
		nPanel=(SquarePanel) e.getSource();
		
		added=false; 
		eKey=existKey;
		
		for (Map.Entry me : pieceBlack.entrySet()) {

			  stringB=(String) me.getKey();

	          if(eKey==stringB){
	        	  nPanel.add( pieceBlack.get(eKey), BorderLayout.CENTER);
	        	  System.out.println("removeB");
	        	  added=true;
	          }
	    }
		
		if(added==false){
			
			for (Map.Entry wh : pieceWhite.entrySet()) {

				stringW=(String) wh.getKey();

		          if(eKey==stringW){
		        	  nPanel.add( pieceWhite.get(eKey), BorderLayout.CENTER);
		        	  System.out.println("removeW");
		        	  added=true;
		          }
		    }
		}	
	}
	
}
