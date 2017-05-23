import java.awt.Color;
import java.awt.image.*;
public class Enemy implements Actor
{
	private int enemyCounter = 0;
	private boolean isAlive;
	private final int enemyShootTime;
	private Image img;
	private Location loc;
	public Enemy(Image pic, Location l)
	{
		img = pic;
		loc = l;
	}
	public void move(int dx)
	{
		if(loc.getWidth()> && loc.getWidth()< )
			loc.setWidth(loc.getWidth()+dx);
	}
	public boolean isAlive()
	{
		return isAlive;
	}
	public void explode()
	{
		
	}
	public void fire()
	{
		EnemyBullet bul = new EnemyBullet(loc, getHeight(), this, Color.RED);
	}
	public boolean willFire()
	{
		if(isAlive)
			fire();
	}
	public void end()
	{
		
	}
	public void addHit()
	{
		if(hitEnemy())
			enemyCounter++;
	}
}
