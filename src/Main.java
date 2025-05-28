import Card.Monster.Attribute.Attribute;
import Card.Monster.Monster;
import Card.Monster.MonsterType.EffectMonster;
import Card.Monster.MonsterType.NormalMonster;
import Card.Monster.MonsterType.EffectMonster;

import Card.Monster.Type.Type;

public class Main {
    public static void main(String[] args) {
        Monster dragonBlanc = new Monster("Dragon Blanc aux Yeux Bleus", Attribute.LIGHT, 3000, 2500, 8, Type.DRAGON, new EffectMonster(), 0);
        Monster magicienNoir = new Monster("Magicien Noir", Attribute.DARK, 2500, 2100, 7, Type.SPELLCASTER, new NormalMonster(), 1);

        dragonBlanc.info();
        magicienNoir.info();
    }
}