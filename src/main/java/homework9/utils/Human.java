package homework9.utils;

public class Human {
    private String name;
    private String surname;
    private int dateOfBith;

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

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBith=" + dateOfBith +
                '}';
    }
}
