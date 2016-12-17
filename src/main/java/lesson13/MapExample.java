package lesson13;

import org.testng.annotations.Test;

import java.util.*;

/**
 * Created by Alex Astakhov on 11.11.2016.
 */
public class MapExample {

    @Test
    public void testMap(){
        Map<String, Integer> hashMap = new HashMap<>();
        Map<String, Integer> linkedMap = new LinkedHashMap<>();
        Map<String, Integer> treeMap = new TreeMap<>();

        hashMap.put("first", 1);
        hashMap.put("second", 2);
        hashMap.put("third", 3);

        for (Map.Entry<String, Integer> pair: hashMap.entrySet()){
            String key = pair.getKey();
            Integer value = pair.getValue();
            System.out.println(key + " = " + value);
        }

        Iterator<Map.Entry<String, Integer>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> pair = iterator.next();
            String key = pair.getKey();
            Integer value = pair.getValue();
            System.out.println(key + " = " + value);
        }


    }
}
