package ModelsResponses;

import Models.Films;
import Models.People;
import io.restassured.response.Response;
import java.util.List;

public class FilmsResponses extends Films {

    //get film according to the people film list index
    public Films getFilmToPeople(People people, int index ){
        List<String> filmsList= people.getFilms();
        String url= filmsList.get(index);
        Films film= getFilmsDetailUrl(url);
        return film;
    }

    //get film with its URL
    public Films getFilmsDetailUrl(String url){
        Response response = getResponseToUrl(url);
        Films films = response
                .then().statusCode(200)
                .extract().as(Films.class);
        return films;
    }

    public Boolean verifyDateFormat(Films film){
        String date= film.getRelease_date();
        if (date.matches("\\d{4}-\\d{2}-\\d{2}")){
            return true;
        }else{
            return false;
        }
    }

    //get Film with index of url
    public Films getFilmsDetailIndex(int index,int statusCode){
        Response response = getResponseToIndex("films",index);
        Films films = response
                .then().statusCode(statusCode)
                .extract().as(Films.class);
        return films;
    }

    public FilmsResponses() {
    }

}
