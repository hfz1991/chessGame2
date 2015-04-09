package model;

public class Bishop extends AbstractPiece implements MovablePiece{
	
	private int colour;
	
	public Bishop(int colour) {
		this.colour = colour;
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
}
