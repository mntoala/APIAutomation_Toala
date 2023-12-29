package Models.Endpoints;

import Models.Films;
import Models.Planets;
import io.restassured.response.Response;

import java.util.List;

public class PlanetsEndpoints extends Planets {

    //return Planet according to the film's planets list index
    public Planets getPlanetToFilm(Films film, int index){
        String url= getPlanetURL(film,index);
        Planets planet= getPlanetsDetailUrl(url);
        return planet;
    }

    //return Planet according its URL
    public Planets getPlanetsDetailUrl(String url){
        Response response = getResponseToUrl(url);
        Planets planet = response
                .then().statusCode(200)
                .extract().as(Planets.class);
        return planet;
    }

    //return URL of Planet according to Film´s planet list index
    public String getPlanetURL(Films film, int index){
        List<String> planetsList= film.getPlanets();
        String url= planetsList.get(index);
        return url;
    }

    public PlanetsEndpoints() {
    }


}
