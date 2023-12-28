package lib;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static lib.constants.API_PATH;

public class BaseModels {

    //get path or URL of a model with its index
    public String getPath(String model, int n){
        return API_PATH+model+"/"+n+"/";
    }

    //get response of a model with its index
    public Response getResponseToIndex(String model, int n){
        String path= getPath(model, n);
        return given()
                .when().get(path);
    }
    public Response getResponseToUrl(String url){
        return given()
                .when().get(url);
    }
    public void verifyStatusCode(String model, int index,int statusCode){
        Response response = getResponseToIndex(model,index);
        response.then().statusCode(statusCode);
    }

}
