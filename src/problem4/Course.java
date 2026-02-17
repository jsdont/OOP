package problem4;

public class Course {
    private String name;
    private int credits;

    public Course(String name, int credits) {
        this.name = name;
        this.credits = credits;
    }

    public String toString() {
        return name + " (" + credits + " credits)";
    }
}
