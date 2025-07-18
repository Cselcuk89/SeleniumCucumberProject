package org.selcuk.apiFactory;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.selcuk.helpers.ConfigLoadHelper;

public class SpecBuilder {
    public static RequestSpecification getRequestSpec(){
        return new RequestSpecBuilder()
                .setBaseUri(ConfigLoadHelper.getInstance().getBaseUrl())
                .log(LogDetail.ALL)
                .build();
    }
    public static ResponseSpecification getResponseSpec(){
        return new ResponseSpecBuilder()
                .log(LogDetail.ALL)
                .build();
    }
}
