package twitterSimulation;

// IncrementVisitor class that implements
// VisitorTotal Interface to demonstrate
// Visitor pattern (in User, Group, Tweet
// NumPositiveWords)

public class IncrementVisitor implements VisitorTotal 
{
	
	private static int totalUsers;
	private static int totalGroups;
	private static int totalTweets;
	private static int totalPositive;
	
	@Override
	public void visitUser(User user) 
	{
		totalUsers++;
	}
	
	public int getTotalUsers() 
	{
		return totalUsers;
	}
	
	@Override
	public void visitGroup(Group group) 
	{
		totalGroups++;
	}
	
	public int getTotalGroups() 
	{
		return totalGroups;
	}

	@Override
	public void visitTweet(Tweet tweet) 
	{
		totalTweets++;
	}
	
	public int getTotalTweets() 
	{
		return totalTweets;
	}

	@Override
	public void visitPos(NumPositiveWords posPercent) 
	{
		totalPositive++;
	}
	
	public int getTotalPositive() 
	{
		return totalPositive;
	}

}
