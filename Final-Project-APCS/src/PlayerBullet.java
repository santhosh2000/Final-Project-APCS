
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
	

	public PlayerBullet(Game g, Actor actor, int x, int y)
	{
		super(actor,x,y);
		this.game = g;
		this.ySpeed = y;
	}
	public void run(int time ){
		super.move(time);
		
	}
private boolean used = false;
	
	/**
	 * Create a new shot from the player
	 * 
	 * @param game The game in which the shot has been created
	 * @param sprite The sprite representing this shot
	 * @param x The initial x location of the shot
	 * @param y The initial y location of the shot
	 */
	public ShotEntity(Game game,String sprite,int x,int y) {
		super(sprite,x,y);
		
		this.game = game;
		
		dy = moveSpeed;
	}

	/**
	 * Request that this shot moved based on time elapsed
	 * 
	 * @param delta The time that has elapsed since last move
	 */
	public void move(long delta) {
		// proceed with normal move
		super.move(delta);
		
		// if we shot off the screen, remove ourselfs
		if (y < -100) {
			game.removeEntity(this);
		}
	}
	
	/**
	 * Notification that this shot has collided with another
	 * entity
	 * 
	 * @param other The other entity with which we've collided
	 */
	public void collidedWith(Entity other) {
		// prevents double kills, if we've already hit something,
		// don't collide
		if (used) {
			return;
		}
		
		// if we've hit an alien, kill it!
		if (other instanceof AlienEntity) {
			// remove the affected entities
			game.removeEntity(this);
			game.removeEntity(other);
			
			// notify the game that the alien has been killed
			game.notifyAlienKilled();
			used = true;
		}
	}
}
	
}
 


