import java.util.ArrayList;
public class Deck{
	String[] suit;
	String[] ranks;
	int[] points;
	int handLength;
	ArrayList<Card> hand;
	ArrayList<Card> deck;
	
	
	public Deck(String[] suit, String[] ranks, int[] points){
		deck = new ArrayList<Card>();
		
		
		this.suit = suit;
		this.ranks = ranks;
		this.points = points;
		
		for(int i = 0; i<suit.length;i++){
			for(int k = 0; k<ranks.length; k++){
				deck.add(new Card(suit[i], ranks[k]));
			}
		}
	}
	
	public Deck(String[] suit, String[] ranks, int[] points, int handLength){
		hand = new ArrayList<Card>();
		deck = new ArrayList<Card>();
		this.suit = suit;
		this.ranks = ranks;
		this.points = points;
		this.handLength = handLength;
		
		for(int i = 0; i<suit.length;i++){
			for(int k = 0; k<ranks.length; k++){
				deck.add(new Card(suit[i], ranks[k]));
			}
		}
	}
	
	
	
	
	
	
	
	
	
	public void shuffle(){
		ArrayList<Card> copy = new ArrayList<Card>();
		int size = deck.size();
		for(int i =0; i<size;i++){
			int random = ((int) (Math.random()*(deck.size())));
			copy.add(deck.get(random));
			deck.remove(random);
		}
		
		deck = copy;
	}
	
	public void takeHand(){
		for(int i =0; i<handLength;i++){
			int random = ((int) (Math.random()*(deck.size())));
			hand.add(deck.get(random));
			deck.remove(random);
		}
	}
	
	
	
	public void printDeck(){
		
		for(int i =0; i<deck.size();i++){
			System.out.println(deck.get(i).toString());
		}
	}
	
	public void printHand(){
		
		for(int i =0; i<hand.size();i++){
			System.out.println(hand.get(i).toString());
		}
	}
}
