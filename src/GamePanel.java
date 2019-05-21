

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	
	  final int MENU = 0;
	    final int GAME = 1;
	    Timer frameDraw;
	    final int END = 2;
	    Rocketship rocky= new Rocketship(250,500,50,50);
	    ObjectManager Manage= new ObjectManager(rocky);
	    int currentState = MENU;
	Font titleFont;
	GamePanel(){
		 titleFont = new Font("Arial", Font.PLAIN, 48);
		   frameDraw = new Timer(1000/60,this);
		    frameDraw.start();
	}
	
	
	@Override

	public void paintComponent(Graphics g){
		if(currentState == MENU){
		    drawMenuState(g);
		}else if(currentState == GAME){
		    drawGameState(g);
		}else if(currentState == END){
		    drawEndState(g);
		}
	}
	
	void updateMenuState() { 
		
	}
	void  updateGameState() { 
		Manage.update();
	}
	void  updateEndState()  { 
		
	}
	 void drawMenuState(Graphics g) {
		 g.setColor(Color.BLUE);
		 g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		 
		 g.setFont(titleFont);
		 g.setColor(Color.YELLOW);
		 g.drawString("League Invaders", 20, 120);
		 g.drawString("Press ENTER to start", 20, 200);
		 g.drawString("Press SPACE for instructions", 20, 400);
	 }
	void  drawGameState(Graphics g) { 
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		Manage.draw(g);
	}
	void drawEndState(Graphics g)  {
		g.setColor(Color.red);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		 g.setFont(titleFont);
		 g.setColor(Color.black);
		 g.drawString("Game Over>", 20, 120);
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		repaint();
		System.out.println("Action");
		
		if(currentState == MENU){
		    updateMenuState();
		}else if(currentState == GAME){
		    updateGameState();
		}else if(currentState == END){
		    updateEndState();
		}
		
	}


	@Override
	public void keyPressed(KeyEvent arg01) {
		// TODO Auto-generated method stub
	
		if (arg01.getKeyCode()==KeyEvent.VK_ENTER) {
		    if (currentState == END) {
		        currentState = MENU;
		    } else {
		        currentState++;
		    }
		}
		if (arg01.getKeyCode()==KeyEvent.VK_UP) {
		    System.out.println("up");
		    if (rocky.y>0) {
		    	rocky.up();
				  rocky.say();
		    }
		    
		    
		}
		if (arg01.getKeyCode()==KeyEvent.VK_DOWN) {
		    System.out.println();
		    if (rocky.y<650) {
		    	rocky.down();
			    System.out.println("Down");
		    }
		}		
		if (arg01.getKeyCode()==KeyEvent.VK_LEFT) {
		    System.out.println("Left");
		    if(rocky.x>0) {
		    rocky.left();
		    System.out.println("Down");
		    }
		}
		if (arg01.getKeyCode()==KeyEvent.VK_RIGHT) {
		    System.out.println("Right");
		    if(rocky.x<430) {
		    	 rocky.right();
		    System.out.println("Down");
		    }
		   
		}
	
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	if (arg0.getKeyCode()==KeyEvent.VK_UP) {
	    System.out.println("up");
	    if (rocky.y>0) {
	    	rocky.up();
			  rocky.say();
	    }
	    
	    
	}
	if (arg0.getKeyCode()==KeyEvent.VK_DOWN) {
	    System.out.println();
	    if (rocky.y<650) {
	    	rocky.down();
		    System.out.println("Down");
	    }
	}		
	if (arg0.getKeyCode()==KeyEvent.VK_LEFT) {
	    System.out.println("Left");
	    if(rocky.x>0) {
	    rocky.left();
	    System.out.println("Down");
	    }
	}
	if (arg0.getKeyCode()==KeyEvent.VK_RIGHT) {
	    System.out.println("Right");
	    if(rocky.x<430) {
	    	 rocky.right();
	    System.out.println("Down");
	    }
	   
	}
	}


	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getKeyCode()==KeyEvent.VK_UP) {
		    System.out.println("up");
		    if (rocky.y>0) {
		    	rocky.up();
				  rocky.say();
		    }
		    
		    
		}
		if (arg0.getKeyCode()==KeyEvent.VK_DOWN) {
		    System.out.println();
		    if (rocky.y<650) {
		    	rocky.down();
			    System.out.println("Down");
		    }
		}		
		if (arg0.getKeyCode()==KeyEvent.VK_LEFT) {
		    System.out.println("Left");
		    if(rocky.x>0) {
		    rocky.left();
		    System.out.println("Down");
		    }
		}
		if (arg0.getKeyCode()==KeyEvent.VK_RIGHT) {
		    System.out.println("Right");
		    if(rocky.x<430) {
		    	 rocky.right();
		    System.out.println("Down");
		    }
		   
		}
	}
}
