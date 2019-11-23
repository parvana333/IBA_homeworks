package homework9.controller;
import homework9.servıce.FamilyService;

public class FamilyController {
    private FamilyService familyService;

    public FamilyController() {
        familyService = new FamilyService();
    }

   public void displayAllFamilies(){
        familyService.getAllFamilies().stream()
                .forEach(System.out::println);

   }
    public Family createNewFamily(Human h1,Human h2){
        return familyService.createNewFamily(h1,h2);
    }

    public void deleteFamilyByValue(Family f){
        if(familyService.deleteFamilyByValue(f)==true) System.out.println("Family was deleted");;
    }
    public void deleteFamilyByIndex(int index){
        if(familyService.deleteFamilyByIndex(index)==true) System.out.println("Family was deleted");
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







}
