import java.util.Objects;

public class Cadet extends Person {
    String rank;
    String academy;

    public Cadet(String name, int age, String gender, String rank, String academy) {
        super(name, age, gender);
        this.rank = rank;
        this.academy = academy;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("Rank: " + rank + ", Academy: " + academy);
    }

    @Override
    public void work() {
        System.out.println(name + " is training as a cadet with the rank of " + rank + " at " + academy + ".");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cadet)) return false;
        if (!super.equals(o)) return false;
        Cadet cadet = (Cadet) o;
        return Objects.equals(rank, cadet.rank) && Objects.equals(academy, cadet.academy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), rank, academy);
    }

    @Override
    public String toString() {
        return "Cadet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", rank='" + rank + '\'' +
                ", academy='" + academy + '\'' +
                '}';
    }
}
