import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Student {
    private String name;
    private LocalDate dob;

    public Student(String name, String dobStr) {
        this.name = name;

        if (dobStr.contains("-") && dobStr.indexOf('-') == 4) {
            this.dob = LocalDate.parse(dobStr); // YYYY-MM-DD
        } else {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            this.dob = LocalDate.parse(dobStr, formatter);
        }
    }

    public void displayInfo() {
        int age = Period.between(dob, LocalDate.now()).getYears();
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age + " years");
    }

    // Simple test main function
    public static void main(String[] args) {
        Student student = new Student("Alice", "2004-08-15");
        student.displayInfo();
    }
}


