import java.util.LinkedHashMap;
import java.util.Map;

public class Semester {
    private int semesterNumber;
    private Map<String, Integer> courses;

    public Semester(int semesterNumber) {
        this.semesterNumber = semesterNumber;
        this.courses = new LinkedHashMap<>();
    }

    public void addCourse(String courseName, int marks) {
        courses.put(courseName, marks);
    }

    public void displayCourses() {
        System.out.println("\nSemester " + semesterNumber + " Courses and Marks:");
        for (Map.Entry<String, Integer> entry : courses.entrySet()) {
            System.out.println("Course: " + entry.getKey() + " | Marks: " + entry.getValue());
        }
    }

    // Simple test main function
    public static void main(String[] args) {
        Semester sem1 = new Semester(1);
        sem1.addCourse("Mathematics", 85);
        sem1.addCourse("Physics", 78);
        sem1.addCourse("English", 90);
        sem1.displayCourses();
    }
}

