package homework9.familyService;
import homework9.DAO.CollectionFamilyDao;
import homework9.DAO.FamilyDao;
import homework9.familyController.Family;
import homework9.familyController.Human;

import java.util.List;

public class FamilyService {
    private CollectionFamilyDao dao;
    private Family family;

    public List<Family> getAllFamilies(){
        return dao.getAllFamilies();
    }
    public void displayAllFamilies(){
        dao.getAllFamilies().stream().forEach(System.out::println);
    }
    public void getFamiliesBiggerThan(int numMember){
       for (Family l: getAllFamilies()){
           if(dao.countMember(l)>numMember){
               System.out.println(l.toString());
           }
       }
    }
    public void getFamiliesLessThan(int numMember){
        for (Family l: getAllFamilies()){
            if(dao.countMember(l)<numMember){
                System.out.println(l.toString());
            }
        }
    }
    public void createNewFamily(Human h1,Human h2){
        Family newFamily=new Family(h1,h2);
        dao.saveFamily(newFamily);
    }
    public boolean deleteFamilyByIndex(int index){
            return dao.deleteFamily(index);
    }




}
