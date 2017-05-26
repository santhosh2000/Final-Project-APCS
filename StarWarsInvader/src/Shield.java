



import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

// help from Codeday mentors

public class Shield extends Actor {

    int width;
    int height;

    // Constructor for Shield objects
    public Shield(int xPosition, int yPosition, int width, int height, Color color) {
        super(xPosition, yPosition, color);
        this.width = width;
        this.height = height;

    }

    // Accessors and mutators for every part of the shield constructor
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    // Used to draw shield objects
  
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(this.getXPosition(), this.getYPosition(), 90, 10);
    }

    // Used to get the hit box of a shield object
 
    public Rectangle getBounds() {
        Rectangle shieldHitbox = new Rectangle(this.getXPosition(), this.getYPosition(), 90, 10);
        return shieldHitbox;
    }
}
