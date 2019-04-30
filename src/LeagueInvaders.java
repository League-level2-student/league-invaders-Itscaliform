import java.awt.Dimension;

import javax.swing.JFrame;

public class LeagueInvaders {
	JFrame frame;
	GamePanel panel;
	
	static final int WIDTH=500;
	static final int HEIGHT=800;
	
	LeagueInvaders(){
		frame= new JFrame();
		panel = new GamePanel();
	}
	
	
	
	
	void setup() { 
		frame.add(panel);
		frame.setPreferredSize(new Dimension(WIDTH,HEIGHT));
		frame.addKeyListener(panel);
		frame.setVisible(true);
		
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
public static void main(String[] args) {
	LeagueInvaders league = new LeagueInvaders();
	league.setup();
}


}
