package model;

import java.awt.Point;
import java.util.ArrayList;

public class Knight extends AbstractPiece implements MovablePiece{
		
	public Knight(int colour, int x, int y) {
		super(colour, x, y);

	}
	
	public void move(int x, int y){
		this.setxC(x);
		this.setyC(y);
	}
	
	public int getColour(){
		return colour;
	}
	
	public String getName() {
		return "knight";
	}
	
	
}
