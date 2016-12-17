package lesson13;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Alex Astakhov on 11.11.2016.
 */
public class ListExample {
    @Test
    public void testList(){
        List<String> strArrayList = new ArrayList<>();
        List<String> strLinkedList = new LinkedList<>();

        strArrayList.add("aaa");
        strArrayList.add("bbb");
        strArrayList.add("ccc");

        Iterator<String> iterator = strArrayList.iterator();
        while (iterator.hasNext()){
            String text = iterator.next();
            System.out.println(text);
        }

        for (String text: strArrayList) {
            System.out.println(text);
        }

        // создаем новую коллекцию из старой, но с фильтрованием по наличию "а" в элементе
        List<String> str = strArrayList.stream().filter(s -> s.contains("a")).collect(Collectors.toList());
        System.out.println(str.toString());
    }
}
