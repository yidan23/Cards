public class Card{
	String suit = "";
	String ranks = "";
	public Card (String suit, String ranks){
		this.suit = suit;
		this.ranks = ranks;
	}
	public String toString(){
		return (suit + " of " + ranks);
	}
}
