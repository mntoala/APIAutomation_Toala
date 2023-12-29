package ModelsApplication;

import Models.People;
import Models.Endpoints.PeopleEndpoints;
import org.testng.Assert;


public class PeopleApp {
    public PeopleEndpoints peopleEndpoints = new PeopleEndpoints();
    public People peopleTest =peopleEndpoints.getPeopleDetail(2);

    public People getPeopleTest() {
        return peopleTest;
    }

    public void checkSkinColor(String skin_color){
        Assert.assertEquals(peopleTest.getSkin_color(),skin_color);
    }
    public void checkFilmsSize(int size){
        Assert.assertEquals(peopleTest.getFilms().size(),6);
    }

}
