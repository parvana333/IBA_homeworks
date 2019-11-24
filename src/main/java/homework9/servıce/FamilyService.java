package homework9.servıce;
import homework9.dao.CollectionFamilyDao;
import homework9.dao.FamilyDao;
import homework9.utils.Family;
import homework9.utils.Human;
import homework9.utils.Pet;

import java.time.LocalDate;
import java.util.*;


public class FamilyService  {
    private FamilyDao<Family> dao;

    public FamilyService() {
        dao = new CollectionFamilyDao();
    }

    public List<Family> getAllFamilies(){
        return dao.getAllFamilies();
    }

    public Family createNewFamily(Human h1,Human h2){
        List<Human> children=new ArrayList<>();
        Set<Pet> pets=new HashSet<>();
        Family newFamily=new Family(h1,h2,children,pets);
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
    public  Family bornchild(Family f,String masculine,String famine,String surname,int dateofbirth){
        if(masculine!=null){
            Human bornbaby=new Human(masculine, surname,dateofbirth);
            f.getChildren().add(bornbaby);
        }
        if(famine!=null) {
            Human bornbaby=new Human(famine, surname,dateofbirth);
            f.getChildren().add(bornbaby);
        }
        dao.deleteFamily(f);
        dao.saveFamily(f);
        return f;
    }

    public  Family adoptchild(Family f,Human child){
        f.getChildren().add(child);
        dao.deleteFamily(f);
        dao.saveFamily(f);
        return f;
    }
    public void deleteAllChildrenOlderThen(int age){
        LocalDate date=LocalDate.now();
        for(Family f:getAllFamilies()){
            List<Human> children = f.getChildren();
            Iterator i=children.iterator();
            while (i.hasNext()){
            Human x=(Human) i.next();
            if(date.getYear()-x.getDateOfBith()>age){
               i.remove();
            }
            }
            f.setChildren(children);
            dao.deleteFamily(f);
            dao.saveFamily(f);
        }
    }
    public int count (){
        return dao.getAllFamilies().size();
    }
    public Family getFamilyById(int index){
        return dao.getFamilyByIndex(index);
    }
    public Set<Pet> getPet(int index){
        return dao.getFamilyByIndex(index).getPet();
    }
    public void addPet(int index,Pet pet){
        if(dao.getFamilyByIndex(index)!=null){
                dao.getFamilyByIndex(index).getPet().add(pet);
                Human mother=dao.getFamilyByIndex(index).getMother();
                Human father=dao.getFamilyByIndex(index).getFather();
                List<Human> children = dao.getFamilyByIndex(index).getChildren();
                Set<Pet> pets = dao.getFamilyByIndex(index).getPet();
                Family newfam=new Family(mother,father,children,pets);
                dao.deleteFamily(index);
                dao.saveFamily(newfam);
        }
        else{
            System.out.println("there is not this family");
        }

    }




}
