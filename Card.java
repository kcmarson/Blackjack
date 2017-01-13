import java.util.*;
public class Card implements Comparable<Card> {
	private final String[] suits = {"C","D","H","S"};
	private final String[] ranks = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
	public int suit,rank;
	public Card (int a, int b) //a=rank   b=suit
	{
		suit = b;
		rank = a;
	}
	public String toString()
	{
		return (this.ranks[this.rank]+this.suits[this.suit]);
	}
	public int bjValue() 
	{
		if (rank <9)
			return (rank+2);
		else if (rank != 12)
			return 10;
		else       
			return 11;
	}
	public boolean isAce()
	{
		return rank==12;
	}
	public int compareTo(Card b) //To-Do
	{
		return 0;
	}
}
