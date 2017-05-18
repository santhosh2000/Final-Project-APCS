import javax.swing.*;       // access to JFrame and JComponents





=======
public class EndMenu
{
	private int score;
	private JLabel jl;
	private boolean gameOver;

	public EndMenu(int a,JLabel theMessage)
	{
		score = a;
		jl = theMessage;
		gameOver = true;
	}
	public int getScore()
	{
		return score;
	}
	public boolean getGameOver()
	{
		return gameOver;
	}
	public void setGameOver(boolean a)
	{
		gameOver = a;
	}
	public static void main(String[] args)
	{
	}
	
}
>>>>>>> branch 'master' of https://github.com/santhosh2000/Final-Project-APCS
