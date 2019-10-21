package homework5;
import java.util.Arrays;

public class Human {
    private String name;
    private String surname;
    private int dateOfBith;
    private byte iq;
    private Pet pet;
    private String[][] schedule;
    private Family family;

    public Human(String name, String surname, int dateOfBith) {
        this.name = name;
        this.surname = surname;
        this.dateOfBith = dateOfBith;
    }

    public Human(String name, String surname, int dateOfBith, Family family) {
        this.name = name;
        this.surname = surname;
        this.dateOfBith = dateOfBith;
        this.family = family;
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

    public Pet getPet() {
        return pet;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public Family getFamily() {
        return family;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", dateOfBith=" + getDateOfBith() +
                ", schedule=" + Arrays.toString(schedule) +
                '}';
    }
}

