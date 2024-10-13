import java.util.Objects;

public class Person {
    String name;
    int age;
    String gender;
    String occupation;  // Нове поле

    // Конструктор з додатковим полем occupation
    public Person(String name, int age, String gender, String occupation) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.occupation = occupation;
    }

    // Перевизначений конструктор для сумісності з попередніми викликами
    public Person(String name, int age, String gender) {
        this(name, age, gender, "Unemployed"); // За замовчуванням occupation - "Unemployed"
    }

    // Новий метод для зміни роботи
    public void changeOccupation(String newOccupation) {
        this.occupation = newOccupation;
        System.out.println(name + " has changed their occupation to: " + newOccupation);
    }

    public void introduce() {
        System.out.println("Name: " + name + ", Age: " + age + ", Gender: " + gender + ", Occupation: " + occupation);
    }

    public void work() {
        System.out.println(name + " is working as a " + occupation);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", occupation='" + occupation + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name) &&
                Objects.equals(gender, person.gender) &&
                Objects.equals(occupation, person.occupation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender, occupation);
    }
}
