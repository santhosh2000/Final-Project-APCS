import java.awt.image.*;

public interface  Actor
{
	

		/**
		 * Get the width of the actor 
		 * 
		 * @return The width in pixels of this actor 
		 */
		public int getWidth();

		/**
		 * Get the height of the actor 
		 * 
		 * @return The height in pixels of this actor 
		 */
		public int getHeight();
		
		/**
		 * Draw the actor  
		 * 
		 * @param x The x coordinate at which to draw the sprite
		 * @param y The y coordinate at which to draw the sprite
		 */
		public void draw(int x,int y);
		//common method for all actors to fire bullets
		public void fire();
}
		

	
	
