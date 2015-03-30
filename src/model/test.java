package model;

import java.util.ArrayList;

public class test {
	public static void main(String[] args){
		Board board = new Board();
		Player playerA = new Player();
		Player playerB = new Player();
		ArrayList<Player> playerList = new ArrayList<Player>();
		boolean turnA=true;
		int totalOfMoves=10;
		
		playerList.add(playerA);
		playerList.add(playerB);
		GameManager gm = new GameManager(board, playerList, turnA, totalOfMoves);
		
		printDetails(gm);
	}
	
	public static void printDetails(GameManager gm){
		System.out.println("Number of moves :" + gm.getTotalOfMoves());
		System.out.println("This turn is :" + gm.getCurrentTurnOfPlayer());
	}
}
