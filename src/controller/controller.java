package controller;
import view.View;
import model.GameManager;

public class controller {
	public static void main(String[] args){
		View view = new View();		
		
		GameManager gm = GameManager.getSingleton();
		gm.getBoard().addObserver(view.getBoardPanel());
		view.setVisible(true);
		
		
	}
}
