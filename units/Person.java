package units;
// Проанализировать персонажей "Крестьянин, Разбойник, Снайпер, Колдун, Копейщик, Арбалетчик, Монах". Для каждого определит 8 полей данных(здоровье, сила итд) 3-4 поля поведения(методов атаковать, вылечить итд). Создать абстрактный класс и иерархию наследников. Расположить классы в пакет так, чтобы в основной программе небыло видно их полей. В не абстрактных классах переопределить метод toString() так чтобы он возвращал название класса или имя. Создать в основной программе по одному обьекту каждого не абстрактного класса и вывести в консоль его имя.

public abstract class Person {
    protected String name;
    protected int health;
    protected int power;
    protected int age;
    protected int armor;
    protected int endurance; // Выносливость
    protected String weapon;
    protected int gold;

    public Person(String name, int health, int power, int age, int armor, int endurance, String weapon, int gold) {
        this.name = name;
        this.health = health;
        this.power = power;
        this.age = age;
        this.armor = armor;
        this.endurance = endurance;
        this.weapon = weapon;
        this.gold = gold;
    }

    @Override
    public String toString() {
        return name;
    }
}

// public void heal(int val) {
// this.health += val;
// }