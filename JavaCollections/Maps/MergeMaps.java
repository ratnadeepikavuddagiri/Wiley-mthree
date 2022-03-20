package JavaCollections.Maps;

import java.util.*;

public class MergeMaps {
    public static void main(String[] args) {
        HashMap<Integer,String> m1 = new HashMap<>();
        HashMap<Integer,String> m2 = new HashMap<>();
        m1.put(1,"A");
        m1.put(2,"B");
        m2.put(1,"C");
        m2.put(2,"D");
        HashMap<Integer,Set<String>> mergeMap = new HashMap<>();
        Iterator<Integer> itr1 = m1.keySet().iterator();
        while (itr1.hasNext()) {
            int key = itr1.next();
            String value = m1.get(key);
            Set<String> set = new HashSet<>(); 
                set.add(value);
                mergeMap.put(key,set);
        }
        Iterator<Integer> itr2 = m2.keySet().iterator();
        while (itr2.hasNext()) {
            int key = itr2.next();
            String value = m2.get(key);
            Set<String> set = new HashSet<>(); 
            if(mergeMap.containsKey(key)){
                set = mergeMap.get(key);
                set.add(value);
                mergeMap.put(key,set);
            }
            else{
                set.add(value);
                mergeMap.put(key,set);
            }
        }
        System.out.println(mergeMap);
    }
}
