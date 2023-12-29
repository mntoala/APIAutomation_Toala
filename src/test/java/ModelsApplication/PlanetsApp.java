package ModelsApplication;

import Models.Films;
import Models.Planets;
import Models.Endpoints.PlanetsEndpoints;
import org.testng.Assert;

import static lib.constants.EXPECTED_GRAVITY;
import static lib.constants.EXPECTED_TERRAINS;

public class PlanetsApp {
    private FilmsApp filmsApp= new FilmsApp(); private Films filmTest = filmsApp.getFilmTest();
    private PlanetsEndpoints planetsEndpoints= new PlanetsEndpoints() ;
    private Planets planetTest= planetsEndpoints.getPlanetToFilm(filmTest,0); //First Planet
    public String responsePlanetTest;
    public String responsePlanetToCompare;

    public void checkGravity(){
        Assert.assertEquals(planetTest.getGravity(),EXPECTED_GRAVITY);
    }
    public void checkTerrain(){
        Assert.assertEquals(planetTest.getTerrain(),EXPECTED_TERRAINS);
    }
    public String getURLToCompare(){
        return planetsEndpoints.getPlanetURL(filmTest,0);
    }
    public void compareResponsesOfPlanets(){
        responsePlanetTest= planetsEndpoints.getResponseToUrl(planetTest.getURL()).asString();
        responsePlanetToCompare= planetsEndpoints.getResponseToUrl(getURLToCompare()).asString();
        Assert.assertEquals(responsePlanetTest,responsePlanetToCompare, "Responses do not match");
    }


}
