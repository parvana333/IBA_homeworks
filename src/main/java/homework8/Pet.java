package homework8;
import java.util.HashSet;
import java.util.Set;
public class Pet {
    private Species species;
    private String nickname;
    private int age;
    private byte trickLevel;
    private Set<String> habits = new HashSet<>();

    public Pet(Species species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public Pet(Species species, String nickname, int age, byte trickLevel, Set<String> habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public int getAge() {
        return age;
    }

    public byte getTrickLevel() {
        return trickLevel;
    }

    public void eat() {
        System.out.println("I am eating");
    }

    public void respond(String nickname) {
        System.out.printf("Hello, owner. I am - '%s'. I miss you!", nickname);
    }

    public void foul() {
        System.out.println("I need to cover it up");
    }

    @Override
    public String toString() {
        return String.format("species=%s%n nickname=%s%n age=%s%n tricklevel=%s%n habits=%s%n", species, nickname, age, trickLevel, habits);
    }
}
