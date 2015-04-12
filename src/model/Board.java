package model;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Observable;

public class Board extends Observable {

	private PieceGroup[][] squareArray;

	public Board() {
	}

	public void movePieces(Point from, Point to) {
		// move pieces logic here

		// System.out.println("From Point: "+ from.x +" y: " + from.y);
		// System.out.println("To Point: "+ to.x +" y: " + to.y);

		int fromX = from.x;
		int fromY = from.y;
		int toX = to.x;
		int toY = to.y;

		PieceGroup pg = squareArray[fromY][fromX];
		
		try{
		if (pg.getPieces() != null) {

			AbstractPiece piece = pg.getPieces().get(0);
			if (!(piece instanceof Barrier)) {
				MovablePiece movableP = (MovablePiece) piece;

				// test getValidMoves, delete later
				movableP.getValidMoves(fromY, fromX);

				movableP.move(toX, toY);

				squareArray[fromY][fromX] = null;
				squareArray[piece.getyC()][piece.getxC()] = pg;
			}

		}
		}
		catch(Exception e){
			System.out.println("Cannot choose empty square");
		}


		this.setChanged();
		this.notifyObservers();
	}

	public void initialisePieces() {
		this.squareArray = new PieceGroup[6][6];

		squareArray[0][0] = new PieceGroup(new Rock(0, 0, 0));
		squareArray[0][1] = new PieceGroup(new Bishop(0, 0, 1));
		squareArray[0][2] = new PieceGroup(new Knight(0, 0, 2));
		squareArray[0][3] = new PieceGroup(new Knight(0, 0, 3));
		squareArray[0][4] = new PieceGroup(new Bishop(0, 0, 4));
		squareArray[0][5] = new PieceGroup(new Rock(0, 0, 5));

		squareArray[2][0] = new PieceGroup(new Barrier(2, 0));
		squareArray[2][1] = new PieceGroup(new Barrier(2, 1));
		squareArray[2][2] = new PieceGroup(new Barrier(2, 2));
		squareArray[2][3] = new PieceGroup(new Barrier(2, 3));
		squareArray[2][4] = new PieceGroup(new Barrier(2, 4));
		squareArray[2][5] = new PieceGroup(new Barrier(2, 5));

		squareArray[3][0] = new PieceGroup(new Barrier(3, 0));
		squareArray[3][1] = new PieceGroup(new Barrier(3, 1));
		squareArray[3][2] = new PieceGroup(new Barrier(3, 2));
		squareArray[3][3] = new PieceGroup(new Barrier(3, 3));
		squareArray[3][4] = new PieceGroup(new Barrier(3, 4));
		squareArray[3][5] = new PieceGroup(new Barrier(3, 5));

		squareArray[5][0] = new PieceGroup(new Rock(1, 5, 0));
		squareArray[5][1] = new PieceGroup(new Bishop(1, 5, 1));
		squareArray[5][2] = new PieceGroup(new Knight(1, 5, 2));
		squareArray[5][3] = new PieceGroup(new Knight(1, 5, 3));
		squareArray[5][4] = new PieceGroup(new Bishop(1, 5, 4));
		squareArray[5][5] = new PieceGroup(new Rock(1, 5, 5));


		this.setChanged();
		this.notifyObservers();
	}

	public PieceGroup[][] getSquareArray() {
		return squareArray;
	}

	public ArrayList<Point> getValidMoves(int currentX, int currentY){
		
		int x = currentX;
		int y = currentY;
		
		PieceGroup pg = this.squareArray[x][y];
		ArrayList<Point> array = null;
		if (pg.getPieces() != null) {

			AbstractPiece piece = pg.getPieces().get(0);
			if (!(piece instanceof Barrier)) {
				MovablePiece movableP = (MovablePiece) piece;

				array = movableP.getValidMoves(x, y);
			}
		}
	
		
		//remove the path after the piece in that path 
		//....
		return array;
	}

}
