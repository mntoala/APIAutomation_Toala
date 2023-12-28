package Tests;

import org.testng.annotations.Test;
import lib.BaseTest;

public class Film7Test extends BaseTest {
    @Test
    public void films7Test(){
        filmsResponses.verifyStatusCode("films",7,404);
    }
}
