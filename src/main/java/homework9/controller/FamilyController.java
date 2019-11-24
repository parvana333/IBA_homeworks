package homework9.controller;
import homework9.servıce.FamilyService;
import homework9.utils.Family;
import homework9.utils.Human;
import homework9.utils.Pet;

import java.util.HashSet;
import java.util.Set;

public class FamilyController {
    private FamilyService familyService;

    public FamilyController() {
        familyService = new FamilyService();
    }
   public void displayAllFamilies(){
        familyService.getAllFamilies().stream()
                .forEach(System.out::println);

   }
    public Family createNewFamily(Human h1, Human h2){

        return familyService.createNewFamily(h1,h2);
    }

    public void deleteFamilyByValue(Family f){
        if(familyService.deleteFamilyByValue(f)==true)
            System.out.println("Family was deleted");;
    }
    public void deleteFamilyByIndex(int index){
        if(familyService.deleteFamilyByIndex(index)==true)
            System.out.println("Family was deleted");
    }
    public int countFamiliesWithMemberNumber(Family f){
        return familyService.countFamiliesWithMemberNumber(f);
    }

    public void getFamiliesBiggerThan(int num){
        for(Family f:familyService.getAllFamilies()){
            if(familyService.countFamiliesWithMemberNumber(f)>num){
                System.out.println(f.toString());
            }
            else System.out.println("there is not like this family");
        }
    }
    public void getFamiliesLessThan(int num){
        for(Family f:familyService.getAllFamilies()){
            if(familyService.countFamiliesWithMemberNumber(f)<num){
                System.out.println(f.toString());
            }
            else System.out.println("there is not like this family");
        }
    }
    public void bornchild(Family f,String masculine,String famine,String surname,int dateofbirth){
         familyService.bornchild(f,masculine,famine,surname, dateofbirth);
    }
    public void adoptchild(Family f,Human child){
        familyService.adoptchild(f,child);
    }
    public void deleteAllChildrenOlderThen(int age){
        familyService.deleteAllChildrenOlderThen(age);
    }
    public int count (){
        return familyService.getAllFamilies().size();
    }
    public Family getFamilyById(int index){
        return familyService.getFamilyById(index);
    }
    public Set<Pet> getPet(int index){
        return familyService.getPet(index);
    }
    public void addPet(int index,Pet pet){
        familyService.addPet(index,pet);
    }






}
