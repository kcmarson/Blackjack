import java.util.*;
public class Hand {
	private static Vector<Card> hand = new Vector<Card>();
	public boolean isDealer;
	private Deck deck = new Deck();
	public Hand(Deck n)
	{
		deck=n;
		isDealer=false;
		this.hit();
		this.hit();
	}
	public void hit()
	{
		hand.add(deck.draw());
	}
	public int bjValue()
	{
		int value=0;
		for (int i=0;i<=hand.size(); i++)
		{
			value+=hand.get(i).bjValue();	
		}
		return value;
	}
	public String toString()  //Method Bugged... Array Index Out of Bounds
	{	String string = "";
	if (!isDealer)
	{
		for (int i=0;i<=hand.size(); i++)
			string+= hand.get(i).toString() + " ";
	}
	else 
	{
		string += "XX ";
		for (int i=1;i<=hand.size(); i++)
			string+= hand.get(i).toString() + " ";
	}
		return string;
	}
	public static void main(String[] args)
	{
		Deck shoe = new Deck();
		shoe.shuffle();
		Hand a = new Hand(shoe);
		Hand b = new Hand(shoe);
		a.toString();
	}	
}
