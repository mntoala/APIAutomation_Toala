package ModelsResponses;

import Models.Films;
import Models.Planets;
import io.restassured.response.Response;

import java.util.List;

public class PlanetsResponses extends Planets {

    //get Planet according to the people film list index
    public Planets getPlanetToFilm(Films film, int index){
        String url= getPlanetURL(film,index);
        Planets planet= getPlanetsDetailUrl(url);
        return planet;
    }

    //get Planet with its URL
    public Planets getPlanetsDetailUrl(String url){
        Response response = getResponseToUrl(url);
        Planets planet = response
                .then().statusCode(200)
                .extract().as(Planets.class);
        return planet;
    }

    //get URL of Planet on a Film´s planet list
    public String getPlanetURL(Films film, int index){
        List<String> planetsList= film.getPlanets();
        String url= planetsList.get(index);
        return url;
    }

    //get Planet with index of url
    public Planets getPlanetsDetailIndex(int index){
        Response response = getResponseToIndex("planets",index);
        Planets planet = response
                .then().statusCode(200)
                .extract().as(Planets.class);
        return planet;
    }
    public PlanetsResponses() {
    }


}
