import java.io.Serializable;

public class Lesson implements Serializable{
    
    String Cindex;
    String Course;

    public Lesson(String course, String cindex) {
        Cindex = cindex;
        Course = course;
    }

    public String getCindex() {
        return Cindex;
    }

    public void setCindex(String cindex) {
        Cindex = cindex;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String course) {
        Course = course;
    }

    
    
}