public class Main {
    public static void main(String[] args) {
        Person person = new Person("Marta", 10, "female", "Student");
        person.introduce();
        person.work();
        person.changeOccupation("Developer");
        person.work(); // Після зміни роботи

        Student student = new Student("Ostap", 20, "male", "LNU", 1);
        student.introduce();
        student.work();

        Cadet cadet = new Cadet("Max", 15, "male", "Radoviy", "LDUBGD");
        cadet.introduce();
        cadet.work();

        // Виведення об'єктів
        System.out.println(person);
        System.out.println(student);
        System.out.println(cadet);
    }
}
