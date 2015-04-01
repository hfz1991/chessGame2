package ChessPieces;

import java.util.List;

import javax.swing.JPanel;

public class ChessSuperPiece extends AbstractPiece {

	public ChessSuperPiece(String name) {
		super("src/img/star.png", name);
		// TODO Auto-generated constructor stub
		super.point += 5;
	}

	@Override
	public  void move(JPanel postion, int x, int y) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<MovablePostion> getVaildPostion() {
		// TODO Auto-generated method stub
		return null;
	}

}
