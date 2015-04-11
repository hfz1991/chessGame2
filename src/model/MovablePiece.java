package model;

import java.awt.Point;
import java.util.ArrayList;

public interface MovablePiece {
	
	public void move(int x, int y);
	public int getColour();
	public ArrayList<Point> getValidMoves(int x, int y);
}
