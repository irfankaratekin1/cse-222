import java.util.Stack;

public class Student extends User<Student> {
    private Stack<Assignment> assignments = new Stack<>();

    public Student() {
        super();
    }

    public Student(String name, String surname) {
        super(name, surname);
    }

    public Student(String name, String surname, String mail) {
        super(name, surname, mail);
    }

    public void addAssignment(Assignment a){
        assignments.add(a);
    }

    public Assignment removeAssignment(int index){
        if(index < 0 || index >= assignments.size())
            throw new IndexOutOfBoundsException();

        return assignments.remove(index);
    }

    public Assignment setAssignments(int index,Assignment a) {
        if(index < 0 || index >= assignments.size())
            throw new IndexOutOfBoundsException();

        return assignments.set(index, a);
    }

    public int calculateAverage(Average a) {
        return 0;
    }
    @Override
    public int compareTo(Student o) {
        return 0;
    }
}
