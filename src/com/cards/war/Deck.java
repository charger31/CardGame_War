package com.cards.war;

import java.util.ArrayList;
import java.util.Collections;

class Deck {
    ArrayList<Card> Deck = new ArrayList<>();


    //--------------------------------------------------------
    // Name: Constructor
    // Abstract: Initializes a deck and fills it with 52 cards
    //--------------------------------------------------------
    public Deck()
    {
        for(int index = 0; index < 4; index++)
        {
            for(int index2 = 0; index2 < 13; index2++)
            {
                if(index == 0)
                {
                    AddCard(index2 + 1, "Spades");
                }
                else if(index == 1)
                {
                    AddCard(index2 + 1, "Hearts");
                }
                else if(index == 2)
                {
                    AddCard(index2 + 1, "Diamonds");
                }
                else if(index == 3)
                {
                    AddCard(index2 + 1, "Clubs");
                }
            }
        }
    }


    //--------------------------------------------------------
    // Name: Shuffle
    // Abstract: Shuffles the deck to a random order
    //--------------------------------------------------------
    public void Shuffle()
    {
        Collections.shuffle(Deck);
    }


    //--------------------------------------------------------
    // Name: Print deck
    // Abstract: Prints all cards in the deck
    //--------------------------------------------------------
    public void PrintDeck()
    {
        for (Card card : Deck) {
            System.out.println(card.Suit);
            System.out.println(card.Number);
            System.out.println("\n");
        }
    }


    //--------------------------------------------------------
    // Name: Add card
    // Abstract: Adds a new card to the deck
    //--------------------------------------------------------
    public void AddCard(int newNumber, String newSuite)
    {
        if(newNumber > 0 && newNumber <14){
            Deck.add(new Card(newNumber, newSuite));
        }
    }

    public void RemoveLastCard()
    {
        Deck.removeLast();
    }


    //--------------------------------------------------------
    // Name: Print Last Card
    // Abstract: Prints the last card added to the deck
    //--------------------------------------------------------
    public void printLastCard()
    {
        System.out.println(Deck.getLast().Suit);
        System.out.println(Deck.getLast().Number);
        System.out.println("\n");
    }
}