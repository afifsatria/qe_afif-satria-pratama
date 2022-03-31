package Starter.stepDefinitions;

import Starter.pages.ProfilePage;
import Starter.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Steps;

public class LoginSteps {

    @Steps
    LoginPage loginPage;

    @Steps
    ProfilePage profilePage;

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        loginPage.openUrl("https://demoqa.com/login");
        loginPage.validateOnLoginPage();
    }

    //    @When("I input valid username")
//    public void iInputValidUsername() {
//       loginPage.inputUsername("Hakim001");
//    }
//    @And("I input valid password")
//    public void iInputValidPassword() {
//        loginPage.inputPassword("Valid@01");
//    }
    @And("click login button")
    public void clickLoginButton() {
        loginPage.clickLoginButton();
    }
//    @Then("I go to profile page")
//    public void iGoToProfilePage() {
//        profilePage.headerAppears();
//        profilePage.headerTextEqual();
//    }

    @When("I input {string} username")
    public void iInputUsername(String username) {
        loginPage.inputUsername(username);
    }

    @And("I input {string} password")
    public void iInputPassword(String password) {
        loginPage.inputPassword(password);
    }

    @Then("I get the {string}")
    public void iGetThe(String result) {
        if (result.equals("profile page")){
            profilePage.headerAppears();
            profilePage.headerTextEqual();
        }else if (result.equals("field empty")){
            loginPage.errorFieldAlert();
        }else {
            loginPage.errorMessageAppears();
            loginPage.errorMessageEquals(result);
        }
    }
}

