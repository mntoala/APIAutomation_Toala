package Models.Endpoints;

import Models.People;
import io.restassured.response.Response;

public class PeopleEndpoints extends People {

    //return People according index of its url
    public People getPeopleDetail(int index){
        Response response = getResponseToIndex("people",index);
        People people = response
                .then().statusCode(200)
                .extract().as(People.class);
        return people;
    }
    public PeopleEndpoints() {
    }

}
