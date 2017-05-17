
public class PlayerBullet extends ActorController implements Moveable
{
	/*
	 * vertical speed of the bullet as it moves up 
	 */
	private double moveSpeed = 100;
	/*
	 * game where the bullet exists
	 */
	private Game game;
	/*
	 * True if bullet has been fired  
	 */
	private boolean used = false;
	
	
	/**
	 * Create a new shot from the player
	 * 
	 * @param game The game where shot was created
	 * @param sprite The actor
	 * @param x The initial x coordinate of the shot
	 * @param y The initial y coordinate of the shot
	  */

	public PlayerBullet(Game g, Actor actor, int x, int y)
	{
		super(actor,x,y);
		this.game = g;
		this.ySpeed = moveSpeed;
	}
	public void run(int time )
	{
		super.move(time);
		if(this.yPos < -100)
		{
			game.removeActor(this);
		}
	}	
		
		
		
	

	/**
	 * gives a notification on where bullet has hit another actor 
	 * 
	 * @param other The other entity with which th bullet collided
	 */
	public void collidedWith(Actor other) {
		// prevents double kills, if we've already hit something,
		// don't collide
		if (used) {
			
			return;
		}
		// however, if we hit an alien, destory it!! mwahahaha!!
		if( other instanceof Enemy)
		{
			game.removeActor(this);
			game.removeActor(other);
			game.tellEnemyKilled();
			used = true;
		}
	}
	}
		
		
 


