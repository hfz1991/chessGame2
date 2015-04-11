package model;

import java.awt.Point;
import java.util.ArrayList;

public class Bishop extends AbstractPiece implements MovablePiece{
	
	private int colour;
	
	public Bishop(int colour, int x, int y) {
		this.colour = colour;
		this.setxC(x);
		this.setyC(y);
	}
	
	public void move(int x, int y){
		System.out.println("X:" + this.getxC() + "Y:" + this.getyC());
		this.setxC(x);
		this.setyC(y);
	}
	
	public int getColour(){
		return colour;
	}

	
	public String getName() {
		return "bishop";
	}
	
	public ArrayList<Point> getValidMoves(int currentX, int currentY){
		int x = currentX;
		int y = currentY;
		
		ArrayList<Point> pointArrayList = new ArrayList<Point>();
		
		//Right Bottom
		for(int i=1;x+i<6;i++){
			if(y+i<6){
				Point p = new Point((x+i),(y+i));
				pointArrayList.add(p);
//				System.out.println("Valid X:" + (x+i) + "Valid y:" + (y+i) );
			}
		}
		
		//Left Bottom
		for(int i=1;x+i<6;i++){
			if(y-i>=0){
				Point p = new Point((x+i),(y-i));
				pointArrayList.add(p);
//				System.out.println("Valid X:" + (x+i) + "Valid y:" + (y-i) );
			}
		}
		
		//Right Up
		for(int i=1;x-i>=0;i++){
			if(y+i<6){
				Point p = new Point((x-i),(y+i));
				pointArrayList.add(p);
//				System.out.println("Valid X:" + (x-i) + "Valid y:" + (y+i) );
			}
		}
		
		//Left Up
		for(int i=1;x-i>=0;i++){
			if(y-i>=0){
				Point p = new Point((x-i),(y-i));
				pointArrayList.add(p);
//				System.out.println("Valid X:" + (x-i) + "Valid y:" + (y-i) );
			}
		}
		
		
		
		
		
		return pointArrayList;
	}

}
