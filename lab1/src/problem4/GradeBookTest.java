package problem4;

import practice2.Student;

public class GradeBookTest {
    public static void main(String[] args) {
        Course c = new Course("OOP", 5);
        GradeBook gb = new GradeBook(c);

        gb.addStudent(new Student("A", 87));
        gb.addStudent(new Student("B", 68));
        gb.addStudent(new Student("C", 94));

        gb.displayMessage();
        gb.displayGradeReport();
    }
}
