package behavior;

import java.util.Random;

public class HeroesNames {
    private static Random rnd;
    private static String[] names = {"Джонатан Арчер",
            "Абадонна",
            "Николас Раш",
            "Зефрам Кохрэйн",
            "Кэтрин Джейнвэй",
            "Азария II",
            "Изабелла Валентайн",
            "Нийота Ухура",
            "Павел Чехов",
            "Жан-Люк Пикар",
            "Зафод Библброкс",
            "Спок",
            "Илыш-Шочын-Ава",
            "Николай Петрович Кирсанов",
            "Хикару Сулу",
            "Клауд Страйф"

    };
    static {
        rnd = new Random();
    }

    public static String getName(int index)
    {
        if (index >= names.length)
            index = 0;
        return names[index];
    }

    public static String getRandomName()
    {
        return names[rnd.nextInt(names.length)];
    }
}