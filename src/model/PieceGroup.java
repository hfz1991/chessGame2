package model;

import java.util.ArrayList;

public class PieceGroup {
	
	private ArrayList<AbstractPiece> pieces = new ArrayList<AbstractPiece>();;
	
	public PieceGroup(AbstractPiece piece1) {
		this.pieces.add(piece1);
	}
	
	public void addPiece(AbstractPiece piece){
		this.pieces.add(piece);
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
		System.out.println("Score: " + score);
		return score;
	}
	
	public int getNumberOfPiecesInGroup() {
		return this.pieces.size();
	}
	

}
