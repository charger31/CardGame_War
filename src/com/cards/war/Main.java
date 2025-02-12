package com.cards.war;

public class Main {
    public static void main(String[] args)
    {
        // creates a new deck
        Deck deck = new Deck();

        //shuffles the deck and prints the last card
        deck.Shuffle();
        System.out.println("\n");
        deck.printLastCard();

        System.out.println("\n");

        //adds a singular card
        deck.AddCard(6, "Spades");
        deck.printLastCard();

        //removes the card that was added
        System.out.println("\n");
        deck.RemoveLastCard();
        deck.printLastCard();
    }
}
