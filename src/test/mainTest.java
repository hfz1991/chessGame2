package test;

import model.*;


public class mainTest {
	public static void main(String[] args){
		
		GameManager gm = GameManager.getSingleton();
		gm.getBoard().initialisePieces();
		
		
		System.out.println("Testing getPice() case 1...");
		PieceGroup pg = gm.getBoard().getPiece(0, 0);
		AbstractPiece ap = pg.getPieces().get(0);
		if(!(ap instanceof Rock)){
			System.out.println("Error!");
			System.out.println(ap);
		}
		else{
			System.out.println("OK");
		}
		
		
		System.out.println("Testing getPice() case 2...");
		PieceGroup pg1 = gm.getBoard().getPiece(0, 1);
		AbstractPiece ap1 = pg1.getPieces().get(0);
		if(!(ap1 instanceof Knight)){
			System.out.println("Error!");
			System.out.println(ap1);
		}
		else{
			System.out.println("OK");
		}
	}
}
