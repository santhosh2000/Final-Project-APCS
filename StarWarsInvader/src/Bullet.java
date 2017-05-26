

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
// help from CodeDay mentors

public class Bullet extends MovingActor {
	
	private ImageIcon enemyBullet;

    
    private int radii;
    private int yVelocity;

    // Constructor for bullet
    public Bullet(int xPosition, int yPosition, int diameter, Color color) {
    	super(xPosition, yPosition, 0, 0, color);
    	ClassLoader clder = this.getClass().getClassLoader();
    	enemyBullet = new ImageIcon(clder.getResource("images/enemybullet.png"));
        this.radii = diameter;
    }

    // Get length of the bullet 
    public int getDiameter() {
        return radii;
    }

    // Used to draw the bullet
    
    public void draw(Graphics g) {
    	enemyBullet.paintIcon(null, g, this.getXPosition(), this.getYPosition());
       

    }
    // used to get the bullet hit    

    public Rectangle getBounds() {
        Rectangle bulletHitbox = new Rectangle(xPos, yPos, 7, 15);
        return bulletHitbox;
    }
}
