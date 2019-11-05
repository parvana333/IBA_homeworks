package homework9.familyController;

import homework9.familyService.FamilyService;

import java.util.List;

public class FamilyController {
    private FamilyService familyService;


    //should i follow this way for each method?

    public List<Family> getAllFamilies(){
        return familyService.getAllFamilies();
    }





}
