package homework5;

public class FamilyApp{
    public static void main(String[] args) {
    String [][] schedula=new String[2][7];
    Human mother=new Human("afet","babayev",1970, (byte)100,schedula);
        schedula[0]= new String[]{"Monaday", "write code"};
        schedula[1]=new String[]{"thuesday", "write code"};
    Human  father= new Human("rahib","yunusov",1970, (byte)100,schedula);
    Human child=new Human("pervane","yunusova",1993);
    Human child2=new Human("pervin","yunusov",1996);
    Family newFamily=new Family(mother,father,2);
    newFamily.addChild(child);
    newFamily.addChild(child2);
     System.out.println("number of family");
     System.out.println( newFamily.countFamily());
     System.out.println(newFamily.toString());
     newFamily.deleteChild(0);
     System.out.println("number of family");
     System.out.println(newFamily.countFamily());

    }
}
