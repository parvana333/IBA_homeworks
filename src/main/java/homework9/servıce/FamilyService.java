package homework9.servıce;
import homework9.dao.CollectionFamilyDao;
import homework9.dao.FamilyDao;
import homework9.controller.Family;
import homework9.controller.Human;
import java.util.List;

public class FamilyService {
    private FamilyDao<Family> dao;

    public FamilyService() {
        dao = new CollectionFamilyDao();
    }

    public List<Family> getAllFamilies(){
        return dao.getAllFamilies();
    }

    public Family createNewFamily(Human h1,Human h2){
        Family newFamily=new Family(h1,h2);
        dao.saveFamily(newFamily);
        return newFamily;
    }
    public boolean deleteFamilyByIndex(int index){
        return dao.deleteFamily(index);
    }
    public boolean deleteFamilyByValue(Family f){
        return dao.deleteFamily(f);

    }
    public int countFamiliesWithMemberNumber(Family f){
        if(f.getChildren()==null) return 2;
        else return f.getChildren().size()+2;
    }
    public  void bornchild(Family f,Human female, Human male){

    }

    public  void adoptchild(Family f,Human child){


    }




}
