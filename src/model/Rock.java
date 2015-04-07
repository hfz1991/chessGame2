package model;

public class Rock extends AbstractPiece implements MovablePiece{
	
	public void move(int x, int y){
		this.setxC(x);
		this.setyC(y);
	}
}
