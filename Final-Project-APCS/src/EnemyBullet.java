import java.awt.color.*;
public class EnemyBullet extends IFO implements Moveable
{
	private int height;
	private int time
	private int speed = 2;
	public EnemyBullet(Location l, int h,int speed, Actor aShip, Color color)
	{
		super(l, color, speed, time);
	}
	public void run()
	{
	}

}
