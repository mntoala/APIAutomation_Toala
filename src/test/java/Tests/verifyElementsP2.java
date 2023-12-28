package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import lib.BaseTest;

public class verifyElementsP2 extends BaseTest {
    @Test
    public void checkElementes(){
        Assert.assertTrue(filmsResponses.verifyDateFormat(filmTest));
        Assert.assertTrue(filmTest.getCharacters().size() > 1);
        Assert.assertTrue(filmTest.getPlanets().size() > 1);
        Assert.assertTrue(filmTest.getStarships().size() > 1);
        Assert.assertTrue(filmTest.getVehicles().size() > 1);
        Assert.assertTrue(filmTest.getSpecies().size() > 1);
    }
}
