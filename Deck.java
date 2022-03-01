import java.util.ArrayList;
public class Deck{
	String[] suit = {"Hearts", "Diamonds", "Spades", "Clubs"};
	String[] ranks = {"9", "10", "Jack", "Queen", "King", "Ace"};
	int[] points = {1, 2, 3, 4, 5, 6};
	ArrayList<Card> deck = new ArrayList<Card>();
	public Deck(){
		for(int i = 0; i<suit.length;i++){
			for(int k = 0; k<ranks.length; k++){
				deck.add(new Card(suit[i], ranks[k]));
			}
		}
	}
	public void shuffle(){
		ArrayList<Card> copy = new ArrayList<Card>();
		for(int i =0; i<copy.size();i++){
			int random = ((int) (Math.random()*(deck.size())));
			copy.add(deck.get(random));
			deck.remove(random);
		}
		
		deck = copy;
	}
	public void print(){
		for(int i =0; i<deck.size();i++){
			System.out.println(deck.get(i).toString());
		}
	}
}
