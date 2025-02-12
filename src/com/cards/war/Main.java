package com.cards.war;

public class Main {
    public static void main(String[] args)
    {
        // creates a new deck
        Deck deck = new Deck();

        //Shuffle the deck
        deck.Shuffle();

        // create two players
        Player player1 = new Player();
        Player player2 = new Player();

        //Deal the whole deck to both players
        for(int index = 0; index < 52; index++)
        {
            if(index % 2 == 0)
            {
                player1.addCardToHand(deck.getTopCard());
                deck.removeTopCard();
            }
            else
            {
                player2.addCardToHand(deck.getTopCard());
                deck.removeTopCard();
            }
        }

        System.out.println("\n");

        //check to see cards have gone into hand
        System.out.println(player1.handSize());
        System.out.println(player2.handSize());

    }
}
