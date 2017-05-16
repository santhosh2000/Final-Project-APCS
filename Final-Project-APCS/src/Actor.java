import java.awt.image.*;

public class Actor
{
	private Location loc;
	private Image img;

	private final int STEP_SIZE;
	public Actor(Location l, Image i)
	{
		loc = l;
		setImg(i);
	}
	public void setTarget(){}
	public void moveLeft(){
		int i = STEP_SIZE--;
	}
	public void moveRight()
	{
		int i = STEP_SIZE++;
	}
	public void shoot(){}
	public void explode(){}
	public boolean contains(Location point){
		return true;
		
	}
	public Image getImg() {
		return img;
	}
	public void setImg(Image img) {
		this.img = img;
	}
	
	
	}
public void getHeight()
{
}
public void getWidth()
{
}
	
	
}
