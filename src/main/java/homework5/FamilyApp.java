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
    Human [] children=new Human[2];
    Family newFamily=new Family(mother,father,children);
    newFamily.addChild(children,child);
    newFamily.addChild(children,child2);

     System.out.println("number of family");
     System.out.println( newFamily.countFamily());
     System.out.println(newFamily.toString());
     newFamily.deleteChild(0);
     System.out.println("number of family");
     System.out.println(newFamily.countFamily());

  //checking equality
     Human mother1=new Human("gunes","babayev",1970, (byte)100,schedula);
     Human [] children2=new Human[2];
     Family newFamily2=new Family(mother1,father,children);
     newFamily.addChild(children2,child);
     newFamily.addChild(children2,child2);

     System.out.println(newFamily.equals(newFamily2));




    }
}
