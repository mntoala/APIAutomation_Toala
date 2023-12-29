package ModelsApplication;

import Models.Films;
import Models.People;
import Models.Endpoints.FilmsEndpoints;
import org.testng.Assert;

public class FilmsApp {
    private PeopleApp peopleApp = new PeopleApp(); private People peopleTest = peopleApp.getPeopleTest();
    private FilmsEndpoints filmsEndpoints = new FilmsEndpoints(); private Films filmTest= filmsEndpoints.getFilmToPeople(peopleTest, 1);//Second Film

    public Films getFilmTest() {
        return filmTest;
    }

    public Boolean verifyDateFormat(Films film){
        String date= film.getRelease_date();
        if (date.matches("\\d{4}-\\d{2}-\\d{2}")){
            return true;
        }else{
            return false;
        }
    }
    public void checkDateFormat(){
        Assert.assertTrue(verifyDateFormat(filmTest));
    }
    public void checkElementsSize(){
        Assert.assertTrue(filmTest.getCharacters().size() > 1);
        Assert.assertTrue(filmTest.getPlanets().size() > 1);
        Assert.assertTrue(filmTest.getStarships().size() > 1);
        Assert.assertTrue(filmTest.getVehicles().size() > 1);
        Assert.assertTrue(filmTest.getSpecies().size() > 1);
    }



}
