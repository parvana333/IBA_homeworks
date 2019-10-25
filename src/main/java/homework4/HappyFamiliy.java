package homework4;

public class HappyFamiliy {
    public static void main(String[] args) {
        Human mother = new Human("Afet", "babayev", 1970);
        Human father = new Human("Rahib", "Yunusov", 1970);
        Pet pet = new Pet("dog", "poly", 5, (byte) 50, new String[]{"eat", "drink", "sleep"});
        Human child = new Human("pervane", "yunusova", 1993, (byte) 95, pet, mother, father);
        System.out.println(child.toString());
        child.greetPet(pet);
        System.out.println();
        child.describePet(pet);
    }
}