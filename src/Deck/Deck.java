package Deck;

import Card.Card;

import java.util.List;
import java.util.ArrayList;

public class Deck {
    private List<Card> deck;
    private static final int MIN = 40;
    private static final int MAX = 60;

    public Deck() {
        this.deck = new ArrayList<>();
    }

    public Deck(List<Card> deck) {
        this.deck = deck;
    }

    public boolean isEmpty() {
        return deck.isEmpty();
    }

    public int size() {
        return deck.size();
    }

    public boolean contains(Card card) {
        return deck.contains(card);
    }

    public void add(Card card) {
        deck.add(card);
    }

    public void remove(Card card) {
        if (deck.contains(card)) {
            deck.remove(card);
        } else {
            System.out.println("Card not in Deck");
        }
    }

    public boolean verify() {
        if (deck.size() < MIN || deck.size() > MAX) {
            return false;
        }
        //Vérifier Si Respect Banlist ET Respect Limite 3 Cartes

        return true;
    }








    public List<Card> getDeck() {
        return deck;
    }

    public void setDeck(List<Card> deck) {
        this.deck = deck;
    }
}
