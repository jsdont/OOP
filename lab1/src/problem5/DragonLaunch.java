package problem5;

import java.util.Vector;

public class DragonLaunch {
    private Vector<Person> people = new Vector<>();

    public void kidnap(Person p) {
        people.add(p);
    }

    public boolean willDragonEatOrNot() {
        int balance = 0;

        for (Person p : people) {
            if (p.getGender() == Gender.BOY)
                balance++;
            else
                balance--;

            if (balance < 0) return false;
        }
        return balance != 0;
    }

    public static void main(String[] args) {
        DragonLaunch d = new DragonLaunch();
        d.kidnap(new Person(Gender.BOY));
        d.kidnap(new Person(Gender.GIRL));
        d.kidnap(new Person(Gender.BOY));

        System.out.println(d.willDragonEatOrNot());
    }
}
