package ArrayListJava;

import java.util.ArrayList;
import java.util.List;

public class ArrayListJava {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list.get(2));


        for (int i : list) {
            System.out.println(i);
        }
    }
}

// Collections is an interface and it contains three interfaces
// 1. List --> Contains Many Classes such as ArrayList
// 2. Queue --> Contains Many Classes such as PriorityQueue
// 3. Set --> Contains Many Classes such as HashSet