package Tests;

import ModelsApplication.PlanetsApp;
import org.testng.annotations.Test;

public class checkValuesPlanet{
    PlanetsApp planetsApp= new PlanetsApp();

    @Test
    public void verifyValuesPlanet(){
        planetsApp.checkGravity();
        planetsApp.checkTerrain();
    }
}
