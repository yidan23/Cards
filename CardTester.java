import java.util.Scanner;
public class CardTester{
	public static void main(String args[]){
		Card c = new Card("compile", "compile");
		//war();
		//euchre();
		twentyOne();
	}
	
	public static void war(){
		String[] suit = {"Hearts", "Diamonds", "Spades", "Clubs"};
		String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
		int[] points = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
		int hand = 26;
		Deck deck = new Deck(suit, ranks, points, hand);
		System.out.println("\nDECK\n");
		deck.printDeck();
		deck.shuffle();
		System.out.println("\nDECK AFTER SHUFFLE\n");
		deck.printDeck();
		deck.takeHand();
		System.out.println("\nHAND\n");
		deck.printHand();
	}
	
	public static void euchre(){
		String[] suit = {"Hearts", "Diamonds", "Spades", "Clubs"};
		String[] ranks = {"9", "10", "Jack", "Queen", "King", "Ace"};
		int[] points = {1, 2, 3, 4, 5, 6};
		int hand = 5;
		Deck deck = new Deck(suit, ranks, points, hand);
		System.out.println("\nDECK\n");
		deck.printDeck();
		deck.shuffle();
		System.out.println("\nDECK AFTER SHUFFLE\n");
		deck.printDeck();
		deck.takeHand();
		System.out.println("\nHAND\n");
		deck.printHand();
	}
	
	public static void twentyOne(){
		String[] suit = {"Hearts", "Diamonds", "Spades", "Clubs"};
		String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
		int[] points = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
		int hand = 2;
		Deck deck = new Deck(suit, ranks, points, hand);
		System.out.println("\nDECK\n");
		deck.printDeck();
		deck.shuffle();
		System.out.println("\nDECK AFTER SHUFFLE\n");
		deck.printDeck();
		deck.takeHand();
		System.out.println("\nHAND\n");
		deck.printHand();
	}
}
