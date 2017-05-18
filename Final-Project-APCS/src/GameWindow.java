
public interface GameWindow {
	/*
	 * the title of our game
	 */
	public void setTitle(String name);
	/*
	 * set resolution of the game window
	 * @ param the x resolution of the screen
	 * @ param the y resolution of the screen
	 */
	public void setResolution( int x, int y);
	/*
	 * start the game 
	 */
	public void startGame();
	
	/*
	 * does an action if a particular window event is called 
	 * @ param operation responsible for the particular event 
	 * */
	
	public void startEvent(GameWindowCallback callback);
	
	/**
	 * Checks to see if a key is pressed by the user 
	 * 
	 * @param keyCode code associated with key 
	 * @return True if the particular key is pressed
	 */
	public boolean isKeyPressed(int keyCode);
}
