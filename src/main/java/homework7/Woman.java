package homework7;

public final class Woman extends Human {


    public void makeup(){
        System.out.printf("%s%n"," I like makeup");
    }

    public Woman(String name, String surname, int dateOfBith) {
        super(name, surname, dateOfBith);
    }

    public Woman(String name, String surname, int dateOfBith, byte iq, Pet pet) {
        super(name, surname, dateOfBith, iq, pet);
    }

    @Override
    public void greetPet(Pet pet) {
        super.greetPet(pet);
    }


}
