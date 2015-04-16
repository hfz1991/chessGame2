package model;
import java.util.*;

public class GameManager {
	
	public static final int BLACK_PLAYER = 1;
	public static final int WHITE_PLAYER = 2;
	
	private static GameManager singletonInstance = null; 
	private Board board;
	
	private ArrayList<Player> playerList = new ArrayList<Player>();
	
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

	public int getTotalOfMoves() {
		return totalOfMoves;
	}

	public void setTotalOfMoves(int totalOfMoves) {
		this.totalOfMoves = totalOfMoves;
	}

	private int totalOfMoves;

	

	public void newGame() {
		System.out.println("new game");
		this.board.initialisePieces();
		Player player1 = new Player(BLACK_PLAYER);
		player1.setCurrentTurn(true);
		Player player2 = new Player(WHITE_PLAYER);	// White = player 2, black = player 1
		this.playerList.add(player1);
		this.playerList.add(player2);
	}
	
	public void increaseMoveNumber() {
		for(Player p : this.playerList) {
			if(p.getCurrentTurn()) {
				p.addMove();
				return;
			}
		}
	}
	
	public void nextPlayersTurn() {
		Player player1 = this.playerList.get(0);
		Player player2 = this.playerList.get(1);
		if(player1.getCurrentTurn()) {
			player1.setCurrentTurn(false);
			player2.setCurrentTurn(true);
		} else {
			player1.setCurrentTurn(true);
			player2.setCurrentTurn(false);
		}
	}
	
	public int getCurrentPlayerTurnColour() {
		Player p = this.getCurrentPlayer();
		if(p != null) {
			return p.getPlayerNumber();
		}
		return GameManager.BLACK_PLAYER;
	}
	
	private Player getCurrentPlayer() {
		for(Player p : this.playerList) {
			if(p.getCurrentTurn()) {
				return p;
			}
		}
		return null;
	}
	
	public void addScoreToCurrentPlayer(int scoreChange) {
		Player p = this.getCurrentPlayer();
		if(p != null) {
			p.addScore(scoreChange);
		}
	}
	
	public boolean bothPlayersHadMaxTurns() {
		for(Player p : this.playerList) {
			if(p.getNumberOfMoves() < this.totalOfMoves) {
				return true;
			}
		}
		return true;
	}
	
	public static GameManager getSingleton(){
		if (GameManager.singletonInstance == null)
			GameManager.singletonInstance = new GameManager();
		return GameManager.singletonInstance;
	}
	
}
