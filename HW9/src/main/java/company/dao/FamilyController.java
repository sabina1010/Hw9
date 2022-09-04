package company.dao;

import company.Family;
import company.Human;
import company.abstracts.Pet;
import java.util.List;

public class FamilyController {
    FamilyService familyService;
    public FamilyController(FamilyService familyService){
        this.familyService = familyService;
    }
    public List<Family> getAllFamilies(){
        return familyService.getAllFamilies();
    }
    public void displayAllFamilies(){
        familyService.displayAllFamilies();
    }
    public List<Family> getFamiliesBiggerThan(int count){
        return familyService.getFamiliesBiggerThan(count);
    }
    public List<Family> getFamiliesLessThan(int count){
        return familyService.getFamiliesLessThan(count);
    }

    public int countFamiliesWithMemberNumber(int number){
        return familyService.countFamiliesWithMemberNumber(number);
    }
    public Family createNewFamily(Human mother, Human father){
        return familyService.createNewFamily(mother, father);
    }
    public void deleteFamilyByIndex(int index){
        familyService.deleteFamilyByIndex(index);
    }
    public Family bornChild(Family family, String mName, String fName){
        return familyService.bornChild(family, mName, fName);
    }
    public Family adoptChild(Family family, Human child){
        return familyService.adoptChild(family,child);
    }

    public void deleteAllChildrenOlderThan(int age){
        familyService.deleteAllChildrenOlderThan(age);
    }

    public int count(){
        return familyService.count();
    }
    public Family getFamilyById(int index){
        return familyService.getFamilyById(index);
    }
    public List<Pet> getPets(int index){
        return familyService.getPets(index);
    }
    public void addPet(int index, Pet pet){
        familyService.addPet(index, pet);
    }

}
