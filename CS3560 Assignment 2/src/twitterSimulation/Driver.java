package twitterSimulation;

// Driver class that starts program
// using Singleton pattern

public class Driver 
{

	public static void main(String[] args) 
	{
		AdminControlPanel.getInstance().setVisible(true);
	}

}
