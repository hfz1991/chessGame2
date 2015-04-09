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

import controller.SplitDialogueListener;
import controller.UndoDialogueListener;

public class InfoPanel extends JPanel  {
	
	GridLayout layout2 =new GridLayout(3,1);
	
	private JLabel whiteLabel;
	private JLabel moveW;
	private JLabel scoreW;
	private JLabel numMoveW;
	private JLabel numScoreW;
	
	private JLabel blackLabel;
	private JLabel moveB;
	private JLabel scoreB;
	private JLabel numMoveB;
	private JLabel numScoreB;
	
	private JLabel time;
	private JLabel timerLabel;
	private JButton newGame;
	private JButton goBack;
	private JButton split;
	
	private Box moveWhite;
	private Box scoreWhite;
	private Box scoreBlack;
	private Box moveBlack;
	private Box timerBox;
	private Box buttonBox;
	
	private JPanel whitePanel;
	private JPanel blackPanel;
	BoardPanel board;
	NewGameDialogue newGameDia;
	
	UndoDialogue undoDia;
	
	public InfoPanel(final JFrame parent, BoardPanel panel){
		
	    setPreferredSize(new Dimension(240, 640));
	    
	    /*******************************White Player********************************/
	    //setup information panel for white player
	    whitePanel = new JPanel(layout2);
	    whitePanel.setBackground(Color.WHITE);
	    whitePanel.setBorder(new LineBorder(new Color(0, 0, 0)));
	    whitePanel.setPreferredSize(new Dimension(240, 210));
	    
	    //initialize for White player
	    
	    moveWhite = Box.createHorizontalBox();
	    scoreWhite = Box.createHorizontalBox();
	    
	    whiteLabel = new JLabel("  White:");
	    moveW = new JLabel("  Moves:   ");
	    scoreW = new JLabel("  Score:   ");
	    numMoveW = new JLabel("0");
	    numScoreW = new JLabel("0");
	    
	    whitePanel.add(whiteLabel);
	    
	    moveWhite.add(moveW);
	    moveWhite.add(numMoveW);
	    whitePanel.add(moveWhite);
	  
	    scoreWhite.add(scoreW);
	    scoreWhite.add(numScoreW);
	    whitePanel.add(scoreWhite);
	   
	    /******************************End of White Player*********************************/
	    /******************************Black Player*********************************/
	    
	    //setup information panel for black player
	    blackPanel = new JPanel(layout2);
	    blackPanel.setBackground(Color.BLACK);
	    whitePanel.setBorder(new LineBorder(new Color(0, 0, 0)));
	    blackPanel.setPreferredSize(new Dimension(240, 210));
	    
	    //initialize for White player
	    
	    moveBlack = Box.createHorizontalBox();
	    scoreBlack = Box.createHorizontalBox();
	    
	    blackLabel = new JLabel("  Black:");
	    moveB = new JLabel("  Moves:    ");
	    scoreB = new JLabel("  Score:     ");
	    numMoveB = new JLabel("0");
	    numScoreB = new JLabel("0");
	    
	    blackLabel.setForeground(Color.WHITE);
	    moveB.setForeground(Color.WHITE);
	    scoreB.setForeground(Color.WHITE);
	    numMoveB.setForeground(Color.WHITE);
	    numScoreB.setForeground(Color.WHITE);
	    
	    blackPanel.add(blackLabel);
	    moveBlack.add(moveB);
	    moveBlack.add(numMoveB);
	    
	    blackPanel.add(moveBlack);
	  
	    scoreBlack.add(scoreB);
	    scoreBlack.add(numScoreB);
	    
	    blackPanel.add(scoreBlack);
	    
	    /*******************************End of Black Player********************************/
	    
	    JPanel buttonP = new JPanel(layout2);
	    buttonP.setBackground(Color.WHITE);
	    buttonP.setPreferredSize(new Dimension(240, 200));
	    
	    time = new JLabel("Time:    ");
	    timerLabel = new JLabel("0:0");
	    newGame = new JButton("New Game");
	    goBack = new JButton("Return");
	    split = new JButton("Split");
	    
	    timerBox = Box.createHorizontalBox();
	    
	    timerBox.add(time);
	    timerBox.add(timerLabel);
	    
	    buttonBox = Box.createHorizontalBox();
	    
	    //goBack.setBounds(10,10,25,10);
	    
	    goBack.addActionListener(new UndoDialogueListener());
	    split.addActionListener(new SplitDialogueListener());
	    
	    buttonBox.add(goBack);
	    buttonBox.add(split);
	    
	    buttonP.add(timerBox);
	    buttonP.add(newGame);
	    buttonP.add(buttonBox);
	    
	    add(whitePanel,BorderLayout.NORTH);
	    add(blackPanel,BorderLayout.CENTER);
	    add(buttonP,BorderLayout.SOUTH);
	    
	    board = panel;
	    
	    newGame.addActionListener(new ActionListener()
	    {
			@Override
			public void actionPerformed(ActionEvent arg0) {

				newGameDia = new NewGameDialogue();
				
				if(newGameDia.getIsCanceled())
					return;
				
				//setTimer();
				
			}
	    });
	}
	
	// Time Function
	
	/*int second = 0;
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
	}*/
	

}
