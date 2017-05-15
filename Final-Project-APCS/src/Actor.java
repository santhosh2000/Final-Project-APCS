import java.awt.image.*;

public class Actor
{
	private Location loc;
	private Image img;
	private final int STEP_SIZE;
	public Actor(Location l, Image i)
	{
		loc = l;
		img = i;
	}
	public void setTarget(){}
	public void moveLeft(){}
	public void moveRight(){}
	public void shoot(){}
	public void explode(){}
	public boolean contains(Location point){}
	
}
