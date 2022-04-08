package stepdefinitions.APIStepDefinitions;


import com.github.javafaker.Faker;
import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.Registrant;
import utilities.Driver;

import static hooks.Hooks.spec;
import static io.restassured.RestAssured.given;

public class RegistrantApiSteps {

    Hooks hooks=new Hooks();
    Faker faker;
    Response response;
    Registrant requestBody;

    @Given("Kullanıcı path param belirler")
    public void kullanıcı_path_param_belirler() {

        spec.pathParams("p1","api","p2","account");
    }

    @Given("Kullanıcı post methodu için request body i hazırlar")
    public void kullanıcı_post_methodu_için_request_body_i_hazırlar() {

        faker=new Faker();
         requestBody=new Registrant(faker.name().username(),
                faker.name().firstName(),
                faker.name().lastName(),
                faker.numerify("###-##-####"),
                faker.internet().emailAddress(),"ROLE_PHYSICIAN");
        System.out.println(requestBody);

    }

    @Then("Kullanıcı response u kaydeder")
    public void kullanıcıResponseUKaydeder() {

        spec.pathParams("p1","api","p2","account");
        response=given().
                contentType(ContentType.JSON).
                spec(spec).
                headers("Authorization","Bearer ",Driver.generateToken()).
                body(requestBody).
                when().
                post("/{p1}/{p2}");

        response.prettyPrint();
    }


}
