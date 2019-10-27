package homework7;

public  class Human {
    private String name;
    private String surname;
    private int dateOfBith;
    private byte iq;
    private Pet pet;
    private Human mother;
    private Human father;

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

    public Human() {
    }

    public Human(String name, String surname, int dateOfBith) {
        this.name = name;
        this.surname = surname;
        this.dateOfBith = dateOfBith;
    }

    public Human(String name, String surname, int dateOfBith, byte iq, Pet pet) {
        this.name = name;
        this.surname = surname;
        this.dateOfBith = dateOfBith;
        this.iq = iq;
        this.pet = pet;

    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public void greetPet(Pet pet) {
        System.out.printf("Hello %s%n", pet.getSpecies());

    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", dateOfBith=" + getDateOfBith() +
                ", iq=" + getIq() +
                ", pet=" + getPet() +
                ", mother=" + getMother()+
                ", father=" + getFather() +
                '}';
    }
}
