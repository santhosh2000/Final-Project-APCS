


import java.awt.Color;

import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.Rectangle;


public class Laser extends MovingActor {
	private ImageIcon laser;
	


    //Enemies shoot beams
    // constructor for beam
    public Laser(int xCoordinate, int yCoordinate, int diameter, Color color) {
        super(xCoordinate, yCoordinate, 0, 0, color);
        ClassLoader cldr = this.getClass().getClassLoader();
        laser = new ImageIcon(cldr.getResource("images/laser.png"));
        //laser = new ImageIcon(cldr.getResource("src/images/laser.png"));
    }
    
// Used to draw the laser
    
    public void draw(Graphics g) {
    	laser.paintIcon(null, g, this.getXPosition(), this.getYPosition());
    }
       
    
    
    // Used to get the hit box of a beam
   
    public Rectangle getBounds() {
    	  Rectangle laserBox = new Rectangle(this.getXPosition(), this.getYPosition(), 90, 10);
          return laserBox;
    }
}
   
      


