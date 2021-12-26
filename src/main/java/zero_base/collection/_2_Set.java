package zero_base.collection;

import java.util.*;

public class _2_Set {

    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        hashSet.add("4");
        hashSet.add("2");
        hashSet.add("3");
        hashSet.add("1");
        hashSet.add("1");
        hashSet.add("1");

        Iterator<String> hashSetIterator = hashSet.iterator();
        while(hashSetIterator.hasNext()) {
            System.out.println(hashSetIterator.next());
            // a,b,c,d,x 중복제거 & 순서정렬
        }

        System.out.println("    ::::    ");
        linkedHashSet.add("4");
        linkedHashSet.add("2");
        linkedHashSet.add("3");
        linkedHashSet.add("1");
        linkedHashSet.add("1");
        linkedHashSet.add("1");

        Iterator<String> linkedHashSetIterator = linkedHashSet.iterator();
        while(linkedHashSetIterator.hasNext()) {
            System.out.println(linkedHashSetIterator.next());
            // a,b,c,d,x 중복제거
        }


        System.out.println("    ::::    ");
        treeSet.add("4");
        treeSet.add("2");
        treeSet.add("3");
        treeSet.add("1");
        treeSet.add("1");
        treeSet.add("1");

        Iterator<String> treeSetIterator = treeSet.iterator();
        while(treeSetIterator.hasNext()) {
            System.out.println(treeSetIterator.next());
            // a,b,c,d,x 중복제거
        }


    }

}
