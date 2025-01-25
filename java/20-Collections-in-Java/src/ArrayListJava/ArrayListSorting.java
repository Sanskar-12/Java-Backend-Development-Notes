package ArrayListJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListSorting {
    public static void main(String[] args) {

        Comparator<Integer> comp = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) { // --> Logic to sort with the help of last digit
                if (o1 % 10 > o2 % 10) {
                    return 1;
                } else if (o1 % 10 < o2 % 10) {
                    return -1;
                } else {
                    return 0;
                }
            }
        };

        List<Integer> list = new ArrayList<>();

        list.add(31);
        list.add(29);
        list.add(40);
        list.add(88);

        Collections.sort(list, comp); // --> Sorting based on last digit

        for (int i : list) {
            System.out.println(i);
        }
    }
}
