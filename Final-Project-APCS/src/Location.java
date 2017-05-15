
public class Location
{
	private int myWidth;
	private int myHeight;
	public Location(int width, int height)
	{
		myWidth=width;
		myHeight=height;
	}
	public void setWidth(int width)
	{
		myWidth = width;
	}
	public int getWidth()
	{
		return myWidth;
	}
	public void setHeight(int height)
	{
		myHeight = height;
	}
	public int getHeight()
	{
		return myHeight;
	}
	public void setLocation(int width, int height)
	{
		myWidth = width;
		myHeight = height;
	}
	public Location getLocation()
	{
		return new Location(getWidth(), getHeight());
		
	}
}
