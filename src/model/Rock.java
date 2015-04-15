package model;

import java.awt.Point;
import java.util.ArrayList;

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
		return "rook";
	}

	
}
