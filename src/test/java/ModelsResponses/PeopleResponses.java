package ModelsResponses;

import Models.People;
import io.restassured.response.Response;

public class PeopleResponses extends People {

    //get People with index of its url
    public People getPeopleDetail(int index){
        Response response = getResponseToIndex("people",index);
        People people = response
                .then().statusCode(200)
                .extract().as(People.class);
        return people;
    }
    public PeopleResponses() {
    }

}
