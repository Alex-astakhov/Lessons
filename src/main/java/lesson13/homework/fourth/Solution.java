package lesson13.homework.fourth;

import java.util.*;

/**
 * Created by Alex Astakhov on 12.11.2016.
 */
/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/
public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> cats = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            Cat cat = new Cat("cat" + i);
            cats.put(cat.toString(), cat);
        }
        return cats;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Iterator<Map.Entry<String, Cat>> iterator = map.entrySet().iterator();
        Set<Cat> cats = new HashSet<>();
        while (iterator.hasNext()){
            Map.Entry<String, Cat> pair = iterator.next();
            cats.add(pair.getValue());
        }
        return cats;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat: set) {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }
}
