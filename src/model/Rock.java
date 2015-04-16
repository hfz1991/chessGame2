package model;


public class Rock extends AbstractPiece implements MovablePiece {


	public Rock(int colour, int x, int y) {
		super(colour, x, y);
		this.point = 5;
	}

	public void move(int x, int y) {
		this.setxC(x);
		this.setyC(y);
	}

	public int getColour() {
		return colour;
	}

	public String getName() {
		return "rook";
	}

	
}
