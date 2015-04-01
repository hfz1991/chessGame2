package ChessPieces;

import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public abstract class AbstractPiece extends JLabel{
	

	protected int point;
	protected String name;
	protected JPanel parent; 
	protected int x;
	protected int y;
	public AbstractPiece(String path, String name)
	{
		super("", new ImageIcon(path), JLabel.CENTER);	
		this.name = name;
		point = 5;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public abstract void move(JPanel postion, int x, int y);
	public abstract List<MovablePostion> getVaildPostion();
	
	public int points()
	{
		return point;
	}
	
	
	public ChessSuperPiece merge(AbstractPiece piece, String name)
	{
		if(this.point  + piece.point > 15)
			return null;
		ChessSuperPiece superPiece = new ChessSuperPiece(name);
		piece.getParent().removeAll();
		piece.getParent().updateUI();
		this.parent.removeAll();
		this.parent.updateUI();
		superPiece.parent = piece.getParent();
		return superPiece;		
	}
	
	public JPanel getParent()
	{
		return parent;
	}
	
	public void setParent(JPanel parent)
	{
		this.parent = parent;
	}
	
	public void takePiece(AbstractPiece piece)//chi
	{
		
	}

	
	public String getName()
	{
		return this.name;
	}
}
