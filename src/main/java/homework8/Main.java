package homework8;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Species species = Species.CAT;
        Set<String> habits = new HashSet<>(Arrays.asList("eat", "drink", "sleep"));
        Pet pet = new Pet(species, "mestan", 23, (byte) 23, habits);
        Pet pet1 = new Pet(species, "mistik", 25, (byte) 29, habits);
        Set<Pet> setpet = new HashSet<>();
        setpet.add(pet);
        setpet.add(pet1);
        Map<String, String> schedula = new HashMap<>();
        schedula.put("Monday", "go the mall");
        Human mother = new Human("afet", "babayeva", 1976, (byte) 80, schedula);
        Human father = new Human("rahib", "yunusov", 1976);
        Human child1 = new Human("pervane", "yunusova", 1993);
        List<Human> children = new ArrayList<>();
        Family f1 = new Family(mother, father, children);
        f1.setPet(setpet);
        f1.addChild(children, child1);
        System.out.println(f1);
        //delete child via index
        f1.deleteChild(0);
        System.out.println(f1);
        //delete child
        f1.addChild(children, child1);
        f1.deleteChild(child1);
        System.out.println(f1);
        System.out.println(f1.countFamily());
    }
}
