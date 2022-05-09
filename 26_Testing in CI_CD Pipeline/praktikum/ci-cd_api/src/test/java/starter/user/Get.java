package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class Get {

    protected static String url = "https://reqres.in/api/";

    @Step("I set GET api endpoints Detail Resources")
    public String setApiEndpoint() {
        return url + "unknown/2";
    }

    @Step("I send GET HTTP request")
    public void sendGetHttpRequest() {
        SerenityRest.given().get(setApiEndpoint());
    }

    @Step("I receive valid HTTP response code 200")
    public void validateHttpResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid data for Detail Resources")
    public void validateDataDetailResources() {
        restAssuredThat(response -> response.body("'data'.'id'", equalTo(2)));
        restAssuredThat(response -> response.body("'data'.'name'", equalTo("fuchsia rose")));
        restAssuredThat(response -> response.body("'data'.'color'", equalTo("#C74375")));
    }

    @Step("I set GET api endpoints Detail User")
    public String SetGETApiEndpointsDetailUser() {
        return url + "users/2";
    }

}
