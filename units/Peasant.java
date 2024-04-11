package units;

import java.util.ArrayList;

// Крестьянин
public class Peasant extends Person {
    private int arrowsNum;
    boolean inGame = true;

    public Peasant(String name, int x, int y) {
        super(name, 20, 0, 0, 20, "nothing", 20, "Крестьянин", x, y, 0);
    }

    public void giveArrows(int val) {
        this.arrowsNum -= val;
        if (!isInGame()) {
            inGame = false;
        }
    }

    public boolean isInGame() {
        return this.arrowsNum == 0 ? false : true;
    }

   

    @Override
    public void step(ArrayList<Person> enemis, ArrayList<Person> friends) {
        
    }
}
