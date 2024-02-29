package Quiz_Application;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class QuizApp extends JFrame implements ActionListener {
	
	 
	JButton btnnext, btnback;
	JTextField tf1;
	
	 
	public QuizApp() {
		 setTitle("Quiz Application with Timer");
		 setBounds(150, 150, 1000, 500);
		 setResizable(false);
	//	 setUndecorated(true);
		 setLayout(null);
		 getContentPane().setBackground(Color.WHITE);
		 
		 Font f = new Font("Arial Black", Font.BOLD, 40);
		 
		 JLabel l1 = new JLabel("QUIZ TEST");
		 l1.setBounds(150, 60, 300, 50);
		 l1.setFont(f);
		 add(l1);
		 
		 Font f1 = new Font("Baskerville Old Face", Font.BOLD, 25);
		 JLabel l2 = new JLabel("Enter Your Name");
		 l2.setBounds(180, 170, 250, 30);
		 l2.setFont(f1);
		 add(l2);
		
		 tf1 = new JTextField();
		 tf1.setBounds(110, 230, 350, 25);
		 add(tf1);
		 
		 btnnext = new JButton("NEXT");
		 btnnext.setBounds(120, 310, 150, 25);
		 btnnext.setBackground(Color.BLACK);
		 btnnext.setForeground(Color.WHITE);
		 btnnext.addActionListener(this);
		 add(btnnext);
		
		 btnback = new JButton("BACK");
		 btnback.setBounds(300, 310, 150, 25);
		 btnback.setBackground(Color.BLACK);
		 btnback.setForeground(Color.WHITE);
		 btnback.addActionListener(this);
		 add(btnback);
		 
		 
		 
		 Font f3 = new Font("Baskerville Old Face", Font.BOLD, 30);
		 JLabel l3 = new JLabel("Quiz Rules");
		 l3.setBounds(630, 60, 150, 30);
		 l3.setFont(f3);
		 add(l3);
		 
		 Font fr = new Font("Arial", Font.PLAIN, 14);
		 JLabel r1 = new JLabel("1. There are a total 10 questions.");
		 r1.setBounds(530, 150, 350, 30);
		 r1.setFont(fr);
		 add(r1);
		 
		 JLabel r2 = new JLabel("2. You only have 30 seconds to answer the questions.");
		 r2.setBounds(530, 190, 350, 30);
		 r2.setFont(fr);
		 add(r2);
		 
		 JLabel r3 = new JLabel("3. Every question contains 10 marks.");
		 r3.setBounds(530, 230, 350, 30);
		 r3.setFont(fr);
		 add(r3);
		 
		 JLabel r4 = new JLabel("4. No cell phones or other secondary devices in the room or test area.");
		 r4.setBounds(530, 270, 450, 30);
		 r4.setFont(fr);
		 add(r4);
		 
		 JLabel r5 = new JLabel("5. No one else can be in the room with you.");
		 r5.setBounds(530, 310, 350, 30);
		 r5.setFont(fr);
		 add(r5);
		 
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		 if(e.getSource() == btnnext) {
			 String name = tf1.getText();
			   
			 JOptionPane.showMessageDialog(null, "You are redirected to Quiz Test Page...");
			 
			 new Questions(name);
			 setVisible(false);
			 
			 
		 }
		 else {
			 setVisible(false);
		 }
		
	}
	 
	public static void main(String[] args) {
		 QuizApp qa = new QuizApp();

	}

}
