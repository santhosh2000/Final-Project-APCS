package SpaceGame;
import KeyboardMechanism.KeyboardController;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

// help from CodeDay mentors

public class Ship extends ControlActor {

    ImageIcon ship = new ImageIcon("images/playerrocket.png");
    ImageIcon bonusEnemy = new ImageIcon("images/bonusEnemySkin.gif");
    ImageIcon lifeCounterShip = new ImageIcon("images/spaceLive.png");

    // Constructor for all ship objects
    public Ship(int xPosition, int yPosition, Color color, KeyboardController control) {
        super(xPosition, yPosition, color, control);
    }

    // Draw bonus enemy ship
    public void bonusDraw(Graphics g) {

        bonusEnemy.paintIcon(null, g, this.getXPosition(), this.getYPosition());
    }

    // Draw ships for life counter
    public void lifeDraw(Graphics g) {

        lifeCounterShip.paintIcon(null, g, this.getXPosition(), this.getYPosition());
    }

    // Draw player controlled ship
    @Override
    public void draw(Graphics g) {
        ship.paintIcon(null, g, this.getXPosition(), this.getYPosition());

    }

    // Gets the hit box for all ship objects
    @Override
    public Rectangle getBounds() {
        Rectangle shipHitbox = new Rectangle(this.getXPosition(), this.getYPosition(), 50, 50);
        return shipHitbox;
    }

    // Used to move all ship objects
    @Override
    public void move() {
        // Left arrow key press
        if (controlKey.getKeyTyped(37)) {
            xPos -= 10;
        }
        // Right arrow key press
        if (controlKey.getKeyTyped(39)) {
            xPos += 10;
        }
        
        // Move from edge to edge without stopping
        // player can move from side to side don't know how to make the edges concrete 
        if (xPos > 800) {
            //xPos = -50;
        	xPos = 800;
        }
        if (xPos < -50) {
            xPos = -50;
        }
    }
}