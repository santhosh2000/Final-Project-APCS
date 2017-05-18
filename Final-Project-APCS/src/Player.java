
public class Player extends ActorController
{
	private boolean isMoving;
	private boolean isAlive;
	private Location myLoc;
	private int myScore;

	public Player(boolean a, boolean b, Location l)
	{
		isMoving = a;
		isAlive = b;
		myLoc = l;
		myScore = 0;
	}

	public void setLoc(Location L)
	{
		myLoc = L;
	}
	public void setAlive(boolean a)
	{
		isAlive = a;
	}
	public void setMoving(boolean a)
	{
		isMoving = a;
	}
	public void setScore(int a)
	{
		myScore = a;
	}


	public Location getLoc()
	{
		return myLoc;
	}
	public boolean getMoving()
	{
		return isMoving;
	}
	public boolean getAlive()
	{
		return isAlive;	
	}
	public int getScore()
	{
		return myScore;
	}

}
