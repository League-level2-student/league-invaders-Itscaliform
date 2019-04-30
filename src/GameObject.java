import java.awt.Graphics;

public class GameObject {
	 int x;
	 int y;
	 int width;
	 int height;
	 int speed=0;
	 boolean isActive= true;
	 
	 GameObject(int x,int y,int width,int height){
		this.height=height;
		this.width=width;
		this.x=x;
		this.y=y;
	 }
	 void draw(Graphics g) {
		 
	 }
}
