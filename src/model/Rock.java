package model;

import java.awt.Point;
import java.util.ArrayList;

public class Rock extends AbstractPiece implements MovablePiece{
	
	private int colour;
	
	public Rock(int colour, int x, int y) {
		this.colour = colour;
		this.setxC(x);
		this.setyC(y);
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
	
	public ArrayList<Point> getValidMoves(int currentX, int currentY){
		return null;
	}
}
