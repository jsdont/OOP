package problem2;

public class UniversityExample {

    enum Status {
        STUDENT, TEACHER
    }

    static int totalPeople;

    final int id;
    String name;
    Status status;

    {
        totalPeople++;
    }

    public UniversityExample(int id) {
        this(id, "Unknown", Status.STUDENT);
    }

    public UniversityExample(int id, String name, Status status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    public static void main(String[] args) {
        UniversityExample p1 = new UniversityExample(1, "Ali", Status.STUDENT);
        UniversityExample p2 = new UniversityExample(2);

        System.out.println(totalPeople);
    }
}
