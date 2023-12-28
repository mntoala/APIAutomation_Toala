package lib;

import Models.Planets;
import ModelsResponses.FilmsResponses;
import Models.Films;
import Models.People;
import ModelsResponses.PeopleResponses;
import ModelsResponses.PlanetsResponses;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    public PeopleResponses peopleResponses = new PeopleResponses();
    public FilmsResponses filmsResponses = new FilmsResponses();
    public PlanetsResponses planetsResponses = new PlanetsResponses();
    public People peopleTest;
    public Films filmTest;
    public Planets planetTest;
    public String responsePlanetTest;
    public String responsePlanetToCompare;

    @BeforeClass
    public void setup() {
        peopleTest = peopleResponses.getPeopleDetail(2);
        filmTest =filmsResponses.getFilmToPeople(peopleTest, 1); //second movie of PeopleTest
        planetTest = planetsResponses.getPlanetToFilm(filmTest,0); //first planet of FilmTest
        String urlToCompare= planetsResponses.getPlanetURL(filmTest,0);
        responsePlanetTest= planetsResponses.getResponseToUrl(planetTest.getURL()).asString();
        responsePlanetToCompare= planetsResponses.getResponseToUrl(urlToCompare).asString();
    }

}
