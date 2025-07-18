package org.selcuk.apiFactory;

import io.restassured.http.Cookies;
import io.restassured.http.Headers;
import io.restassured.response.Response;

import java.util.HashMap;

import static io.restassured.RestAssured.*;

public class ApiRequest extends SpecBuilder {
    public static Response postAction(String endPoint, Headers headers,
                                HashMap<String,Object> formParams, Cookies cookies){
        return given(getRequestSpec())
                .headers(headers)
                .formParams(formParams)
                .cookies(cookies)
                .when().post(endPoint)
                .then().spec(getResponseSpec())
                .extract().response();


    }
    public static Response getAction(String endpoint,Cookies cookies){
        return given(getRequestSpec()).cookies(cookies).
                when().get(endpoint)
                        .then().spec(getResponseSpec())
                        .extract().response();
    }


}
