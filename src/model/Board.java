package model;

import java.awt.Point;
import java.util.Observable;

public class Board extends Observable {
	
	private PieceGroup[][] squareArray;
	
	public Board(){
	}
	
	public void movePieces(Point from, Point to) {
		// move pieces logic here
		
//		System.out.println("From Point: "+ from.x +" y: " + from.y);
//		System.out.println("To Point: "+ to.x +" y: " + to.y);

		int fromX = from.x;
		int fromY = from.y;
		int toX = to.x;
		int toY = to.y;
		
		PieceGroup pg = squareArray[fromY][fromX];
		if (pg.getPieces() != null){

			AbstractPiece piece = pg.getPieces().get(0);
			if(!(piece instanceof Barrier)){
				MovablePiece movableP = (MovablePiece) piece;
				movableP.move(toX, toY);
				
				squareArray[fromY][fromX] = null;
				squareArray[piece.getyC()][piece.getxC()] = pg;
			}
			
		}		
		
		this.setChanged();
		this.notifyObservers();
	}
	
	public void initialisePieces() {
		this.squareArray = new PieceGroup[6][6];
		squareArray[0][0] = new PieceGroup(new Rock(0));
		squareArray[0][1] = new PieceGroup(new Bishop(0));
		squareArray[0][2] = new PieceGroup(new Knight(0));
		squareArray[0][3] = new PieceGroup(new Knight(0));
		squareArray[0][4] = new PieceGroup(new Bishop(0));
		squareArray[0][5] = new PieceGroup(new Rock(0));
		
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
		
		squareArray[5][0] = new PieceGroup(new Rock(1));
		squareArray[5][1] = new PieceGroup(new Bishop(1));
		squareArray[5][2] = new PieceGroup(new Knight(1));
		squareArray[5][3] = new PieceGroup(new Knight(1));
		squareArray[5][4] = new PieceGroup(new Bishop(1));
		squareArray[5][5] = new PieceGroup(new Rock(1));
		
		this.setChanged();
		this.notifyObservers();
	}
	
	public PieceGroup[][] getSquareArray() {
		return squareArray;
	}
	
}
