import java.lang.reflect.Field;

public class Teacher extends User<Teacher> {
    public Teacher() {
        super();
    }

    public Teacher(String name, String surname) {
        super(name, surname);
    }

    public Teacher(String name, String surname, String mail) {
        super(name, surname, mail);
    }

    @Override
    public int compareTo(Teacher o) {
        return 0;
    }
}
