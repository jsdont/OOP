package problem4;

import practice2.Student;
import java.util.Vector;

public class GradeBook {
    private Course course;
    private Vector<Student> students = new Vector<>();

    public GradeBook(Course course) {
        this.course = course;
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public void displayMessage() {
        System.out.println("Welcome to the grade book for " + course);
    }

    public void displayGradeReport() {
        int sum = 0, max = 0, min = 100;

        for (Student s : students) {
            int g = s.getGrade();
            sum += g;
            if (g > max) max = g;
            if (g < min) min = g;
        }

        System.out.println("Average: " + (sum / students.size()));
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }

    public String toString() {
        return course.toString();
    }
}
