


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;
import javax.swing.ImageIcon;

// credit given to CodeDay mentors and Alexander Duan 


public class Enemy extends MovingActor  {

   private ImageIcon alien1;
    private ImageIcon alien2;
    private ImageIcon alien3;
    private ImageIcon alienBoss;
    private ImageIcon alienBoss2;
   private  ImageIcon alienBoss3;
    
    private int enemytype, width, height;

    
    // Constructor for any enemy
    public Enemy(int xPosition, int yPosition, int xVelocity, int yVelocity, int enemyType, Color color, int width, int height) {
        super(xPosition, yPosition, xVelocity, yVelocity, color);
        this.enemytype = enemyType;
        this.width = width;
        this.height = height;
       ClassLoader cldr = this.getClass().getClassLoader();
        alien1 = new ImageIcon(cldr.getResource("images/spaceEnemy.png"));
//        alien1 = new ImageIcon(("images/spaceEnemy.png"));
        alien2 = new ImageIcon(cldr.getResource("images/moar4.png"));
         alien3 = new ImageIcon(cldr.getResource("images/generalakbhar.png"));
         alienBoss = new ImageIcon(cldr.getResource("images/moar5.png"));
         alienBoss2 = new ImageIcon(cldr.getResource("images/boss2.gif"));
         alienBoss3 = new ImageIcon(cldr.getResource("images/boss3.gif"));
    }
    
    @Override
    // Draws alien
    public void draw(Graphics g) {
        // Variant 1
        if (this.enemytype % 3 == 0) {
            alien1.paintIcon(null, g, this.getXPosition(), this.getYPosition());
        // Variant 2
        } else if (this.enemytype % 3 == 1 && this.enemytype != 100) {
            alien2.paintIcon(null, g, this.getXPosition(), this.getYPosition());
        // Variant 3
        } else if (this.enemytype % 3 == 2) {
            alien3.paintIcon(null, g, this.getXPosition(), this.getYPosition());
        // Boss Enemy
        } if (this.enemytype == 100)
        {
            if(GamePanel.getBossHealth()>20){
                alienBoss.paintIcon(null, g, this.getXPosition(), this.getYPosition());
            }
            else if(GamePanel.getBossHealth()>10){
                alienBoss2.paintIcon(null, g, this.getXPosition(), this.getYPosition());
            }
            else if(GamePanel.getBossHealth()>0){
                alienBoss3.paintIcon(null, g, this.getXPosition(), this.getYPosition());
            }
        }
    }

    // Gets the hitbox for normal enemies
    @Override
    public Rectangle getBounds() {
        Rectangle enemyHitBox = new Rectangle(this.getXPosition(), this.getYPosition(), width, height);
        return enemyHitBox;
    }

    // Used to move all enemies
    @Override
    public void move() {
        xPos += xVelocity;
    }

}
