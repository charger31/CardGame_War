package com.cards.war;

import java.util.ArrayList;

public class Player {
    private ArrayList<Card> Hand = new ArrayList<>();


    //--------------------------------------------------------
    // Name: Add Card to Hand
    // Abstract: Adds a card to the hand list
    //--------------------------------------------------------
    public void AddCardToHand(Card CardToAdd)
    {
        Hand.add(new Card(CardToAdd.Number, CardToAdd.Suit));
    }


    //--------------------------------------------------------
    // Name:  Remove Card from Hand
    // Abstract: removes the top card of the hand
    //--------------------------------------------------------
    public void RemoveCardFromHand()
    {
        Hand.removeLast();
    }


    //--------------------------------------------------------
    // Name: Get Top Card
    // Abstract: returns the top card of the hand(work in progress)
    //--------------------------------------------------------
    public Card GetTopCard()
    {
        return Hand.getLast();
    }
}
