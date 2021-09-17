package com.example.carddeck;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public abstract class AbstractDeck implements Deck {

    protected List<Card> cards;

    public List<Card> getDeck() {
        return this.cards;
    }

    @Override
    public void shuffle() {
        long seed = System.nanoTime();
        Collections.shuffle(this.cards, new Random(seed));
    }

    @Override
    public void cut(int index) {

    }

    @Override
    public Card deal(){
        return null;
    }

    @Override
    public void newOrder(Deck deck){

    }

    @Override
    public int search(Card card){
        return 0;
    }

    @Override
    public int size(){
        return 0;
    }

    @Override
    public Card turnOver(){
        return null;
    }


}
