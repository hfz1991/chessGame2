package model;

public abstract class AbstractPiece {
	protected int point;
	protected int xC;
	protected int yC;
	protected int colour;
	
	public AbstractPiece(int colour, int x, int y){
		this.colour = colour;
		this.setxC(x);
		this.setyC(y);
	}

	public AbstractPiece(int x, int y){
		this.setxC(x);
		this.setyC(y);
	}
	
	public int getPoint() {
		return point;
	}
	
	public void setPoint(int point) {
		this.point = point;
	}
	
	public int getxC() {
		return xC;
	}
	
	public void setxC(int xC) {
		this.xC = xC;
	}
	
	public int getyC() {
		return yC;
	}
	
	public void setyC(int yC) {
		this.yC = yC;
	}
	
	public int merge(AbstractPiece pieceA, AbstractPiece pieceB){
		pieceA.setxC(pieceB.getxC());
		pieceA.setyC(pieceB.getyC());
		
		return pieceA.getPoint()+pieceB.getPoint();
	}
	
	public int takePiece(AbstractPiece launchPiece, AbstractPiece targetPiece){
		int scoreOfPiece = targetPiece.getPoint();
		
		launchPiece.setxC(targetPiece.getxC());
		launchPiece.setyC(targetPiece.getyC());
		targetPiece.setxC(-1);
		targetPiece.setyC(-1);
		
		return scoreOfPiece;
	}
	
	public abstract String getName();
	
}
