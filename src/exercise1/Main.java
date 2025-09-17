package exercise1;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Month> months = createMonthsList();
        print("ArrayList without August: " + months);

        insertAugustAt(months, 7);
        print("ArrayList in order: " + months);

        // Convert to HashSet
        Set<Month> monthSet = new HashSet<>(months);
        print("HashSet before adding a duplicate: " + monthSet);

        // Try to add duplicate
        boolean added = monthSet.add(new Month("January"));
        print("Added duplicate? " + added);
        print("HashSet with no duplicates: " + monthSet);

        printWithForEach(monthSet);
        printWithIterator(monthSet);

    }

    private static List<Month> createMonthsList() {
        List<Month> months = new ArrayList<>();
        months.add(new Month("January"));
        months.add(new Month("February"));
        months.add(new Month("March"));
        months.add(new Month("April"));
        months.add(new Month("May"));
        months.add(new Month("June"));
        months.add(new Month("July"));
        months.add(new Month("September"));
        months.add(new Month("October"));
        months.add(new Month("November"));
        months.add(new Month("December"));
        return months;
    }

    private static void insertAugustAt(List<Month> months, int index) {
        months.add(index, new Month("August"));
    }

    private static void printWithForEach(Set<Month> monthSet) {
        print("For-each: ");
        for (Month month: monthSet) {
            print(month);
        }
    }

    private static void printWithIterator(Set<Month> monthSet) {
        print("Iterator: ");
        Iterator<Month> iterator = monthSet.iterator();
        while (iterator.hasNext()) {
            print(iterator.next() + " ");
        }
    }

    private static void print(Object msg) {
        System.out.println(msg);
    }
}
