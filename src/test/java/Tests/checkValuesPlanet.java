package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import lib.BaseTest;

import static lib.constants.EXPECTED_GRAVITY;
import static lib.constants.EXPECTED_TERRAINS;

public class checkValuesPlanet extends BaseTest {
    @Test
    public void verifyValuesPlanet(){
        Assert.assertEquals(planetTest.getGravity(),EXPECTED_GRAVITY);
        Assert.assertEquals(planetTest.getTerrain(),EXPECTED_TERRAINS);
    }
}
