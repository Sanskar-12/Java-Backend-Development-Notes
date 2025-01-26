package ArrayListJava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapFilterReduceInJava {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);

        // Convert the list into Stream
        Stream<Integer> s1 = list.stream();

        // Filter
        Stream<Integer> s2 = s1.filter(n -> n % 2 == 0); // Filter out only even numbers from the list

        // Map
        Stream<Integer> s3 = s2.map(n -> n * 2); // Doubling the value and returning it

        // Reduce
        int s4 = s3.reduce(0, (n1, n2) -> n1 + n2); // Sums up all the values of array and returns only single Integer

        // We can also write the map, filter and reduce in the same line
        int result = list.stream().filter(n -> n % 2 == 0).map(n -> n * 2).reduce(0, (n1, n2) -> n1 + n2);


        // Printing the stream
        s3.forEach(n -> System.out.println(n));
//        s2.forEach(n -> System.out.println(n)); // --> It will give runtime error because we cannot reuse the same Stream multiple times

    }
}

// Stream Api in Java

// Stream provides many useful methods like map, filter, and reduce like javascript
// Map Method --> We can iterate in list and we can perform any function we want
// Filter Method --> In Filter we can filter the values inside the list based on some condition
// Reduce Method --> In Reduce we can perform any function and it will give only one result

// Note: Once the Stream is used it cannot be reused
