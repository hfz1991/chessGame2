package model;

public class Bishop extends AbstractPiece implements MovablePiece{
	
	public void move(int x, int y){
		this.setxC(x);
		this.setyC(y);
	}
	
}
