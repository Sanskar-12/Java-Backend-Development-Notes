package HashSetJava;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HashSetJava {
    public static void main(String[] args) {
        // Set<Integer> set = new HashSet<>(); // --> This stores only unique values inside set and gives the output in any order
        Set<Integer> set = new TreeSet<>(); // --> This gives the values in sorted order

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        // printing with the help of iterator
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // printing with the help of advanced for loop
//        for (int i : set) {
//            System.out.println(i);
//        }

    }
}
