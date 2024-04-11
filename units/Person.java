package units;
import java.util.ArrayList;
import  java.util.Random;
// Проанализировать персонажей "Крестьянин, Разбойник, Снайпер, Колдун, Копейщик, Арбалетчик, Монах". Для каждого определит 8 полей данных(здоровье, сила итд) 3-4 поля поведения(методов атаковать, вылечить итд). Создать абстрактный класс и иерархию наследников. Расположить классы в пакет так, чтобы в основной программе небыло видно их полей. В не абстрактных классах переопределить метод toString() так чтобы он возвращал название класса или имя. Создать в основной программе по одному обьекту каждого не абстрактного класса и вывести в консоль его имя.

public abstract class Person implements ActionInterface {
    protected String name;
    protected int health;
    protected int power;
    protected int age;
    protected int armor;
    protected int endurance; // Выносливость
    protected String weapon;
    protected int gold;
    protected String className;
    protected Position position;
    public int priority;
    protected static Random rnd;
    static {
        rnd = new Random();
    }

    public Person(String name, int health, int power, int armor, int endurance, String weapon, int gold, String className, int x, int y, int priority) {
        this.name = name;
        this.health = health;
        this.power = power;
        this.armor = armor;
        this.endurance = endurance;
        this.weapon = weapon;
        this.gold = gold;
        this.className = className;
        this.position = new Position(x, y);
        this.priority = priority;
        
    }

    public double getDistance(Person target){
        double targetDistance = Math.sqrt(Math.pow(position.getX() - position.getX(), 2)+ Math.pow(position.getY() - position.getY(), 2));
        return targetDistance;
    }
    

        public Person findNearestEnemy(ArrayList<Person> enemis){
           Person target = null;
           double distance = Integer.MAX_VALUE;
           
           for(Person p : enemis){
               double dist = position.getDistance(p.position);
               if(dist < distance){
                   distance = dist;
                   target = p;
               }
           }
           return target;
       }
   
       protected int getRound(int origin, int percent)
       {
           if (percent > origin)
               return origin;
           int n = (origin * percent) / 100;
           return origin + (rnd.nextInt(0, n * 2+1)- n);
       }

    // public Person findNearestEnemy(ArrayList<Person> enemis){
    //     Person target = null;
    //     double distance = Integer.MAX_VALUE;
        
    //     for(Person p : enemis){
    //         double n = p.getDistance(this);
    //         if(n < distance){
    //             distance = n;
    //             target = p;
    //         }
    //     }
    //     return target;
    // }

    @Override
    public String toString() {
        return(className +  " " + "-" +  " " + name +  " [" + position.x + ":" + position.y + "]");
    }




    
}

// public void heal(int val) {
// this.health += val;
// }