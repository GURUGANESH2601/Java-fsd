package project5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {
        // ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("John");
        arrayList.add("Mary");
        arrayList.add("Bob");
        System.out.println("ArrayList: " + arrayList);

        // HashSet
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        System.out.println("HashSet: " + hashSet);

        // HashMap
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "John");
        hashMap.put(2, "Mary");
        hashMap.put(3, "Bob");
        System.out.println("HashMap: " + hashMap);

        // Iterating over an ArrayList
        System.out.print("Iterating over ArrayList: ");
        Iterator<String> arrayListIterator = arrayList.iterator();
        while (arrayListIterator.hasNext()) {
            String element = arrayListIterator.next();
            System.out.print(element + " ");
        }
        System.out.println();

        // Iterating over a HashSet
        System.out.print("Iterating over HashSet: ");
        Iterator<Integer> hashSetIterator = hashSet.iterator();
        while (hashSetIterator.hasNext()) {
            int element = hashSetIterator.next();
            System.out.print(element + " ");
        }
        System.out.println();

        // Iterating over a HashMap
        System.out.print("Iterating over HashMap: ");
        Iterator<Integer> hashMapIterator = hashMap.keySet().iterator();
        while (hashMapIterator.hasNext()) {
            int key = hashMapIterator.next();
            String value = hashMap.get(key);
            System.out.print(key + ":" + value + " ");
        }
        System.out.println();
    }
}
