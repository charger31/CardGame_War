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
        System.out.println("Cards in Player 1's hand:");
        System.out.println(player1.handSize());

        System.out.println("Cards in Player 2's hand:");
        System.out.println(player2.handSize());
        System.out.println("\n");

        //Gets the top card of player 1's hand and then puts it into the discard and then removes it from the hand
        System.out.println("Current Top Card in Player 1's hand:");
        System.out.println(player1.getTopCard().Number + " " + player1.getTopCard().Suit);
        System.out.println("\n");

        player1.addCardToDiscard(player1.getTopCard());
        player1.removeCardFromHand();

        System.out.println("Cards in Player 1's hand:");
        System.out.println(player1.handSize());

        System.out.println("Current Top Card in Player 1's hand:");
        System.out.println(player1.getTopCard().Number + " " + player1.getTopCard().Suit);
    }
}
