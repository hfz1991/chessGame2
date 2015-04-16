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
	

}
