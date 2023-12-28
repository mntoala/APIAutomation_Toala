package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import lib.BaseTest;

public class compareValuesToUrl extends BaseTest {
    @Test
    public void compareResponses(){
        Assert.assertEquals(responsePlanetTest,responsePlanetToCompare, "Responses do not match");
    }
}
