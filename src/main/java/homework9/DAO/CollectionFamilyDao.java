package homework9.DAO;

import homework9.familyController.Family;

import java.util.ArrayList;
import java.util.List;

public class CollectionFamilyDao implements FamilyDao<Family> {
    private final List<Family> list=new ArrayList<>();

    @Override
    public List getAllFamilies() {
        return list;
    }

    @Override
    public Family getFamilyByIndex(int index) {
        return list.get(index);
    }

    @Override
    public boolean deleteFamily(int index) {
        if(list.size()>index) {
            list.remove(index);
            return true;
        }
        else return false;

    }

    @Override
    public boolean deleteFamily(Family f) {
        if(list.contains(f)){
            list.remove(f);
            return true;
        }
        else return false;

    }

    @Override
    public void saveFamily(Family f) {
        if(list.contains(f)){
            list.remove((f));
            list.add(f);
        }
        else list.add(f);
    }

    public int countMember(Family f){
        return 2+f.getChildren().size();

    }
}
