package model;

public class Player {
	private int numberOfMoves;
	private int score;
	private boolean currentTurn;
	private boolean hasRedone;
	
	public Player() {
		super();
		this.numberOfMoves = 0;
		this.score = 0;
		this.currentTurn = false;
		this.hasRedone = false;
	}
	
	public boolean addScore(int score){
		if(score<0)
			return false;
		this.score+=score;
		return true;
	}
	
	public boolean substactScore(int score){
		if(score<0)
			return false;
		this.score-=score;
		return true;
	}
}
