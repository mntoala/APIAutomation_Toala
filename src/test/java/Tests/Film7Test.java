package Tests;

import Models.Endpoints.FilmsEndpoints;
import Models.Films;
import org.testng.annotations.Test;

public class Film7Test {
    Films newFilm = new Films();
    @Test
    public void films7Test(){
        newFilm.verifyStatusCode("films",7,404);
    }
}
