package homework5;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class Family {
    private Human mother;
    private Human father;
    private Human [] children;
    private Pet pet;
    public Family() {

    }
    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father=father;
    }
    public Family(Human mother, Human father,Human [] children) {
        this.children=children;
        this.mother=mother;
        this.father=father;
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

    public void addChild (Human [] children,Human child){
        int index=0;
        if (index > children.length)  System.out.println("you passed the limit");
        else children[index++]=child;
    }
    public void deleteChild(int n){
        if(n>children.length) System.out.println("there is not child at this index");
        else{
            if(n>=1){
                for (int i = n; i <children.length-1 ; i++) {
                    children[i]=children[i+1];
                }
            }
            else children[n]=null;
        }

    }
    public int countFamily(){
        int count=0;
        for (Human child: children) {
            if (child != null)  count++;
        }
        return 2+count;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Family)) return false;
        Family family = (Family) o;
        return Objects.equals(getMother(), family.getMother()) &&
                Objects.equals(getFather(), family.getFather()) &&
                Arrays.equals(getChildren(), family.getChildren());
    }

    @Override
    public int hashCode() {

        int result = Objects.hash(getMother(), getFather());
        result = 31 * result + Arrays.hashCode(getChildren());
        return result;
    }
}
