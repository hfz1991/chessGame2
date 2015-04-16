package test;

import model.*;


public class mainTest {
	public static void main(String[] args){
		
		GameManager gm = GameManager.getSingleton();
		gm.getBoard().initialisePieces();
		
		
		System.out.println("==============================================");
		//Testing getPiece() in Board
		System.out.println("Testing getPiece() case 1...");
		PieceGroup pg = gm.getBoard().getPiece(0, 0);
		AbstractPiece ap = pg.getPieces().get(0);
		if(!(ap instanceof Rock)){
			System.out.println("Error!");
			System.out.println(ap);
		}
		else{
			System.out.println("OK");
		}
		
		
		System.out.println("Testing getPiece() case 2...");
		try{
			PieceGroup pg1 = gm.getBoard().getPiece(0, 1);
			AbstractPiece ap1 = pg1.getPieces().get(0);
			if(!(ap1 instanceof Bishop)){
				System.out.println("Error!");
				System.out.println(ap1);
			}
			else{
				System.out.println("OK");
			}
		}
		catch(Exception e){
			System.out.println("Error!NULL Pointer exception");
		}
		
		System.out.println("Testing getPiece() case 3...");
		try{
			PieceGroup pg1 = gm.getBoard().getPiece(5, 3);
			AbstractPiece ap1 = pg1.getPieces().get(0);
			if(!(ap1 instanceof Knight)){
				System.out.println("Error!");
				System.out.println(ap1);
			}
			else{
				System.out.println("OK");
			}
		}
		catch(Exception e){
			System.out.println("Error!NULL Pointer exception");
		}
		//Finish Testing getPiece() in Board
		
		//Testing addPiece() in PieceGroup
		System.out.println("==============================================");
		System.out.println("Testing addPiece() case 1...");
		PieceGroup[][] pg2 = gm.getBoard().getSquareArray();
		System.out.println("Adding piece into squareArray[0][0]...");
		pg2[0][0].addPiece(new Rock(0,0,0));
		System.out.println("Size of PieceGroup[0][0] is " +pg2[0][0].getPieces().size());
		System.out.println("Adding piece into squareArray[0][0]...");
		pg2[0][0].addPiece(new Bishop(0,0,0));
		System.out.println("Size of PieceGroup[0][0] is " +pg2[0][0].getPieces().size());

	}
}
