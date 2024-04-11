package units;

import java.util.ArrayList;

public class Sniper extends Person {
    private int arrows = 5;
    
    boolean inGame = true;

    public Sniper(String name,int x, int y) {
        super(name, 60, 40, 20, 30, "gun", 40, "Снайпер", x, y, 3);
    }

    public void attack(Person person) {
        person.health -= this.power;
    }

    public boolean isInGame() {
        return this.arrows == 0 ? false : true;
    }

   
   protected void shot(Person target)
    {

        arrows--;
        
        int damage = getRound(power, 10);
        this.health -= damage;
    }

    @Override
    public void step(ArrayList<Person> enemis, ArrayList<Person> friends) {
        if (health <= 0 || arrows <= 0)
        {
            if (arrows <= 0)
            {
                System.out.print(name + ": " + "подайте стрел!");
            }
            return;
        }
        Person target = this.findNearestEnemy(enemis);
        if (target != null)
        {
            shot(target);
        }

      
    }

  
}
