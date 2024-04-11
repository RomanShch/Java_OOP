import java.util.ArrayList;
import  java.util.Random;
import units.*;

public class Main {
    public static ArrayList<Person> hollyTeam;

    public static ArrayList<Person> darkTeam;
    static ArrayList<Person> all = new ArrayList<>();
    public static void main(String[] args) {
        // Robber robber = new Robber("Andrey", 20);
        // Peasant peasant = new Peasant("Anton", 20);
        // Sniper sniper = new Sniper("Matvey", 20);
        // Wizard wizard = new Wizard("Igor", 20);
        // Pikeman pikeman = new Pikeman("Vasyli", 20);
        // Crossbowman crossbowman = new Crossbowman("Aleksander", 20);
        // Monk monk = new Monk("Nikita", 20);

        // System.out.println(robber);
        // System.out.println(peasant);
        // System.out.println(sniper);
        // System.out.println(wizard);
        // System.out.println(pikeman);
        // System.out.println(crossbowman);
        // System.out.println(monk);
        hollyTeam = teamCreator(0, 0);
        darkTeam = teamCreator(0, 3);

        all.addAll(hollyTeam);
        all.addAll(darkTeam);
        // System.out.println(all);

        all.sort((o1, o2) -> Integer.compare(o2.priority, o1.priority));
        // System.out.println(all);


       


            for (Person p : all) {
                    System.out.println(p + " ходит. ");
                if (darkTeam.contains(p)) {
              
                    p.step(hollyTeam, darkTeam);
                  } 
                    else {
                    p.step(darkTeam, hollyTeam);
                  }
                //   System.out.println();
                }
                
                
                
        // System.out.println(hollyTeam);
        // System.out.println();
        // System.out.println(darkTeam);
        // Sniper sniper = new Sniper(getName(), 3, 6);
        // Person target = sniper.findNearestEnemy(darkTeam);
        // System.out.println(" Nearest target is " + target);
        // sniper.step(hollyTeam);
        // System.out.println("Снайпер атакует");
    
        

    }

    

    public static ArrayList<Person> teamCreator(int val, int num){
        ArrayList<Person> team = new ArrayList<Person>();
        int teamCount = 10;
        for(int i = 0; i < teamCount ; i++){
            switch (new Random().nextInt(4) + num) {
                case 0:
                    team.add(new Crossbowman(getName(), 0, i));
                    break;  
                case 1:
                    team.add(new Monk(getName(),0, i));
                    break;
                case 2:
                    team.add(new Pikeman(getName(), 0, i));
                    break;
                case 3:
                    team.add(new Peasant(getName(), num * 3, i));
                    break;
                case 4:
                    team.add(new Sniper(getName(), 9, i));
                    break;
                case 5:
                    team.add(new Wizard(getName(), 9, i));
                    break;
                case 6:
                    team.add(new Robber(getName(), 9, i));
                    break;    
            
                default:
                    System.out.println("UNCPT ERROR");
                    break;
            }
            
        }
        return team;
    }

    private static String getName(){
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length )]);
        }

}