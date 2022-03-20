package JavaCollections;

import java.util.*;
public class ListSetDemo {
    public static void main(String[] args) {
        
        ArrayList<Character> list = new ArrayList<>();
        list.add('a');
        list.add('A');
        list.add('5');
        list.add('Z');
        System.out.println("Character List after adding all the characters : ");
        System.out.println(list);

        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<list.size();i++) {
            set.add((int)list.get(i));
        }
        System.out.println("Integer Set after copying characters from List : ");
        System.out.println(set);
        ArrayList<Integer> newList = new ArrayList<>();
        newList.addAll(set);
        Collections.sort(newList, Collections.reverseOrder());
       HashSet newsSet = new LinkedHashSet<>(newList);
        System.out.println("After sorting in descending order : ");
        System.out.println(newsSet);

    }
}
