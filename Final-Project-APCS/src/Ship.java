
public class Ship {
	private Game game;
	/*
	 * created a new ship for Player to control
	 * @ param game The game in which the player is currently in 
	 * @ param xPos the x coordinate of the player when game is started
	 * @ param yPos the y coordinate of the player when game is started
	 * 
	 */
	public Ship ( int xPos, int yPos, Game game)
	{
		super(xPos,yPos,game);
		this.game = game;
		
	}
	
	public void move()
	{
		
	}
	

}
