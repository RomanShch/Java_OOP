package units;

public class Crossbowman extends Person {
    public Crossbowman(String name, int x, int y) {
        super(name, 60, 40, 20, 30, "gun", 40, "Арбалетчик", x, y);
    }

    public void attack(Person person) {
        person.health -= this.power;
    }
}
