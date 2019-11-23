package homework8;

import homework8.Family;
import homework8.Human;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class FamilyTest {
    Family family;
    List<Human> children;
    Human mother;
    Human father;

    @org.junit.Before
    public void setup() {
        System.out.println("Running a test...");
        Species species = Species.CAT;
        Set<String> habits = new HashSet<>(Arrays.asList("eat", "drink", "sleep"));
        Pet pet = new Pet(species, "mestan", 23, (byte) 23, habits);
        Pet pet1 = new Pet(species, "mistik", 25, (byte) 29, habits);
        Set<Pet> setpet = new HashSet<>();
        setpet.add(pet);
        setpet.add(pet1);
        Map<String, String> schedula = new HashMap<>();
        schedula.put("Monday", "go the mall");
        mother = new Human("afet", "babayev", 1970, (byte) 100, schedula);
        father = new Human("rahib", "yunusov", 1970, (byte) 100, schedula);
    }


    @Test
    public void addChild() {
        children = new ArrayList<>();
        family = new Family(mother, father, children);
        Human child = new Human("pervane", "yunusova", 1993);
        Human child2 = new Human("pervin", "yunusova", 1993);
        family.addChild(children, child);
        family.addChild(children, child2);
        List<Human> children1 = new ArrayList<>();
        children1.add(child);
        children1.add(child2);
        assertEquals(children, children1);
    }

    @Test
    public void deleteChildViaIndex1() {
        children = new ArrayList<>();
        family = new Family(mother, father, children);
        Human child = new Human("pervane", "yunusova", 1993);
        family.addChild(children, child);
        List<Human> children1 = new ArrayList<>();
        family.deleteChild(0);
        assertEquals(children1, children);
    }

    @Test
    public void deleteChildViaIndex2() {
        children = new ArrayList<>();
        family = new Family(mother, father, children);
        Human child = new Human("pervane", "yunusova", 1993);
        family.addChild(children, child);
        List<Human> children1 = new ArrayList<>();
        children1.add(child);
        family.deleteChild(1);
        assertEquals(children1, children);
    }


    @Test
    public void testDeleteChild() {
        children = new ArrayList<>();
        family = new Family(mother, father, children);
        Human child = new Human("pervane", "yunusova", 1993);
        family.addChild(children, child);
        List<Human> children1 = new ArrayList<>();
        family.deleteChild(child);
        assertEquals(children1, children);
    }

    @Test
    public void testDeleteChild2() {
        children = new ArrayList<>();
        family = new Family(mother, father, children);
        Human child = new Human("pervane", "yunusova", 1993);
        List<Human> children1 = new ArrayList<>();
        family.deleteChild(child);
        assertEquals(children1, children);
    }

    @Test
    public void countFamily() {
        children = new ArrayList<>();
        family = new Family(mother, father, children);
        Human child = new Human("pervane", "yunusova", 1993);
        family.deleteChild(child);
        assertEquals(2, family.countFamily());
    }

    @Test
    public void countFamily1() {
        children = new ArrayList<>();
        family = new Family(mother, father, children);
        Human child = new Human("pervane", "yunusova", 1993);
        family.addChild(children, child);
        assertEquals(3, family.countFamily());
    }
}