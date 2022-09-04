package company.dao.impl;

import company.Family;
import company.dao.FamilyDao;

import java.util.ArrayList;
import java.util.List;

public class CollectionFamilyDao implements FamilyDao {
    List<Family> familyList = new ArrayList<>();

    @Override
    public List<Family> getAllFamilies() {
        return familyList;
    }

    @Override
    public Family getFamilyByIndex(int index) {
        if(checkExistence(index))
            return familyList.get(index);
        else
            return null;
    }

    @Override
    public boolean deleteFamily(int index) {
        if(checkExistence(index)) {
            familyList.remove(index);
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public boolean deleteFamily(Family family) {
        return familyList.remove(family);
    }

    @Override
    public void saveFamily(Family family) {
        boolean exist = familyList.stream()
                .anyMatch(fam -> fam.equals(family));
        if(exist){
            familyList.set(familyList.indexOf(family), family);
        }else{
            familyList.add(family);
        }
    }

    private boolean checkExistence(int index){
        return index > -1 && index < familyList.size();
    }

}
