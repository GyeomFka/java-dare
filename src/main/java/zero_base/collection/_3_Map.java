package zero_base.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class _3_Map {

    public static void main(String[] args) {

        Map<String, String> hashMap = new HashMap<>();
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        Map<String, String> treeMap = new TreeMap<>();

        hashMap.put("B", "B-Value");
        hashMap.put("A", "A-Value");
        hashMap.put("D", "D-Value");
        hashMap.put("C", "C-Value");
        hashMap.put("B", "B'-Value");

        linkedHashMap.put("B", "B-Value");
        linkedHashMap.put("A", "A-Value");
        linkedHashMap.put("D", "D-Value");
        linkedHashMap.put("C", "C-Value");
        linkedHashMap.put("B", "B'-Value");

        treeMap.put("B", "B-Value");
        treeMap.put("A", "A-Value");
        treeMap.put("D", "D-Value");
        treeMap.put("C", "C-Value");
        treeMap.put("B", "B'-Value");

        for(String key : hashMap.keySet()) {
            System.out.println("key = " + hashMap.get(key));
        }
        System.out.println("    :::     ");
        for(String key : linkedHashMap.keySet()) {
            System.out.println("key = " + linkedHashMap.get(key));
        }
        System.out.println("    :::     ");
        for(String key : treeMap.keySet()) {
            System.out.println("key = " + treeMap.get(key));
        }



    }

}
