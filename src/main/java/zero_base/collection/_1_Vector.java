package zero_base.collection;

import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class _1_Vector {

    public static void main(String[] args) {

        Vector vector = new Vector();

        vector.add("aa");
        vector.add("bb");
        vector.add(25);
        vector.add(80.15);

        for(int i = 0; i < vector.size(); i++) {
            System.out.println(vector.get(i));
        }

        TreeMap treeMap;
        TreeSet treeSet;

    }

}
