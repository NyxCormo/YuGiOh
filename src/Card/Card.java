package Card;

public class Card {
    public String name;
    public int id;
    public boolean isAtkPosition;

    public Card(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAtkPosition() {
        return isAtkPosition;
    }
    public void setAtkPosition() {
        isAtkPosition = true;
    }
    public boolean isDefPosition() {
        return !isAtkPosition;
    }
    public void setDefPosition() {
        isAtkPosition = false;
    }
}
