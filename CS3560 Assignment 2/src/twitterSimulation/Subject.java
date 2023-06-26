package twitterSimulation;

// Subject interface will be used by
// User class to demonstrate Observer pattern

public interface Subject 
{
	public void attach(String userID);
	
	public void informObserver(String tweet);
}
