package twitterSimulation;

// VisitorTotal interface that will be
// used by IncrementingVisitor interface
// to demonstrate Visitor Pattern

public interface VisitorTotal 
{
	public void visitUser(User user);
	public void visitGroup(Group group);
	public void visitTweet(Tweet tweet);
	public void visitPos(NumPositiveWords posPercent);
}
