import java.util.ArrayList;

public class Student extends Person{
    ArrayList<String> passedCourses = new ArrayList<>();
    ArrayList<String> currentCourses = new ArrayList<>();
    public Student(String name, ArrayList<String> passedCourses) {
        super(name);
        this.passedCourses = passedCourses;

    }


    @Override
    public boolean addCourse(String course){
        for (int i = 0; i < passedCourses.size(); i++) {
            if(passedCourses.get(i).equals(course)){
                return false;
            }
        }
        for (int i = 0; i < currentCourses.size(); i++) {
            if(currentCourses.get(i).equals(course)){
                return false;
            }
        }
        currentCourses.add(course);
        return true;
    }

}
