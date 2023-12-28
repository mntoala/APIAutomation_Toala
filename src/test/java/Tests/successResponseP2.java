package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import lib.BaseTest;

public class successResponseP2 extends BaseTest {
    @Test
    public void responseTest(){
        Assert.assertEquals(peopleTest.getSkin_color(),"gold");
        Assert.assertEquals(peopleTest.getFilms().size(),6);
    }
}
