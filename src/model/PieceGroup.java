package model;

import java.util.ArrayList;

/**
 * PieceGroup - contains 0 - many pieces in a position
 * on the board.
 * @author Fang Zhou He
 * @author Michael Kowalenko
 */
public class PieceGroup {
	
	private ArrayList<AbstractPiece> pieces = new ArrayList<AbstractPiece>();;
	
	public PieceGroup(AbstractPiece piece1) {
		this.pieces.add(piece1);
	}
	
	public void addPiece(AbstractPiece piece){
		this.pieces.add(piece);
	}
	public void removePiece(AbstractPiece piece){
		this.pieces.remove(piece);
	}
	
	public ArrayList<AbstractPiece> getPieces(){
		return this.pieces;
	}
	
	public boolean containsUnmovablePiece() {
		for(AbstractPiece p : this.pieces) {
			if(!(p instanceof MovablePiece)) {
				return true;
			}
		}
		return false;
	}
	
	public int getPieceGroupColour() {
		for(AbstractPiece p : this.pieces) {
			if(p instanceof MovablePiece) {
				return ((MovablePiece)p).getColour();
			}
		}
		return -1;
	}
	
	public int getPieceGroupScore() {
		int score =0;
		for(AbstractPiece p : this.pieces) {
			score += p.getPoint();
		}
		return score;
	}
	
	public int getNumberOfPiecesInGroup() {
		return this.pieces.size();
	}
	

}
