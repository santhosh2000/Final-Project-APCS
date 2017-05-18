import java.awt.Image;

	/**
	 * A sprite to be displayed on the screen with the image and window 
	 * 
	 * @author Santhosh
	 */
	public class SpriteInGame implements Actor {
		/** The image to be drawn for this sprite */
		private Image image;
		/** The game window where sprite is drawn*/
		private GameWindow window;
		
		/**
		 * Create a new sprite based on an image
		 * 
		 * @param window The game window to which this sprite is going to be drawn
		 * @param image The image that is this sprite
		 */
		public SpriteInGame(GameWindow window,Image imag) {
			this.image = imag;
			this.window = window;
		}
		
		/**
		 * Get the width of the drawn sprite
		 * 
		 * @return The width in pixels of this sprite
		 */
		public int getWidth() {
			return image.getWidth(null);
		}

		/**
		 * Get the height of the drawn sprite
		 * 
		 * @return The height in pixels of this sprite
		 */
		public int getHeight() {
			return image.getHeight(null);
		}
		
		/**
		 * draws sprite onto the graphic context
		 */
		public void draw( int x, int y)
		{
			window.getDrawGraphics().drawImage(image,x,y,null);
		}
		
	

}
