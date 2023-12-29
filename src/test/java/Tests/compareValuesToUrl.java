package Tests;

import ModelsApplication.PlanetsApp;
import org.testng.annotations.Test;

public class compareValuesToUrl {
    PlanetsApp planetsApp= new PlanetsApp();

    @Test
    public void compareResponses(){
        planetsApp.compareResponsesOfPlanets();
    }
}
