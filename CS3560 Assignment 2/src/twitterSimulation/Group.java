package twitterSimulation;

import java.util.List;

public class Group implements Visitor, Entry 
{
	
	private String groupID;
	
	// this array list can contain User and Group ID numbers
	private List<Entry> entries;
	
	// constructor
	public Group(String id)
	{
		groupID = id;
	}

	@Override
	public void accept(VisitorTotal visitor) 
	{
		visitor.visitGroup(this);
	}
	
	public List<Entry> getEntries()
	{
		return entries;
	}
	
	@Override
	public String getID() 
	{
		return groupID;
	}

}
