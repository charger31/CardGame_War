package com.cards.war;

public class Main {
    public static void main(String[] args)
    {
        Deck deck = new Deck();

        deck.Shuffle();
        System.out.println("\n");
        deck.printLastCard();

        System.out.println("\n");

        deck.AddCard(6, "Spades");
        deck.printLastCard();

        System.out.println("\n");
        deck.RemoveTopCard();
        deck.printLastCard();
    }
}
