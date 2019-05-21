import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject{

Rocketship(int  x,int  y,int width,int height){
	super(x,y,width,height);	
	speed =10;
}
void draw(Graphics g) {
	g.setColor(Color.BLUE);
		System.out.println(x + " " + y + " " + width + " " +height);
	g.fillRect(x, y, width, height);
}
void update() {
	
}

public void up() {
	// TODO Auto-generated method stub
	 y-=speed;
}
public void down() {
	// TODO Auto-generated method stub
	y+=speed;
}
public void left() {
	// TODO Auto-generated method stub
	x-=speed;
}
public void right() {
	// TODO Auto-generated method stub
	x+=speed;
}
public void say() {
	System.out.println(x+ " " + ""+ y);
}

}
