package model;

import java.awt.Point;
import java.util.ArrayList;

public class Rock extends AbstractPiece implements MovablePiece {

	private int colour;

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

	public ArrayList<Point> getValidMoves(int x, int y) {

		ArrayList<Point> pointArrayList = new ArrayList<Point>();

		// Up
		for (int i = 1; x - i >= 0; i++) {
			Point p = new Point((x - i), (y));
			pointArrayList.add(p);
		}
		
		// Down
		for (int i = 1; x + i < 6; i++) {
			Point p = new Point((x + i), (y));
			pointArrayList.add(p);
		}

		 //Right
		 for(int i=1;y+i<6;i++){
			 Point p = new Point((x),(y+i));
			 pointArrayList.add(p);
		 }

		 //Left
		 for(int i=1;y-i>=0;i++){
			 Point p = new Point((x),(y-i));
			 pointArrayList.add(p);		
		 }

		return pointArrayList;
	}
}
