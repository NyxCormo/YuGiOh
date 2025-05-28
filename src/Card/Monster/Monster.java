package Card.Monster;

import Card.Card;
import Card.Monster.Attribute.Attribute;
import Card.Monster.MonsterType.MonsterType;
import Card.Monster.Type.Type;

public class Monster extends Card {
    Type type;
    Attribute attribute; // Use 'attribute' with lowercase for convention
    MonsterType monsterType;
    int level;
    int atk;
    int def;

    public Monster(String name, Attribute attribute, int atk, int def, int level, Type type, MonsterType monsterType, int id) {
        super(name, id);
        this.type = type;
        this.attribute = attribute;
        this.monsterType = monsterType;
        this.atk = atk;
        this.def = def;
        this.level = level;
    }

    public void info(){
        System.out.println("Name: " + getName() + "Attribute: " + attribute + "atk: " + atk + "def: " + def + "level: " + level + "type: " + type + "monsterType: " + monsterType + "id: " + id);
    }

    public void attack(Card c){
        if(c instanceof Monster){
            Monster m = (Monster) c;
            if (c.isAtkPosition()){
                destroy(c);
                damageLP(m);
            } else {
                destroy(c);
            }
        }
        else { System.out.println("Card is not Monster"); }
    }

    public void damageLP(Card c){

    }

    public void destroy(Card c){

    }





    public MonsterType getMonsterType() {
        return monsterType;
    }

    public void setMonsterType(MonsterType monsterType) {
        this.monsterType = monsterType;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Attribute getAttribute() {
        return attribute;
    }

    public void setAttribute(Attribute attribute) {
        this.attribute = attribute;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
