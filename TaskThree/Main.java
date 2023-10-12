import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> student1Courses = new ArrayList<>();
        student1Courses.add("math");
        student1Courses.add("math");
        student1Courses.add("math");

        Student s1 = new Student("lars", student1Courses);

        ArrayList<String> teacher1Courses = new ArrayList<>();
        student1Courses.add("math");
        student1Courses.add("math");
        student1Courses.add("math");

        Teacher t1 = new Teacher("tove", teacher1Courses);

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(s1);
        persons.add(t1);

        for (int i = 0; i < persons.size(); i++) {
            persons.get(i).get("java 1.0");


        }





    }
}