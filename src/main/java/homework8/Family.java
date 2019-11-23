package homework8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Family {
    private Human mother;
    private Human father;
    private List<Human> children;
    private Set<Pet> pet;

    public Family() {

    }

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
    }

    public Family(Human mother, Human father, List<Human> children) {
        this.mother = mother;
        this.father = father;
        this.children = children;
    }

    public Human getMother() {
        return mother;
    }

    public Human getFather() {
        return father;
    }

    public List<Human> getChildren() {
        return children;
    }

    public Set<Pet> getPet() {
        return pet;
    }

    public void setChildren(List<Human> children) {
        this.children = children;
    }

    public void setPet(Set<Pet> pet) {
        this.pet = pet;
    }

    public void addChild(List<Human> children, Human child) {
        children.add(child);
    }

    public void deleteChild(Human child) {
        if (children.contains(child) && child != null) children.remove(child);

    }

    public void deleteChild(int n) {
        if (n >= children.size() || n < 0) System.out.println("there is not child at this index");
        else {
            if (children.get(n) != null) children.remove(n);
        }
    }

    public int countFamily() {
        int count = 0;
        for (Human child : children) {
            if (child != null) count++;
        }
        return 2 + count;
    }

    @Override
    public String toString() {
        return String.format("Family: %nmother%n{%s%n}%nfather%n{%s%n}%nchildren%n{%s%n}%npet%n{%s%n} %n", mother, father, children, pet);
    }
}
