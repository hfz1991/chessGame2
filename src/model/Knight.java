package model;

public class Knight extends AbstractPiece implements MovablePiece{
	

	
	public void move(int x, int y){
		this.setxC(x);
		this.setyC(y);
	}
	public String getName() {
		return "knight";
	}
}
