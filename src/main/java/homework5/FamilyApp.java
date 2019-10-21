package homework5;

public class FamilyApp{
    public static void main(String[] args) {
    Human mother=new Human("afet","babayev",1970);
    Human  father= new Human("rahib","yunusov",1970);
    Human children1=new Human("pervane","yunusova",1993);
    Human [] children={children1};
    Family newFamily=new Family(children);
    Family curremtFamily=new Family(mother,father,newFamily);
     curremtFamily.toString();


    }
}
