package homework6;
public class FamilyApp {
    public static void main(String[] args) {
    String [][] schedula=new String[2][7];
//Enum
    DayOfWeek day=DayOfWeek.Monday;
    schedula[0]= new String[]{day.name(), day.activity};
    day=DayOfWeek.Tuesday;
    day.setActivity("do nothing");
    schedula[1]=new String[]{day.name(), day.activity};
    Human mother=new Human("afet","babayev",1970, (byte)100,schedula);
    day=DayOfWeek.Wednesday;
    schedula[0]= new String[]{day.name(), day.activity};
    Human  father= new Human("rahib","yunusov",1970, (byte)100,schedula);
    Human child=new Human("pervane","yunusova",1993);
    Human child2=new Human("pervin","yunusov",1996);
    Human [] children=new Human[4];

//creation of family object
    Family newFamily=new Family(mother,father,children);
    newFamily.addChild(children,child);
    newFamily.addChild(children,child2);
    System.out.println("Number of Family");
    System.out.println(newFamily.countFamily());
//delete method with Human parameter
    newFamily.deleteChild(child);
    System.out.println("number of family");
    System.out.println( newFamily.countFamily());
 //delete method with index parameter
     newFamily.deleteChild(1);
     System.out.println("number of family");
     System.out.println(newFamily.countFamily());

  //checking equality
     Human [] children2=new Human[2];
     Family newFamily2=new Family(mother,father,children2);
     newFamily2.addChild(children2,child);
     System.out.printf("are they same family? %B%n",newFamily.equals(newFamily2));

     System.out.println(newFamily.toString());

    }
}
