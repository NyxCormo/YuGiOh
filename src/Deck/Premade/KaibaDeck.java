package Deck.Premade;

import Card.Card;
import Card.Monster.Attribute.Attribute;
import Card.Monster.Monster;
import Card.Monster.MonsterType.EffectMonster;
import Card.Monster.Type.Type;
import Deck.Deck;

import java.util.ArrayList;
import java.util.List;

public class KaibaDeck {
    public KaibaDeck() {
        super(create());
    }

    public List<Card> create() {
        List<Card> kaibaCards = new ArrayList<>();

        kaibaCards.add(new Monster("Dragon Blanc aux Yeux Bleus", Attribute.LIGHT, 3000, 2500, 8, Type.DRAGON, new EffectMonster(), 0));




        return kaibaCards;
    }
}
