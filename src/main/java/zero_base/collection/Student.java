package zero_base.collection;

public class Student implements Comparable<Student> {

    private int no;
    private String name;

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Student o) {
        return this.no - o.no;
    }

    @Override
    public String toString() {
        return String.format("학번 : %d, 이름: %s", no, name);
    }
}
