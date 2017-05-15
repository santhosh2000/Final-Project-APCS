
public class EnemyBullet extends IFO implements Moveable
{
	private final int SPEED;
	private final Location xLoc;
	private final Location yLoc;
	private final Location height;
	public EnemyBullet(Color color, Location l, DrawingCanvas canvas, Location x, Location y, Location height)
	{
		super(c, loc);
		
	}
	public void move()
	{
	}
public Projectile(double x, double y, double height,
DrawingCanvas canvas, SpaceShip aShip)
Create the missile line at the given location with the given height, and set up instance
variables. Call start().
Methods:
● public void run()
Move the line down the screen until it goes off the bottom or hits the ship
Then remove line from screen, and make the ship explode if appropriate.
}
