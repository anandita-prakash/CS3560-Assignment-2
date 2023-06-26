package twitterSimulation;

// part of Visitor pattern
// going to be used for Tweet, 
// User, Group, and NumPositiveWords classes

public interface Visitor 
{
	public void accept(VisitorTotal visitor);
}
