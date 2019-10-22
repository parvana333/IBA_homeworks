package homework5;
import java.util.Arrays;
import java.util.Random;

public class Family {
    private Human mother;
    private Human father;
    private Human [] children;
    private Pet pet;
    int maxsize;
    int index;

    public Family() {

    }

    public Family(Human mother, Human father, int maxsize) {
        this(maxsize);
        this.mother = mother;
        this.father=father;
    }

    public Family(int maxsize) {
        this.children = new Human[maxsize];
    }

    public Human getMother() {
        return mother;
    }

    public Human getFather() {
        return father;
    }

    public Human[] getChildren() {
        return children;
    }

    public Pet getPet() {
        return pet;
    }

    public void addChild (Human child){
        if (index > maxsize)  System.out.println("you passed");

        else children[index++]=child;
    }
    public void deleteChild(int n){
        for (int i = n; i <children.length-1 ; i++) {
            children[i]=children[i+1];
        }
    }
    public int countFamily(){

        return 2+children.length;
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + getMother() +
                ", father=" + getFather() +
                ", children=" + Arrays.toString(children) +
                ", pet=" + pet +
                '}';
    }
}
