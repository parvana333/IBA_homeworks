package homework7;

public final class Man extends Human {
    public void repaircar(){
        System.out.printf("%s%n","I like repair car");
    }

    public Man(String name, String surname, int dateOfBith, byte iq, Pet pet) {
        super(name, surname, dateOfBith, iq, pet);
    }

    @Override
    public void greetPet(Pet pet) {
        super.greetPet(pet);
    }
}
