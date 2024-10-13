import java.util.Objects;

public class Student extends Person {
    String university;
    int course;

    public Student(String name, int age, String gender, String university, int course) {
        super(name, age, gender);
        this.university = university;
        this.course = course;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("University: " + university + ", Course: " + course);
    }

    @Override
    public void work() {
        System.out.println("Student is studying");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(university, student.university);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), university, course);
    }
}
