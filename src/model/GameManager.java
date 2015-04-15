package model;
import java.util.*;

public class GameManager {
	
	private static GameManager singletonInstance = null; 
	private Board board;
	
	private ArrayList<Player> playerList = new ArrayList<Player>();
	
	private boolean turnA;
	
	public GameManager() {
		this.board = new Board();
		this.totalOfMoves = 10;
	}
	
	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}

	public ArrayList<Player> getPlayerList() {
		return playerList;
	}


	public boolean isTurnA() {
		return turnA;
	}

	public void setTurnA(boolean turnA) {
		this.turnA = turnA;
	}

	public int getTotalOfMoves() {
		return totalOfMoves;
	}

	public void setTotalOfMoves(int totalOfMoves) {
		this.totalOfMoves = totalOfMoves;
	}

	private int totalOfMoves;

	

	public void newGame() {
		this.board.initialisePieces();
	}
	
	public boolean getCurrentTurnOfPlayer(){
		return this.turnA;
	}
	
	public static GameManager getSingleton(){
		if (GameManager.singletonInstance == null)
			GameManager.singletonInstance = new GameManager();
		return GameManager.singletonInstance;
	}
	
}
