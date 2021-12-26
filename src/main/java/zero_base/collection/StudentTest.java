package zero_base.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentTest {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(2, "홍길동2"));
        students.add(new Student(1, "홍길동1"));
        students.add(new Student(3, "홍길동3"));
        students.add(new Student(5, "홍길동5"));
        students.add(new Student(4, "홍길동4"));

        for(Student x : students) {
            System.out.println(x.toString());
        }


        System.out.println("    ::  정렬 후 ::     ");

        Collections.sort(students);
        for(Student x : students) {
            System.out.println(x.toString());
        }

    }


}
