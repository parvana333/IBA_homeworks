package homework8;

import java.util.Map;

public class Human {
    private String name;
    private String surname;
    private int dateOfBith;
    private byte iq;
    private Map<String, String> schedule;
    private Family family;

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

    public Human() {
    }

    public Human(String name, String surname, int dateOfBith) {
        this.name = name;
        this.surname = surname;
        this.dateOfBith = dateOfBith;
    }

    public Human(String name, String surname, int dateOfBith, byte iq, Map<String, String> schedule) {
        this.name = name;
        this.surname = surname;
        this.dateOfBith = dateOfBith;
        this.iq = iq;
        this.schedule = schedule;
    }

    public void greetPet(Pet pet) {
        System.out.printf("Hello %s%n", pet.getSpecies());

    }

    @Override
    public String toString() {
        return String.format("name= %s%n surname= %s%n dateOfbirth=%s%n iq=%d%n", name, surname, dateOfBith, iq);

    }

}
