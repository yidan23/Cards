public class CardTester{
	public static void main(String args[]){
		Deck deck = new Deck();
		deck.print();
		deck.shuffle();
		System.out.println("AFTER SHUFFLE \n\n\n\n\n\n");
		deck.print();
	}
}
