package exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = createList();

        printList("Original list: ", list);

        List<Integer> reversedList = reverseListWithIterator(list);

        printList("Reversed list: ", reversedList);
    }

    private static List<Integer> createList() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        return list;
    }

    private static List<Integer> reverseListWithIterator(List<Integer> list) {
        List<Integer> reversedList = new ArrayList<>();
        ListIterator<Integer> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            reversedList.add(iterator.previous());
        }
        return reversedList;
    }

    private static void printList(String message, List<Integer> list) {
        System.out.println(message + list);
    }
}
