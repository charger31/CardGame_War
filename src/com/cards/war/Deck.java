package com.cards.war;

import java.util.ArrayList;
import java.util.Collections;

class Deck {
    private final ArrayList<Card> Deck = new ArrayList<>();


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
                    addCard(index2 + 1, "Spades");
                }
                else if(index == 1)
                {
                    addCard(index2 + 1, "Hearts");
                }
                else if(index == 2)
                {
                    addCard(index2 + 1, "Diamonds");
                }
                else if(index == 3)
                {
                    addCard(index2 + 1, "Clubs");
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
    public void printDeck()
    {
        for (Card card : Deck)
        {
            if(card.Number == 1)
            {
                System.out.println("Ace" + " " + card.Suit);
            }
            else if (card.Number == 11)
            {
                System.out.println("Jack" + " " + card.Suit);
            }
            else if (card.Number == 12)
            {
                System.out.println("Queen" + " " + card.Suit);
            }
            else if (card.Number == 13)
            {
                System.out.println("King" + " " + card.Suit);
            }
            else
            {
                System.out.println(card.Number + " " + card.Suit);
            }
            System.out.println();
        }
    }


    //--------------------------------------------------------
    // Name: Add card
    // Abstract: Adds a new card to the deck
    //--------------------------------------------------------
    public void addCard(int newNumber, String newSuite)
    {
        if(newNumber > 0 && newNumber <14){
            Deck.add(new Card(newNumber, newSuite));
        }
    }


    //--------------------------------------------------------
    // Name: Remove Top Card
    // Abstract: removes the top card of the deck
    //--------------------------------------------------------
    public void removeTopCard()
    {
        Deck.removeLast();
    }


    //--------------------------------------------------------
    // Name: Gets Top Card
    // Abstract: returns the top card of the deck
    //--------------------------------------------------------
    public Card getTopCard()
    {
        return Deck.getLast();
    }


    //--------------------------------------------------------
    // Name: Print Top Card
    // Abstract: Prints the top card added to the deck
    //--------------------------------------------------------
    public void printTopCard()
    {
        int CardNumber = Deck.getLast().Number;

        System.out.println(Deck.getLast().Suit);
        if(CardNumber == 1)
        {
            System.out.println("Ace" + " " + Deck.getLast().Suit);
        } else if (CardNumber == 11)
        {
            System.out.println("Jack" + " " + Deck.getLast().Suit);
        } else if (CardNumber == 12)
        {
            System.out.println("Queen" + " " + Deck.getLast().Suit);
        }else if (CardNumber == 13)
        {
            System.out.println("King" + " " + Deck.getLast().Suit);
        } else{
            System.out.println(CardNumber);
        }
        System.out.println();
    }
}