package Tests;

import ModelsApplication.FilmsApp;
import org.testng.annotations.Test;

public class verifyElementsP2 {
    FilmsApp filmsApp= new FilmsApp();

    @Test
    public void checkElementes(){
        filmsApp.checkDateFormat();
        filmsApp.checkElementsSize();
    }
}
