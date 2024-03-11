package units;

public class Crossbowman extends Person {
    public Crossbowman(String name, int age) {
        super(name, 60, 40, age, 20, 30, "gun", 40);
    }

    public void attack(Person person) {
        person.health -= this.power;
    }
}
