package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.util.Timer;
import java.util.TimerTask;

import javax.swing.border.LineBorder;

public class InfoPanel extends JPanel  {
	
	GridLayout layout2 =new GridLayout(3,1);
	
	private JLabel white;
	private JLabel moveW;
	private JLabel scoreW;
	private JLabel numMoveW;
	private JLabel numScoreW;
	
	private JLabel black;
	private JLabel moveB;
	private JLabel scoreB;
	private JLabel numMoveB;
	private JLabel numScoreB;
	
	private JLabel time;
	private JLabel timerLabel;
	private Timer timer;
	private JButton newGame;
	private JButton goBack;
	
	private Box moveWhite;
	private Box scoreWhite;
	private Box scoreBlack;
	private Box moveBlack;
	private Box timerBox;
	
	private JPanel whiteC;
	private JPanel blackC;
	private MyTimerActionListener timerActionListener;
	private JFrame parent;
	BoardPanel board;
	NewGameDialogue newGameDia;
	
	public InfoPanel(final JFrame parent, BoardPanel panel){

		
	    setPreferredSize(new Dimension(300, 640));
	    this.parent = parent;
	    /*******************************White Player********************************/
	    //setup information panel for white player
	    whiteC = new JPanel(layout2);
	    whiteC.setBackground(Color.WHITE);
	    whiteC.setBorder(new LineBorder(new Color(0, 0, 0)));
	    whiteC.setPreferredSize(new Dimension(300, 210));
	    
	    //initialize for White player
	    
	    moveWhite = Box.createHorizontalBox();
	    scoreWhite = Box.createHorizontalBox();
	    
	    white = new JLabel("  White:");
	    moveW = new JLabel("  Moves:   ");
	    scoreW = new JLabel("  Score:   ");
	    numMoveW = new JLabel("0");
	    numScoreW = new JLabel("0");
	    
	    whiteC.add(white);
	    
	    moveWhite.add(moveW);
	    moveWhite.add(numMoveW);
	    whiteC.add(moveWhite);
	  
	    scoreWhite.add(scoreW);
	    scoreWhite.add(numScoreW);
	    whiteC.add(scoreWhite);
	   
	    /******************************End of White Player*********************************/
	    /******************************Black Player*********************************/
	    
	    //setup information panel for black player
	    blackC = new JPanel(layout2);
	    blackC.setBackground(Color.BLACK);
	    whiteC.setBorder(new LineBorder(new Color(0, 0, 0)));
	    blackC.setPreferredSize(new Dimension(300, 210));
	    
	    //initialize for White player
	    
	    moveBlack = Box.createHorizontalBox();
	    scoreBlack = Box.createHorizontalBox();
	    
	    black = new JLabel("  Black:");
	    moveB = new JLabel("  Moves:    ");
	    scoreB = new JLabel("  Score:     ");
	    numMoveB = new JLabel("0");
	    numScoreB = new JLabel("0");
	    
	    black.setForeground(Color.WHITE);
	    moveB.setForeground(Color.WHITE);
	    scoreB.setForeground(Color.WHITE);
	    numMoveB.setForeground(Color.WHITE);
	    numScoreB.setForeground(Color.WHITE);
	    
	    blackC.add(black);
	    moveBlack.add(moveB);
	    moveBlack.add(numMoveB);
	    
	    blackC.add(moveBlack);
	  
	    scoreBlack.add(scoreB);
	    scoreBlack.add(numScoreB);
	    
	    blackC.add(scoreBlack);
	    
	    /*******************************End of Black Player********************************/
	    
	    
	    JPanel buttonP = new JPanel(layout2);
	    buttonP.setBackground(Color.WHITE);
	    buttonP.setPreferredSize(new Dimension(300, 200));
	    
	    time = new JLabel("Time:    ");
	    timerLabel = new JLabel("0:0");
	    newGame = new JButton("New Game");
	    goBack = new JButton("Return");
	    
	    timerBox = Box.createHorizontalBox();
	    
	    timerBox.add(time);
	    timerBox.add(timerLabel);
	    
	    buttonP.add(timerBox);
	    //buttonP.add(time);
	    buttonP.add(newGame);
	    buttonP.add(goBack);
	    
	    add(whiteC,BorderLayout.NORTH);
	    add(blackC,BorderLayout.CENTER);
	    add(buttonP,BorderLayout.SOUTH);
	    
	    //board = new BoardPanel();
	    board = panel;
	    
	    
	    newGame.addActionListener(new ActionListener()
	    {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				//board.setInitGame();
				newGameDia = new NewGameDialogue();
				//System.out.print("test");;
				if(newGameDia.getIsCanceled())
					return;
				board.setInitGame();
				
				setTimer();
				
			}
	    });
	    
	    goBack.addActionListener(new ActionListener()
	    {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//setTimer();
			}
	    	
	    });
	}
	
	int second = 0;
	int minute = 0;
	public void setTimer()
	{
		second = 0;
		minute = 0;
		if(timer != null)
			timer.cancel();
		timer = new Timer();
		timer.schedule(new TimerTask()
		{

			@Override
			public void run() {
				// TODO Auto-generated method stub
				second ++;
				if(second == 60){
					minute ++; 
					second = 0;
				}
				timerLabel.setText(minute + ":" + second);
				if(minute == 1)
				{
					if(timerActionListener != null)
					{
						timerActionListener.onTimerActionEvent();
					}
				}
			}
			
		}, 0, 1000);
	}
	
	public void stopTimer()
	{
		second = 0;
		minute = 0;
		timerLabel.setText("0:0");
		if(timer != null)
			timer.cancel();
	}
	
	public void setTimerActionListener(MyTimerActionListener listener)
	{
		timerActionListener = listener;
	}
	

}
