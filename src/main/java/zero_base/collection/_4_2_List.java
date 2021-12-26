package zero_base.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class _4_2_List {
    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();

        arrayList.add("B");
        arrayList.add("A");
        arrayList.add("D");
        arrayList.add("C");
        arrayList.add("A");

        for(String a : arrayList) {
            System.out.println(a);
        }

        Collections.sort(arrayList);
        System.out.println("    ::      ");
        for(String a : arrayList) {
            System.out.println(a);
        }
    }
}
