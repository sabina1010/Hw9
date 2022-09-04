package company;

import company.dao.FamilyService;
import company.dao.impl.CollectionFamilyDao;
import company.humans.Man;
import company.humans.Woman;

public class Main {

    public static void main(String[] args) {
        Human mother = new Woman();
        Human father= new Man();
        Family family=new Family(mother,father);
        Human child= new Human();
        FamilyService familyService = new FamilyService(new CollectionFamilyDao());
        familyService.createNewFamily(mother, father);
        System.out.println(familyService.count());
        System.out.println(familyService.getAllFamilies());
        System.out.println(familyService.countFamiliesWithMemberNumber(2));
        System.out.println(familyService.getFamilyById(0));
        
    }

}
