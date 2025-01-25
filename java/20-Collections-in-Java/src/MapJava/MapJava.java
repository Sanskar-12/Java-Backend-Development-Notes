package MapJava;

import java.util.HashMap;
import java.util.Map;

public class MapJava {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("Sanskar", 90);
        map.put("Anjali", 84);
        map.put("Rohan", 93);
        map.put("Sanskar", 80); // --> in map the key are Set and the values are List

        for (String i : map.keySet()) {
            System.out.println(i + " : " + map.get(i));
        }
    }
}


// Map is collection of key and value pair and it is the combination of Set and List
// where Keys behaves as Set and Values behaves as List
