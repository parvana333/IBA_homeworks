package homework9;

import homework9.controller.Family;
import homework9.controller.FamilyController;
import homework9.controller.Human;

public class Main {
    public static void main(String[] args) {
        Human h1=new Human("rahib","yunusov",1972);
        Human h2=new Human("afet","babayeva",1971);

        Human h11=new Human("rah","yunusov",1972);
        Human h22=new Human("aft","babayeva",1971);

        FamilyController controller=new FamilyController();
        controller.createNewFamily(h1,h2);
        System.out.println("*********");
        controller.getFamiliesBiggerThan(2);
        controller.getFamiliesLessThan(4);
        System.out.println("*********");

        Family f2=controller.createNewFamily(h11,h22);
        controller.displayAllFamilies();
        controller.deleteFamilyByValue(f2);
        controller.displayAllFamilies();

        controller.deleteFamilyByIndex(0);
        controller.displayAllFamilies();
        //number of member in the family
        System.out.println(controller.countFamiliesWithMemberNumber(f2));


    }
}
