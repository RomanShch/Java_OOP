package units;

import java.util.ArrayList;

// Разбойник
public class Robber extends Person {
    public Robber(String name, int x, int y) {
        super(name, 100, 10, 20, 40, "knife", 50, "Разбойник", x, y, 2);
    }

    public void attack(Person person) {
        person.health -= super.power;
    }

    public void stealGold(int val) {
        super.gold += val;
    }

   

    @Override
    public void step(ArrayList<Person> enemis, ArrayList<Person> friends) {
        
    }
}
