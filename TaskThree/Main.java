import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("lars", new ArrayList<>(Arrays.asList("math","history")));

        System.out.println(s1.passedCourses("math"));

        Teacher t1 = new Teacher("tove", new ArrayList<>(Arrays.asList("math", "history")));

        System.out.println(t1.canTeach("math"));



    }
}