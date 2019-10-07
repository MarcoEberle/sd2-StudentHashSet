import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestMain {

    public static void main(String[] args) {
        Laptop l1 = new Laptop("Apple", "Mac");
        Laptop l2 = new Laptop("Apple", "Mac");

        Student student1 = new Student("Max", 234567, l1);
        Student student2 = new Student("Max", 234567, l1);
        Student student3 = new Student("Max", 234568, l2);

        Set<Student> set1 = new HashSet<>();
        set1.add(student1);
        set1.add(student2);
        set1.add(student3);
        System.out.println(set1);

    }


}