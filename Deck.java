import java.util.*;
public class Deck {
	private Vector<Card> deck = new Vector<Card>();
	private int numdecks;
	public Deck()
	{
		// For use in test programs
		numdecks =2;
		for (int i = 0;i<numdecks;i++)
			for(int j = 0;j<13;j++)
				for(int k = 0;k<4;k++)
					deck.add(new Card(j,k));
	}
	public Deck(int n) //need to add throw/ catch for strange number of decks (<0 || >=4100000... (int/52)
	{
		numdecks = n;
		for (int i = 0;i<numdecks;i++)
			for(int j = 0;j<13;j++)
				for(int k = 0;k<4;k++)
					deck.add(new Card(j,k)); 
		this.shuffle();
	}
	public boolean isEmpty()
	{
		return deck.isEmpty();
	}
	public int size()
	{
		return deck.size();
	}
	public Card draw()
	{
		return deck.remove(0);
	}
	public void shuffle()
	{	
	Collections.shuffle(deck);			
	}
	public static void main(String[] args)
	{
		Deck test = new Deck(2);
		test.shuffle();
		while(!test.isEmpty())
		{
			System.out.println(test.draw().toString());
		}
			
	}
}

