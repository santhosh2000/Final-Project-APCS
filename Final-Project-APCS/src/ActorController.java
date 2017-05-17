import java.awt.Rectangle;
public abstract  class ActorController {


	/**
	 * Action controllers control what the actors do in the game.
	*/
	/*
	 * current x coordinate of this sprite 
	 */
	protected double xPos;
	/*
	 * current y coordinate of this sprite
	 */
	protected double yPos;
	protected Actor actor;
	/*
	 * current speed of actor in x direction 
	 */
	protected double xSpeed;
	/*
	 * current speed of actor in y direction
	 */
	protected double ySpeed;
	
	private Rectangle rect = new Rectangle();
	
	/*
	 * Constructs an object with image and location of actor
	 * @ param x position of location where the actor wants to move to
	 * @ param y position of location where the actor waants to move to
	 * @ param image required to make the actor 
	 */
	public ActorController( Actor actor, int x, int y)
	{
		this.xPos = x;
		this.yPos = y;
		
		actor = img; // need to know how to use the images 
	}
	/*
	 * moves the entity based on time 
	 * @ param amount of time passed in centiseconds
	 */
	public void move( double time)
	{
		this.xPos+= (this.xSpeed *time)/100;
		this.yPos+= ( this.ySpeed* time)/100;
		
	}
	/*
	 * returns the speed of the actor in the x direction 
	 * @ param speed of the actor in the x direction 
	 */
	public void setXSpeed ( double speedInXDirection)
	{
		this.xSpeed = speedInXDirection;
	}
	/*
	 * gives message that the actor collided with another actor
	 * @ param the speed of the actor in the y direction 
	 */
	public void setYSpeed( double speedInYDirection)
	{
		this.ySpeed =  speedInYDirection;
	}
	/*
	 * returns the current speed in the x direction 
	 */
	public void getXSpeed()
	{
		 return this.xSpeed;
	}
	/*
	 * returns the y component of speed the actor is currently going in 
	 */
	public void getYSpeed()
	{
		return this.ySpeed;
	}
	/*
	 * draws the actor in the current game setting 
	 */
	public void draw()
	{
		actor.draw((int)this.xPos, (int) this.yPos);
	}
	/*
	 * returns the x coordinate of the actor's position 
	 */
	public void getXPos()
	{
		return this.xPos;
	}
	/*
	 *returns the y coordinate of the actor 
	 */
	public void getYPos()
	{
		return this.yPos;
	}
	/*
	 * this function is overriden depending on the functionality of the actor
	 */
	
	public void act()
	{
		
	}
	/*
	 * checks to see if actor collided with another actor
	 * returns true or false depending on whether there was a collision or not 
	 */
	
	public boolean hasItCollided()
	{
	}
	/*
	 * gives message that the actor collided with another actor
	 * @ param an object of type actor 
	 */
	
	public void collidedWith( Actor other)
	{
	}
}
	
	
	

	
	
	
	