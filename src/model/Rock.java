package model;

/**
 * Rock chess piece.
 * @author Fang Zhou He
 * @author Michael Kowalenko
 */
public class Rock extends AbstractPiece implements MovablePiece {

	public Rock(int colour, int x, int y) {
		super(colour, x, y);
	}

	public void move(int x, int y) {
		this.setxC(x);
		this.setyC(y);
	}

	public int getColour() {
		return colour;
	}

	public String getName() {
		return "rock";
	}

	
}
