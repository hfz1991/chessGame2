package model;

import java.awt.Point;
import java.util.ArrayList;

public class Knight extends AbstractPiece implements MovablePiece{
	
	private int colour;
	
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
	
	public ArrayList<Point> getValidMoves(int x, int y){
		ArrayList<Point> pointArrayList = new ArrayList<Point>();

		// Right Bottom Horizontal 
		if (x + 1 < 6) {
			if (y + 2 < 6) {
				Point p = new Point((x + 1), (y + 2));
				pointArrayList.add(p);
				// System.out.println("Valid X:" + (x+i) + "Valid y:" + (y+i) );
			}
		}

		// Right Bottom Vertical
		if (x + 2 < 6) {
			if (y + 1 < 6) {
				Point p = new Point((x + 2), (y + 1));
				pointArrayList.add(p);
				// System.out.println("Valid X:" + (x+i) + "Valid y:" + (y+i) );
			}
		}	
				
		// Left Bottom Horizontal
		if ( x + 1 < 6) {
			if (y - 2 >= 0) {
				Point p = new Point((x + 1), (y - 2));
				pointArrayList.add(p);
				// System.out.println("Valid X:" + (x+i) + "Valid y:" + (y-i) );
			}
		}

		// Left Bottom Vertical
		if (x + 2 < 6) {
			if (y - 1 >= 0) {
				Point p = new Point((x + 2), (y - 1));
				pointArrayList.add(p);
				// System.out.println("Valid X:" + (x+i) + "Valid y:" + (y-i) );
			}
		}
		
		// Right Up Horizontal
		if (x - 1 >= 0) {
			if (y + 2 < 6) {
				Point p = new Point((x - 1), (y + 2));
				pointArrayList.add(p);
				// System.out.println("Valid X:" + (x-i) + "Valid y:" + (y+i) );
			}
		}

		// Right Up Vertical
		if (x - 2 >= 0) {
			if (y + 1 < 6) {
				Point p = new Point((x - 2), (y + 1));
				pointArrayList.add(p);
				// System.out.println("Valid X:" + (x-i) + "Valid y:" + (y+i) );
			}
		}
		
		// Left Up Horizontal
		if (x - 1 >= 0) {
			if (y - 2 >= 0) {
				Point p = new Point((x - 1), (y - 2));
				pointArrayList.add(p);
				// System.out.println("Valid X:" + (x-i) + "Valid y:" + (y-i) );
			}
		}
		
		// Left Up Vertical
		if (x - 2 >= 0) {
			if (y - 1 >= 0) {
				Point p = new Point((x - 2), (y - 1));
				pointArrayList.add(p);
				// System.out.println("Valid X:" + (x-i) + "Valid y:" + (y-i) );
			}
		}
				
		return pointArrayList;
	}
	
}
