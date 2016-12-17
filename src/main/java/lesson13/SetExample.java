package lesson13;

import org.testng.annotations.Test;

import java.util.*;

/**
 * Created by Alex Astakhov on 11.11.2016.
 */
public class SetExample {

    @Test
    public void testSet(){
        Set<String> strHashSet = new HashSet<>();
        Set<String> strLinkedHashSet = new LinkedHashSet<>();
        TreeSet<String> strTreeSet = new TreeSet<>();

        strHashSet.add("c");
        strHashSet.add("b");
        strHashSet.add("a");

        strLinkedHashSet.add("c");
        strLinkedHashSet.add("b");
        strLinkedHashSet.add("a");

        strTreeSet.add("c");
        strTreeSet.add("b");
        strTreeSet.add("a");

        System.out.println(strHashSet.toString());
        System.out.println(strLinkedHashSet.toString());
        System.out.println(strTreeSet.toString());

        Iterator<String> iterator = strHashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
