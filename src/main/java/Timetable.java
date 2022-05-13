import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Timetable {
    /**
    private String courseName;
    private String timeStamp;
    */
    protected Map<String, String> courses = new HashMap<>();

    public void newCourse(String courseName){
        //this.courseName = courseName;
        courses.put(courseName, "-");
    }

    public void removeCourse(String courseName){
        courses.remove(courseName);
    }

    public String getCourses(){
        return courses.toString();
    }

    @Override
    public String toString(){
        return courses+" "+courses.values();
    }
}
