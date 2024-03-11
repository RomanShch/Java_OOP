import units.*;

public class Main {

    public static void main(String[] args) {
        Robber robber = new Robber("Andrey", 20);
        Peasant peasant = new Peasant("Anton", 20);
        Sniper sniper = new Sniper("Matvey", 20);
        Wizard wizard = new Wizard("Igor", 20);
        Pikeman pikeman = new Pikeman("Vasyli", 20);
        Crossbowman crossbowman = new Crossbowman("Aleksander", 20);
        Monk monk = new Monk("Nikita", 20);

        System.out.println(robber);
        System.out.println(peasant);
        System.out.println(sniper);
        System.out.println(wizard);
        System.out.println(pikeman);
        System.out.println(crossbowman);
        System.out.println(monk);

    }
}