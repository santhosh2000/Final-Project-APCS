

import java.awt.Color;

// credit given to CodeDay mentors for helping with code inside methods


public abstract class ControlActor extends Actor implements Moveable {
    
    KeyboardController controlKey;
    
    // Constructor for any controllable object
    public ControlActor(int xPosition, int yPosition, Color color, KeyboardController control)
    {
        super(xPosition, yPosition, color);
        this.controlKey = control;
    }
}
