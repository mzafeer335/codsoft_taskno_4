package Quiz_Application;

import java.awt.Color;
import java.awt.Font;import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Score extends JFrame {
	
	public Score(String name, int score) {
		setTitle("Score");
		setBounds(400, 100, 600, 400);
		setResizable(false);
		//setUndecorated(true);
		setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		
		JLabel heading = new JLabel("ThankYou for playing QUIZ Test");
		heading.setBounds(70, 60, 700, 35);
		heading.setFont(new Font("Arial Black", Font.BOLD, 25));
		add(heading);
		
		JLabel Name = new JLabel("Name: "+name);
		Name.setBounds(200, 140, 300, 40);
		Name.setFont(new Font("Baskerville Old Face", Font.BOLD, 25));
		add(Name);
		
		
		JLabel Score = new JLabel("Score: " +score);
	    Score.setBounds(200, 180, 300, 30);
		Score.setFont(new Font("Baskerville Old Face", Font.BOLD, 25));
		add(Score);
		
		
		
		JButton exit = new JButton("EXIT");
		exit.setBounds(230, 250, 120, 30);
		exit.setBackground(Color.BLACK);
		exit.setForeground(Color.WHITE);
		add(exit);
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				 setVisible(false);
				 new QuizApp();
				
			}
		});
		
		
		setVisible(true);
	}

	public static void main(String[] args) {
		 new Score("User", 0);

	}

}
