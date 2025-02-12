package com.cards.war;

public class Main {
    public static void main(String[] args)
    {
        // creates a new deck
        Deck deck = new Deck();

        //shuffles the deck and prints the last card
        deck.Shuffle();
        deck.printLastCard();


        //adds a singular card
        deck.AddCard(11, "Spades");
        deck.printLastCard();

        //removes the card that was added
        deck.RemoveLastCard();
        deck.printLastCard();
    }
}
