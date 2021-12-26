package zero_base.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _4_List {

    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        arrayList.add("B");
        arrayList.add("A");
        arrayList.add("D");
        arrayList.add("C");
        arrayList.add("A");

        linkedList.add("B");
        linkedList.add("A");
        linkedList.add("D");
        linkedList.add("C");
        linkedList.add("A");

        for(String a : arrayList) {
            System.out.println(a);
        }

        System.out.println("    :::      ");

        for(String b : linkedList) {
            System.out.println(b);
        }

    }

}
