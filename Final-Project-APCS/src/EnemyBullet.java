
public class EnemyBullet extends IFO implements Moveable
{
	private int height;
	public EnemyBullet(Location l, int h,int speed,int time,
			DrawingCanvas canvas, Actor aShip, Color color)
	{
		super(l, color, speed, time);
	}
	public void run()
	{
	}
	
}
