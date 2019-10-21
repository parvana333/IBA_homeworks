package homework5;
import java.util.Arrays;

public class Pet {
    private String species;
    private String nickname;
    private int age;
    private byte trickLevel;
    private String [] habits;
    public Pet(){

    }
    public Pet(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public Pet(String species, String nickname, int age, byte trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public String getSpecies() {
        return species;
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

    public void eat(){
        System.out.println("I am eating");
    }
    public void respond(String nickname){
        System.out.printf ("Hello, owner. I am - '%s'. I miss you!", nickname);
    }
    public void foul(){
        System.out.println("I need to cover it up");
    }

    @Override
    public String toString() {
        return   getSpecies()+"{" +
                "nickname='" + getNickname() + '\'' +
                ", age=" + getAge()+
                ", trickLevel=" + getTrickLevel() +
                ", habits=" + Arrays.toString(habits)+
                '}';
    }
}
