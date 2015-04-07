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

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import ChessPieces.*;
public class BoardPanel extends JPanel{
	
	GridLayout layout =new GridLayout(6,6);
	JPanel squares[][]= new JPanel[6][6];
	
	JPanel testX = null;
	
	HashMap<String, AbstractPiece> pieceBlack;
	HashMap<String, AbstractPiece> pieceWhite;
	HashMap<String, AbstractPiece> pieceBarrier;
	
	boolean isClicked;
	String existKey;
	MouseEvent oldE;
	
	public HashMap<String, AbstractPiece> getPieceBlack(){
		return pieceBlack;
	}
	
	public HashMap<String, AbstractPiece> getPieceWhite(){
		return pieceWhite;
	}
	
	public HashMap<String, AbstractPiece> getPieceBarrier(){
		return pieceBarrier;
	}
	
	public BoardPanel() {
		//setup Chess board
	    setLayout(layout);
	    setPreferredSize(new Dimension(600, 600));
	    setBorder(new LineBorder(new Color(0, 0, 0)));
	    pieceBlack = new HashMap<String, AbstractPiece>();
	    pieceWhite = new HashMap<String, AbstractPiece>();
	    pieceBarrier = new HashMap<String, AbstractPiece>();
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
		ChessBishopW bishopWL = new ChessBishopW("bishop_W_L");
		ChessBishopW bishopWR = new ChessBishopW("bishop_W_R");
		
		ChessBishopB bishopBL = new ChessBishopB("bishop_B_L");
		ChessBishopB bishopBR = new ChessBishopB("bishop_B_R");
		
		ChessKnightW knightWL = new ChessKnightW("knight_W_L");
		ChessKnightW knightWR = new ChessKnightW("knight_W_R");
		
		ChessKnightB knightBL = new ChessKnightB("knight_B_L");
		ChessKnightB KnightBR = new ChessKnightB("knight_B_R");
		
		ChessRookW rookWL = new ChessRookW("rook_W_L");
		ChessRookW rookWR = new ChessRookW("rook_W_R");
		
		ChessRookB rookBL = new ChessRookB("rook_B_L");
		ChessRookB rookBR = new ChessRookB("rook_B_R");

		pieceBlack.clear();
		pieceWhite.clear();
		
		pieceBlack.put("bishop_B_L",bishopBL);
		pieceBlack.put("bishop_B_R", bishopBR);
		pieceBlack.put("knight_B_L", knightBL);
		pieceBlack.put("knight_B_R", KnightBR);
		pieceBlack.put("rook_B_L", rookBL);
		pieceBlack.put("rook_B_R", rookBR);

		pieceWhite.put("bishop_W_L", bishopWL);
		pieceWhite.put("bishop_W_R", bishopWR);
		pieceWhite.put("knight_W_L", knightWL);
		pieceWhite.put("knight_W_R", knightWR);
		pieceWhite.put("rook_W_L", rookWL);
		pieceWhite.put("rook_W_R", rookWR);
	}
	
	private void addChessPiecesToBoard()
	{
		this.initChess();
		squares[0][0].add( pieceBlack.get("rook_B_L"), BorderLayout.CENTER);
		pieceBlack.get("rook_B_L").setParent(squares[0][0]);
		
		squares[0][1].add( pieceBlack.get("bishop_B_L"), BorderLayout.CENTER);
		pieceBlack.get("bishop_B_L").setParent(squares[0][1]);
		squares[0][2].add( pieceBlack.get("knight_B_L"), BorderLayout.CENTER);
		pieceBlack.get("knight_B_L").setParent(squares[0][2]);
		squares[0][3].add( pieceBlack.get("knight_B_R"), BorderLayout.CENTER);
		pieceBlack.get("knight_B_R").setParent(squares[0][3]);
		squares[0][4].add( pieceBlack.get("bishop_B_R"), BorderLayout.CENTER);
		pieceBlack.get("bishop_B_R").setParent(squares[0][4]);
		squares[0][5].add( pieceBlack.get("rook_B_R"), BorderLayout.CENTER);
		pieceBlack.get("rook_B_R").setParent(squares[0][5]);
				
		squares[5][0].add( pieceWhite.get("rook_W_L"), BorderLayout.CENTER);
		pieceWhite.get("rook_W_L").setParent(squares[5][0]);
		//squares[5][0].updateUI();
		squares[5][1].add(  pieceWhite.get("bishop_W_L"), BorderLayout.CENTER);
		pieceWhite.get("bishop_W_L").setParent(squares[5][1]);
		squares[5][2].add(  pieceWhite.get("knight_W_L"), BorderLayout.CENTER);
		pieceWhite.get("knight_W_L").setParent(squares[5][2]);
		squares[5][3].add( pieceWhite.get("knight_W_R"), BorderLayout.CENTER);
		pieceWhite.get("knight_W_R").setParent(squares[5][3]);
		squares[5][4].add( pieceWhite.get("bishop_W_R"), BorderLayout.CENTER);
		pieceWhite.get("bishop_W_R").setParent(squares[5][4]);
		squares[5][5].add( pieceWhite.get("rook_W_R"), BorderLayout.CENTER);
		pieceWhite.get("rook_W_R").setParent(squares[5][5]);
	}
	
