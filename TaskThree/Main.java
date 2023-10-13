import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> student1Courses = new ArrayList<>();
        student1Courses.add("Math");
        student1Courses.add("English");
        student1Courses.add("Geography");

        Student s1 = new Student("lars", student1Courses);

        ArrayList<String> teacher1Courses = new ArrayList<>();
        student1Courses.add("Math");
        student1Courses.add("Chemistry");
        student1Courses.add("Computer Science");

        Teacher t1 = new Teacher("Tove", teacher1Courses);

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(s1);
        persons.add(t1);

        for (Person person : persons) {
           if(!person.addCourse("java 1.0")){
               System.out.println("har allerede bestået");
           }else{
               System.out.println("kan ikke undervise i fag");
           }


        }





    }
}