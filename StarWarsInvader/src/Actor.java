


import java.awt.Color;
import java.awt.Rectangle;
// help from CodeDay mentors

public abstract class Actor implements Drawing {

    int xPos;
    int yPos;
    Color color;
    boolean isColliding;
    
    public Actor()
    {
    	
    };
    
    //  non-default Constuctor for any Game Object
    public Actor(int xPosition, int yPosition, Color color) {
        this.xPos = xPosition;
        this.yPos = yPosition;
        this.color = color;
    }

    public abstract Rectangle getBounds();

    // Gets the X position of any object
    public int getXPosition() {
        return xPos;
    }

    // Gets the Y position of any object
    public int getYPosition() {
        return yPos;
    }

    // Gets the color of any object
    public Color getColor() {
        return color;
    }

    // Sets the X position of any object
    public void setXPosition(int xPos) {
        this.xPos = xPos;
    }

    // Sets the Y position of any object
    public void setYPosition(int yPos) {
        this.yPos = yPos;
    }

    // Sets the color of any object
    public void setColor(Color co) {
        this.color = co;
    }

    // Checks if the rectangles of any two objects are intersecting
    public boolean isColliding(Actor other) {
        isColliding = other.getBounds().intersects(this.getBounds());
        return isColliding;
    }
}
