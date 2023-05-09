package project6;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        // create a HashMap
        Map<String, Integer> map = new HashMap<>();

        // add some key-value pairs to the map
        map.put("John", 28);
        map.put("Mary", 32);
        map.put("Bob", 45);

        // print the map
        System.out.println("Map: " + map);

        // get the value for a specific key
        String key = "Mary";
        int value = map.get(key);
        System.out.println("Value for key \"" + key + "\": " + value);

        // iterate over the map
        System.out.print("Iterating over the map: ");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String name = entry.getKey();
            int age = entry.getValue();
            System.out.print(name + ":" + age + " ");
        }
        System.out.println();

        // check if a key exists in the map
        String newKey = "Alice";
        if (map.containsKey(newKey)) {
            System.out.println("Map contains key \"" + newKey + "\"");
        } else {
            System.out.println("Map does not contain key \"" + newKey + "\"");
        }

        // remove a key-value pair from the map
        String removeKey = "Bob";
        map.remove(removeKey);
        System.out.println("Map after removing key \"" + removeKey + "\": " + map);
    }
}
