package homework5;

public class FamilyApp{
    public static void main(String[] args) {
    Family f1=new Family();
    Family f2=new Family();
    Human mother=new Human("afet","babayev",1970,f1);
    Human  father= new Human("rahib","yunusov",1970,f2);
    Family newFamily=new Family(mother,father,2);
    Human[] children=new Human[newFamily.maxsize];
        for (int i = 0; i <children.length ; i++) {
            newFamily.addChild(new Human());
        }
     System.out.println( newFamily.countFamily());
     System.out.println(newFamily.toString());

        System.out.println(f1.toString());

    }
}
