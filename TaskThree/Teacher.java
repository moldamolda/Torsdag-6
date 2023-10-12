import java.util.ArrayList;

public class Teacher extends Person {
    ArrayList<String> canTeach = new ArrayList<>();
    ArrayList<String> currentCourses = new ArrayList<>();
    public Teacher(String name, ArrayList<String> canTeach) {
        super(name);
        this.canTeach= canTeach;
    }



    @Override
    public boolean addCourse(String course){
        for (int i = 0; i < canTeach.size(); i++) {
            if(canTeach.get(i).equals(course)){
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
