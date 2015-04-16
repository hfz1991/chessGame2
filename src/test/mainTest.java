package test;

import java.awt.Point;

import model.*;


public class mainTest {
	public static void main(String[] args){
		
		GameManager gm = GameManager.getSingleton();
		gm.getBoard().initialisePieces();
		PieceGroup[][] square = gm.getBoard().getSquareArray();

		
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
//		System.out.println("==============================================");
//		System.out.println("Testing addPiece() case 1...");
//		PieceGroup[][] pg2 = gm.getBoard().getSquareArray();
//		System.out.println("Adding piece into squareArray[0][0]...");
//		pg2[0][0].addPiece(new Rock(0,0,0,1));
//		System.out.println("Size of PieceGroup[0][0] is " +pg2[0][0].getPieces().size());
//		System.out.println("Adding piece into squareArray[0][0]...");
//		pg2[0][0].addPiece(new Bishop(0,0,0,2));
//		System.out.println("Size of PieceGroup[0][0] is " +pg2[0][0].getPieces().size());

		//Testing movePiece() in Board
		System.out.println("==============================================");
		System.out.println("Testing movePiece() case 1...(MERGE)");
		System.out.println("\nSize of Square(5,0) (Rock) is :" + square[5][0].getPieces().size());
		System.out.println("Size of Square(5,1) (Bishop) is :" + square[5][1].getPieces().size());

		System.out.println("\nMoving Rock(5,0) to merge Bishop(5,1)...");
		Point launchPoint = new Point(0,5);
		Point targetPoint = new Point(1,5);
		gm.getBoard().movePieces(launchPoint, targetPoint);
		System.out.println("\nSize of Square(5,0) (Rock) is :");
		try{
			System.out.print(square[5][0].getPieces().size());
		}
		catch(Exception e)
		{
			System.out.println("NULL...OK");
		}
		System.out.println("Size of Square(5,1) (Bishop) is :" + square[5][1].getPieces().size());
	}
}
