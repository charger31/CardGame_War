package com.cards.war;

import java.util.ArrayList;

public class Player {
    private final ArrayList<Card> Hand = new ArrayList<>();
    private final ArrayList<Card> Discard = new ArrayList<>();


    //--------------------------------------------------------
    // Name: Add Card to Hand
    // Abstract: Adds a card to the hand list
    //--------------------------------------------------------
    public void addCardToHand(Card CardToAdd)
    {
        Hand.add(new Card(CardToAdd.Number, CardToAdd.Suit));
    }


    //--------------------------------------------------------
    // Name:  Remove Card from Hand
    // Abstract: removes the top card of the hand
    //--------------------------------------------------------
    public void removeCardFromHand()
    {
        Hand.removeLast();
    }


    //--------------------------------------------------------
    // Name: Get Top Card
    // Abstract: returns the top card of the hand(work in progress)
    //--------------------------------------------------------
    public Card getTopCard()
    {
        return Hand.getLast();
    }



    //--------------------------------------------------------
    // Name: Add Card To Discard
    // Abstract: Adds a card to the discard pile
    //--------------------------------------------------------
    public void addCardToDiscard(Card CardToDiscard)
    {
        Discard.add(new Card(CardToDiscard.Number, CardToDiscard.Suit));
    }

    public void printHand()
    {
        for (Card card : Hand) {
            if(card.Number == 1)
            {
                System.out.println("Ace" + " " + card.Suit);
            } else if (card.Number == 11)
            {
                System.out.println("Jack" + " " + card.Suit);
            } else if (card.Number == 12)
            {
                System.out.println("Queen" + " " + card.Suit);
            }else if (card.Number == 13)
            {
                System.out.println("King" + " " + card.Suit);
            } else{
                System.out.println(card.Number + " " + card.Suit);
            }
            System.out.println();
        }
    }

    public int handSize()
    {
        return Hand.size();
    }
}
