package homework5;
public class Family {
    private Human mother;
    private Human father;
    private Human [] children;
    private Pet pet;


    public Family(Human mother, Human father, Human[] children) {
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

    public Human[] getChildren() {
        return children;
    }

    public Pet getPet() {
        return pet;
    }

    public void addChild (Human child,int n){
        children[n]=child;
        n++;
    }

    public void deleteChild(int n){
        for (int i = n; i <children.length-1 ; i++) {
            children[i]=children[i+1];

        }

    }
    public int countFamily(Family family){
        return 2+children.length;
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + getMother().getName() +
                ", father=" + getFather().getName() +

                '}';
    }
}
