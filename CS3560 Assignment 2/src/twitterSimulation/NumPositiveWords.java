package twitterSimulation;

//NumPositiveWords class that implements
//Visitor Interface to demonstrate
//Visitor pattern

public class NumPositiveWords implements Visitor 
{

	@Override
	public void accept(VisitorTotal visitor) 
	{
		visitor.visitPos(this);
	}

}
