package Exercise1;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Create list of months
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

        System.out.println("ArrayList without August: " + months);

        // Insert August in the correct position
        months.add(7, new Month("August"));
        System.out.println("ArrayList in order: " + months);

        // Convert to HashSet
        Set<Month> monthSet = new HashSet<>(months);
        System.out.println("HashSet before adding a duplicate: " + monthSet);

        // Try to add duplicate
        boolean added = monthSet.add(new Month("January"));
        System.out.println("Added duplicate? " + added);
        System.out.println("HashSet with no duplicates: " + monthSet);

        // Iterate with for-each
        System.out.println("For-each: ");
        for (Month month: monthSet) {
            System.out.println(month);
        }

        // Iterate with Iterator
        System.out.print("Iterator: ");
        Iterator<Month> iterator = months.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
