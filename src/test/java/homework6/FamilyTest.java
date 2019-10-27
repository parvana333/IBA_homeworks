package homework6;
import static org.junit.Assert.*;
public class FamilyTest {

    @org.junit.Before
    public void setup() {
        System.out.println("Running a test...");
    }

    @org.junit.Test
    public void addChild() {
        String [][] schedula=new String[2][7];
        Human [] children=new Human[3];
        Human mother=new Human("afet","babayev",1970, (byte)100,schedula);
        Human  father= new Human("rahib","yunusov",1970, (byte)100,schedula);
        Family family=new Family(mother,father,children);
        Human child=new Human("pervane","yunusova",1993);
        Human child2=new Human("pervin","yunusova",1993);
        Human [] children1=new Human[3];
        children1[0]=child;
        children1[1]=child2;
        family.addChild(children,child);
        family.addChild(children,child2);
        assertArrayEquals(children,children1);

    }

    @org.junit.Test
    public void deleteChild() {
        String [][] schedula=new String[2][7];
        Human [] children=new Human[3];
        Human mother=new Human("afet","babayev",1970, (byte)100,schedula);
        Human  father= new Human("rahib","yunusov",1970, (byte)100,schedula);
        Family family=new Family(mother,father,children);
        Human child=new Human("pervane","yunusova",1993);
        family.addChild(children,child);
        family.deleteChild(child);
        Human [] children1=new Human[3];
        assertArrayEquals(children1,children);

    }
    //testing of deleting element that does not exist
    @org.junit.Test
    public void deleteChild1() {
        String [][] schedula=new String[2][7];
        Human [] children=new Human[3];
        Human [] children1=new Human[3];
        Human mother=new Human("afet","babayev",1970, (byte)100,schedula);
        Human  father= new Human("rahib","yunusov",1970, (byte)100,schedula);
        Family family=new Family(mother,father,children);
        Human child=new Human("pervane","yunusova",1993);
        Human child2=new Human("pervin","yunusova",1993);
        family.addChild(children,child);
        children1[0]=child;
        family.deleteChild(child2);
        assertArrayEquals(children1,children);
    }
//delete with index
    @org.junit.Test
    public void deleteChild2() {
        String [][] schedula=new String[2][7];
        Human [] children=new Human[3];
        Human mother=new Human("afet","babayev",1970, (byte)100,schedula);
        Human  father= new Human("rahib","yunusov",1970, (byte)100,schedula);
        Family family=new Family(mother,father,children);
        Human child=new Human("pervane","yunusova",1993);
        family.addChild(children,child);
        family.deleteChild(0);
        Human [] children1=new Human[3];
        assertArrayEquals(children1,children);
    }
 //delete with index
    @org.junit.Test
    public void deleteChild3() {
        String [][] schedula=new String[2][7];
        Human [] children=new Human[3];
        Human [] children1=new Human[3];
        Human mother=new Human("afet","babayev",1970, (byte)100,schedula);
        Human  father= new Human("rahib","yunusov",1970, (byte)100,schedula);
        Family family=new Family(mother,father,children);
        Human child=new Human("pervane","yunusova",1993);
        family.addChild(children,child);
        children1[0]=child;
        family.deleteChild(3);
        assertArrayEquals(children1,children);
    }

    @org.junit.Test
    public void countFamily() {
        String [][] schedula=new String[2][7];
        Human [] children=new Human[3];
        Human mother=new Human("afet","babayev",1970, (byte)100,schedula);
        Human  father= new Human("rahib","yunusov",1970, (byte)100,schedula);
        Family family=new Family(mother,father,children);
        Human child=new Human("pervane","yunusova",1993);
        family.addChild(children,child);
        assertEquals(3,family.countFamily());
    }
}