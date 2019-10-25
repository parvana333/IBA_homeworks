package homework4;

public class Human {
    private String name;
    private String surname;
    private int dateOfBith;
    private byte iq;
    private Pet pet;
    private Human mother;
    private Human father;
    private String[][] schedule;

    public Human() {

    }

    public Human(String name, String surname, int dateOfBith) {
        this.name = name;
        this.surname = surname;
        this.dateOfBith = dateOfBith;
    }

    public Human(String name, String surname, int dateOfBith, byte iq, Pet pet, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.dateOfBith = dateOfBith;
        this.mother = mother;
        this.father = father;
        this.pet = pet;
        this.iq = iq;
    }

    public Human(String name, String surname, int dateOfBith, byte iq, Pet pet, Human mother, Human father, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.dateOfBith = dateOfBith;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
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

    public Human getMother() {
        return mother;
    }

    public Human getFather() {
        return father;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void greetPet(Pet pet) {
        System.out.printf("Hello %s", pet.getNickname());

    }

    public void describePet(Pet pet) {
        String sly = "";
        if (pet.getTrickLevel() > 50) {
            sly = "very sly";
        } else
            sly = "almost not sly";

        System.out.printf("I have a %s, he is %d  years old, he is %s", pet.getSpecies(), pet.getAge(), sly);
    }
    @Override
    public String toString() {
        return "Human{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", dateOfBith=" + getDateOfBith() +
                ", iq=" + getIq() +
                ", mother=" + getMother().getName() +
                ", father=" + getFather().getName() +
                ", pet=" + getPet() +
                '}';
    }
}