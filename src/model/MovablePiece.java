package model;

import java.awt.Point;
import java.util.ArrayList;

/**
 * MovablePiece interface - defines the methods to be implemented
 * by pieces that can move.
 * @author Fang Zhou He
 * @author Michael Kowalenko
 */
public interface MovablePiece {
	
	public abstract void move(int x, int y);
	public abstract int getColour();
}
