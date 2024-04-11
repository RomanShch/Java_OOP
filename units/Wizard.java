package units;

import java.util.ArrayList;

public class Wizard extends Person {
    private int mana;
    private int healVal;
    private int healPrice;
    private int attackPrice;

    public Wizard(String name, int x, int y) {
        super(name, 80, 30,5, 30, "Stick", 30, "Маг", x, y, 1);
        this.mana = 10;
        this.healPrice = 2;
        this.attackPrice = 1;
    }

    public void attack(Person person) {
        person.health -= this.power;
        this.mana -= price("attack");
    }

    public void heal(Person person) {
        person.health += this.healVal;
        this.mana -= price("heal");
    }

    public void heal() {
        super.health += this.healVal;
        this.mana -= price("heal");
    }

    private int price(String action) {
        if (action == "heal")
            return healPrice;
        else if (action == "attack")
            return attackPrice;
        return 0;
    }

    

    @Override
    public void step(ArrayList<Person> enemis, ArrayList<Person> friends) {

    }
}
