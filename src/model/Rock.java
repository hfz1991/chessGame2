package model;

public class Rock extends AbstractPiece implements MovablePiece{
	
	private int colour;
	
	public Rock(int colour) {
		this.colour = colour;
	}

	public void move(int x, int y){
		this.setxC(x);
		this.setyC(y);
	}
	
	public int getColour(){
		return colour;
	}
	
	public String getName() {
		return "rook";
	}
}
