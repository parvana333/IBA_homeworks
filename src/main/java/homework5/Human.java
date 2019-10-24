package homework5;
import java.util.Arrays;
import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private int dateOfBith;
    private byte iq;
    private String[][] schedule;
    private Family family;

    public Human() {
    }

    public Human(String name, String surname, int dateOfBith,byte iq, String[][] schedule ) {
        this.iq=iq;
        this.schedule=schedule;
        this.name = name;
        this.surname = surname;
        this.dateOfBith = dateOfBith;
    }

    public Human(String name, String surname, int dateOfBith) {
        this.name = name;
        this.surname = surname;
        this.dateOfBith = dateOfBith;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getDateOfBith() {
        return dateOfBith;
    }

    public byte getIq() {
        return iq;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", dateOfBith=" + getDateOfBith() +
                ", schedule=" + Arrays.deepToString(schedule) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human human = (Human) o;
        return getDateOfBith() == human.getDateOfBith() &&
                Objects.equals(getName(), human.getName()) &&
                Objects.equals(getSurname(), human.getSurname());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getName(), getSurname(), getDateOfBith());
    }
}

