import java.awt.Graphics;
import java.awt.Rectangle;

public class GameObject {
	 int x;
	 int y;
	 int width;
	 int height;
	 int speed=0;
	 Rectangle CollisionBox;
	 boolean isActive= true;
	 
	 GameObject(int x,int y,int width,int height){
		 
		 Rectangle CollisionBox= new Rectangle(x,y,width,height);
		this.height=height;
		this.width=width;
		this.x=x;
		this.y=y;
		
	 }
	 void draw(Graphics g) {
		 
	 }
	 void update() {
		 CollisionBox.setBounds(x,y,width,height);
		
	 }
}
