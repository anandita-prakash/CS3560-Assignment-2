package twitterSimulation;

// Tweet class that implements
// Visitor Interface to demonstrate
// Visitor pattern

public class Tweet implements Visitor 
{

	@Override
	public void accept(VisitorTotal visitor) 
	{
		visitor.visitTweet(this);
	}

}
