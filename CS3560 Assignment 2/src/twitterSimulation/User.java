package twitterSimulation;

// User class that implements the Visitor interface
// for the Visitor pattern 
// Entry interface for the Composite pattern, 
// and Observer and Subject
// interfaces for the Observer pattern.

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;

public class User implements Entry, Visitor, Observer, Subject 
{
	
	private String userId;
	private Color color;
	private ArrayList<String> followers;
	private ArrayList<String> followings;
	private ArrayList<String> feed;
	private HashMap<String,User> twitterUsers = AdminControlPanel.getUsers();
	
	public User getUser()
	{
		return User.this;
	}
	
	public void setColor(Color str)
	{
		color = str;
	}
	
	public Color getColor()
	{
		return color;
	}
	
	public User(String ID)
	{
		userId = ID;
		followings = new ArrayList<String>();
		followers = new ArrayList<String>();
		feed = new ArrayList<String>();
	}
	
	public ArrayList<String> getFeed() 
	{
		return feed;
	}
	
	public void addFollower(String follower)
	{
		followers.add(follower);
	}

	public ArrayList<String> getFollowers() 
	{
		return followers;
	}
	
	public void addFollowing(String following)
	{
		followings.add(following);
	}

	public ArrayList<String> getFollowings() 
	{
		return followings;
	}
	
	@Override
	public void accept(VisitorTotal visitor) 
	{
		visitor.visitUser(this);
	}
	
	@Override
	public String getID() 
	{
		return userId;
	}
	
	@Override
	public void update(String tweet) 
	{
		feed.add(tweet); // updates feed
	}
	
	// assigns user a following persona (user ID) and followers
	@Override
	public void attach(String userID) 
	{
		getUser().addFollowing(userId);  
		twitterUsers.get(userId).addFollower(getUser().getID());
	}

	@Override
	public void informObserver(String tweet) 
	{
		int numFollowers = getUser().getFollowers().size();
		for (int i = 0; i < numFollowers; i++)
		{
			// Gets the user ID of all of the followers
			String followerID = getUser().getFollowers().get(i);
			
			// Updates the current user
			User currentUser = twitterUsers.get(followerID);
			
			// Updates the user's newsfeed and time of update
			currentUser.update(tweet);
		}
	}

}
