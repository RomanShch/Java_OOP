package units;

import java.util.ArrayList;

public class Pikeman extends Person {
    public Pikeman(String name, int x, int y) {
        super(name, 80, 30, 30, 50, "pike", 20, "Копейщик", x, y, 2);
    }

    public void attack(Person person) {
        person.health -= this.power;
    }

   

    @Override
    public void step(ArrayList<Person> enemis, ArrayList<Person> friends) {
        
    }
}
