package Models.Endpoints;

import Models.Films;
import Models.People;
import io.restassured.response.Response;
import java.util.List;

public class FilmsEndpoints extends Films {

    //return film according to the people's film list index
    public Films getFilmToPeople(People people, int index ){
        List<String> filmsList= people.getFilms();
        String url= filmsList.get(index);
        Films film= getFilmsDetailUrl(url);
        return film;
    }

    //return film according its URL
    public Films getFilmsDetailUrl(String url){
        Response response = getResponseToUrl(url);
        Films films = response
                .then().statusCode(200)
                .extract().as(Films.class);
        return films;
    }

    public FilmsEndpoints() {
    }

}
