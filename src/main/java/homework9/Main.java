package homework9;

import homework8.Species;
import homework9.utils.Family;
import homework9.controller.FamilyController;
import homework9.utils.Human;
import homework9.utils.Pet;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FamilyController controller=new FamilyController();
        Human h1=new Human("rahib","yunusov",1972);
        Human h2=new Human("afet","babayeva",1971);
        Human h11=new Human("rah","yunusov",1972);
        Human h22=new Human("aft","babayeva",1971);
        System.out.println("********* checking displayallfamily");
        Family f1=controller.createNewFamily(h1,h2);
        Family f2=controller.createNewFamily(h11,h22);
        controller.displayAllFamilies();
        System.out.println("********* getFamiliesBiggerThan");
        controller.getFamiliesBiggerThan(1);
        System.out.println("********* getFamiliesLessThan");
        controller.getFamiliesLessThan(4);
        System.out.println("*********deleteFamilyByValue");
        controller.deleteFamilyByValue(f2);
        controller.displayAllFamilies();
        System.out.println("*********deleteFamilyByIndex");
        controller.deleteFamilyByIndex(0);
        controller.displayAllFamilies();
        System.out.println("********* checking bornchild method");
        Family f3=controller.createNewFamily(h11,h22);
        controller.bornchild(f3,"Eli",null,"eliyev",1996);
        controller.displayAllFamilies();
        System.out.println("********* checking adoptchild method");
        Human child=new Human("qasim","qasimov",1993);
        controller.adoptchild(f3,child);
        controller.displayAllFamilies();
        System.out.println("*********deleteAllChildrenOlderThen ");
        controller.deleteAllChildrenOlderThen(5);
        controller.displayAllFamilies();
        System.out.println("*********addpet");
        Pet pet=new Pet(Species.CAT,"mestan");
        Family f4=controller.createNewFamily(h1,h2);
        Human h13=new Human("tapdig","tapdigli",1972);
        Human h23=new Human("resadet","tapdigli",1971);
        controller.createNewFamily(h13,h23);
        controller.addPet(1,pet);
        System.out.println(controller.getFamilyById(1));

    }
}
