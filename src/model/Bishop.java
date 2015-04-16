package model;


public class Bishop extends AbstractPiece implements MovablePiece{
		

	public Bishop(int colour, int x, int y) {
		super(colour, x, y);
		this.point = 5;
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
