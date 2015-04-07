package model;

import java.util.Observable;

public class Board extends Observable {
	
	private PieceGroup[][] squareArray = new PieceGroup[6][6];
	
	public Board(){
		initialisePieces();
	}
	
	public void movePieces() {
		// move pieces logic here
		
		this.setChanged();
		this.notifyObservers();
	}
	
	public void initialisePieces() {
		squareArray[0][0] = new PieceGroup(new Rock());
		squareArray[0][1] = new PieceGroup(new Bishop());
		squareArray[0][2] = new PieceGroup(new Knight());
		squareArray[0][3] = new PieceGroup(new Knight());
		squareArray[0][4] = new PieceGroup(new Bishop());
		squareArray[0][5] = new PieceGroup(new Rock());
		
		squareArray[2][0] = new PieceGroup(new Barrier());
		squareArray[2][1] = new PieceGroup(new Barrier());
		squareArray[2][2] = new PieceGroup(new Barrier());
		squareArray[2][3] = new PieceGroup(new Barrier());
		squareArray[2][4] = new PieceGroup(new Barrier());
		squareArray[2][5] = new PieceGroup(new Barrier());
		
		squareArray[3][0] = new PieceGroup(new Barrier());
		squareArray[3][1] = new PieceGroup(new Barrier());
		squareArray[3][2] = new PieceGroup(new Barrier());
		squareArray[3][3] = new PieceGroup(new Barrier());
		squareArray[3][4] = new PieceGroup(new Barrier());
		squareArray[3][5] = new PieceGroup(new Barrier());
		
		squareArray[5][0] = new PieceGroup(new Rock());
		squareArray[5][1] = new PieceGroup(new Bishop());
		squareArray[5][2] = new PieceGroup(new Knight());
		squareArray[5][3] = new PieceGroup(new Knight());
		squareArray[5][4] = new PieceGroup(new Bishop());
		squareArray[5][5] = new PieceGroup(new Rock());
		
		this.setChanged();
		this.notifyObservers();
	}
	
	public PieceGroup[][] getSquareArray() {
		return squareArray;
	}
	
//	public void createPiece(){
//		squareArray = { 
//				{rockb1, },
//					
//				}
//		}
//	}
//	
	
}
