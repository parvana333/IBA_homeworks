package homework6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Family  {
    private Human mother;
    private Human father;
    private Human [] children;
    private Pet pet;
    int index=0;
    public Family() {

    }
    public Family(Human mother, Human father)  {
        this.mother = mother;
        this.father=father;
    }
    public Family(Human mother, Human father, Human [] children) {
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

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public void addChild (Human [] children, Human child){
        if (index >= children.length)  System.out.println("you passed the limit");
        else children[index++]=child;
    }
    public void deleteChild(Human child){
        ArrayList <Human> list=new ArrayList<>(Arrays.asList(children));
        int n=list.indexOf(child);
        deleteChild(n);
    }
    public void deleteChild(int n){
        if(n>=children.length || n<0 ) System.out.println("there is not child at this index");
        else{
            ArrayList<Human> list=new ArrayList(Arrays.asList(children));
            if(list.get(n)!=null) list.remove(n);
            list.add(n,null);
            children=list.toArray(children);
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
