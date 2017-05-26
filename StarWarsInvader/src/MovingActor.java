

import java.awt.Color;
// made with help from CodeDay mentors

public abstract class MovingActor extends Actor implements Moveable{
    
    int xVelocity;
    int yVelocity;
    
    // Constructor for any non controllable object
    public MovingActor(int xCoordinate, int yCoordinate, int xVel, int yVel, Color color)
    {
        super(xCoordinate, yCoordinate, color);
        this.xVelocity = xVel;
        this.yVelocity = yVel;
    
    }
    
    // Accessors and mutators for every part of the MovingActor constructor
    public int getXVelocity()
    {
        return xVelocity;
    }
    public int getYVelocity()
    {
        return yVelocity;
    }
    public void setXVelocity(int xVel)
    {
        this.xVelocity = xVel;
    }
    public void setYVelocity(int yVelocity)
    {
        this.yVelocity = yVelocity;
    }
 
    
    // Used to move static objects
    public void move()
    {
        this.xPos += xVelocity;
        this.yPos += yVelocity;
    }
    
}
