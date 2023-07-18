package myproject;

import javax.swing.JFrame;

public class MyClass {

	public static void main(String[] args) {
		JFrame obje = new JFrame();
		Gameplay gamePlay = new Gameplay();
		obje.setBounds(10, 10, 700, 600);
		obje.setTitle("Mini Breakout Ball Game");
		obje.setResizable(false);
		obje.setVisible(true);
		obje.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obje.add(gamePlay);
	}

}
