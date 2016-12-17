package lesson13;

import org.testng.annotations.Test;

import java.util.*;

/**
 * Created by Alex Astakhov on 11.11.2016.
 */
public class Task5min {
    @Test
    public void task(){
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(4);
        list.add(3);
        list.add(7);
        list.add(2);
        list.add(2);

        Set<Integer> intSet = new HashSet<>();
        for (Integer i: list){
            intSet.add(i);
        }

        Map<Integer, Integer> counts = new LinkedHashMap<>();
        for (Integer elem: intSet){
            int count = 0;
            for (Integer i: list) {
                if (elem == i){
                    count++;
                }
            }
            counts.put(elem, count);
        }

        for (Map.Entry<Integer, Integer> pair: counts.entrySet()){
            Integer key = pair.getKey();
            Integer value = pair.getValue();
            System.out.println(key + " : " + value);
        }

    }
}
