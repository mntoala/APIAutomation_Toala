package Tests;

import ModelsApplication.PeopleApp;
import org.testng.annotations.Test;

public class successResponseP2{
    public PeopleApp peopleApp = new PeopleApp();

    @Test
    public void responseTest(){
        peopleApp.checkSkinColor("gold");
        peopleApp.checkFilmsSize(6);
    }
}