	private void initBarrier()
	{
		ChessBarrier barrier1 = new ChessBarrier("barrier_1");
		ChessBarrier barrier2 = new ChessBarrier("barrier_2");
		ChessBarrier barrier3 = new ChessBarrier("barrier_3");
		ChessBarrier barrier4 = new ChessBarrier("barrier_4");
		ChessBarrier barrier5 = new ChessBarrier("barrier_5");
		ChessBarrier barrier6 = new ChessBarrier("barrier_6");
		ChessBarrier barrier7 = new ChessBarrier("barrier_7");
		ChessBarrier barrier8 = new ChessBarrier("barrier_8");
		ChessBarrier barrier9 = new ChessBarrier("barrier_9");
		ChessBarrier barrier10 = new ChessBarrier("barrier_10");
		ChessBarrier barrier11 = new ChessBarrier("barrier_11");
		ChessBarrier barrier12 = new ChessBarrier("barrier_12");
		
		pieceBarrier.clear();
		pieceBarrier.put("barrier_1", barrier1);
		pieceBarrier.put("barrier_2", barrier2);
		pieceBarrier.put("barrier_3", barrier3);
		pieceBarrier.put("barrier_4", barrier4);
		pieceBarrier.put("barrier_5", barrier5);
		pieceBarrier.put("barrier_6", barrier6);
		pieceBarrier.put("barrier_7", barrier7);
		pieceBarrier.put("barrier_8", barrier8);
		pieceBarrier.put("barrier_9", barrier9);
		pieceBarrier.put("barrier_10", barrier10);
		pieceBarrier.put("barrier_11", barrier11);
		pieceBarrier.put("barrier_12", barrier12);

	}
	
	private void addBarrierPiecesToBoard()
	{
		initBarrier();
		squares[2][0].add( pieceBarrier.get("barrier_1"), BorderLayout.CENTER);
		pieceBarrier.get("barrier_1").setParent(squares[2][0]);
		squares[2][1].add( pieceBarrier.get("barrier_2"), BorderLayout.CENTER);
		pieceBarrier.get("barrier_2").setParent(squares[2][1]);
		squares[2][2].add( pieceBarrier.get("barrier_3"), BorderLayout.CENTER);
		pieceBarrier.get("barrier_3").setParent(squares[2][2]);
		squares[2][3].add( pieceBarrier.get("barrier_4"), BorderLayout.CENTER);
		pieceBarrier.get("barrier_4").setParent(squares[2][3]);
		squares[2][4].add( pieceBarrier.get("barrier_5"), BorderLayout.CENTER);
		pieceBarrier.get("barrier_5").setParent(squares[2][4]);
		squares[2][5].add( pieceBarrier.get("barrier_6"), BorderLayout.CENTER);
		pieceBarrier.get("barrier_6").setParent(squares[2][5]);
		squares[3][0].add( pieceBarrier.get("barrier_7"), BorderLayout.CENTER);
		pieceBarrier.get("barrier_7").setParent(squares[3][0]);
		squares[3][1].add( pieceBarrier.get("barrier_8"), BorderLayout.CENTER);
		pieceBarrier.get("barrier_8").setParent(squares[3][1]);
		squares[3][2].add( pieceBarrier.get("barrier_9"), BorderLayout.CENTER);
		pieceBarrier.get("barrier_9").setParent(squares[3][2]);
		squares[3][3].add( pieceBarrier.get("barrier_10"), BorderLayout.CENTER);
		pieceBarrier.get("barrier_10").setParent(squares[3][3]);
		squares[3][4].add( pieceBarrier.get("barrier_11"), BorderLayout.CENTER);
		pieceBarrier.get("barrier_11").setParent(squares[3][4]);
		squares[3][5].add( pieceBarrier.get("barrier_12"), BorderLayout.CENTER);	
		pieceBarrier.get("barrier_12").setParent(squares[3][5]);
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
					currentKey=SquarePanel.checkIfOccupied(pieceBlack,pieceWhite,e);
					
					if(isClicked==false){
						System.out.println("isClicked==false");
						if(currentKey != null){
							isClicked=true;
							existKey=currentKey;
							oldE=e;
							//SquarePanel.RemovePiece(existKey,e,pieceBlack,pieceWhite);
							//repaint();
						}else{
							isClicked=false;
						}
					}else{
						System.out.println("isClicked==true");
						//remove piece
						System.out.println("key: "+existKey);
						System.out.println("key: "+currentKey);
						
						SquarePanel.RemovePiece(existKey,oldE,pieceBlack,pieceWhite);
						
						//draw the piece
						SquarePanel.AddPiece(existKey,e,pieceBlack,pieceWhite);
						repaint();

						isClicked=false;
					}
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
	

}


