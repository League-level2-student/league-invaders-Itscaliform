import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {
Rocketship bobby;
ArrayList <Alien> aliens= new ArrayList <Alien>();

ArrayList <Projectile> Projectile = new ArrayList <Projectile>();

Random random= new Random();

ObjectManager(Rocketship bobby){
	this.bobby=bobby;
}
void addProjectile(Projectile bobby){
	Projectile.add(bobby);
}

void addAlien() {
	aliens.add(new Alien(random.nextInt(LeagueInvaders.WIDTH),0,50,50));
}

void update() {
	bobby.update();
	for (int i = 0; i < Projectile.size(); i++) {
		
		Projectile.get(i).update();
		
	}
	for (int i = 0; i < aliens.size(); i++) {
		
		aliens.get(i).update();
		
	}
	
}
void draw(Graphics g){
	bobby.draw(g);
	for (int i = 0; i < Projectile.size(); i++) {
		Projectile.get(i).draw(g);
		
	}
	for (int i = 0; i < aliens.size(); i++) {
		aliens.get(i).draw(g);
		
	}
}

void purgeObjects() {
	for (int i = 0; i < Projectile.size(); i++) {
		
		
		

		if (Projectile.get(i).isActive == false) {
			Projectile.remove(i);
			
		}
	}
	for (int i = 0; i < aliens.size(); i++) {
		
		
		if (aliens.get(i).isActive == false) {
			aliens.remove(i);
			
		}
}
}}
