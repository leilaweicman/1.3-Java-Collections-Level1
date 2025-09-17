package exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        //Create integer List
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Original list: " + list);

        //Reversed integer List
        List<Integer> reversedList = new ArrayList<>();
        ListIterator<Integer> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            reversedList.add(iterator.previous());
        }
        System.out.println("Reversed list: " + reversedList);
    }
}
