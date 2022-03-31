package Starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.actions.OpenAt;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;


public class LoginPage extends PageObject {

    private By usernameField(){
        return By.id("userName");
    }
    private By passwordField(){
        return By.id("password");
    }
    private By loginButton() {
        return By.id("login");
    }
    private By errorMessage(){
        return By.xpath("//*[@id=\"name\"]");
    }
    private By alertField() { return By.className("is-invalid");
    }
        @Step
        public static OpenUrl url (String targetUrl){
            return new OpenUrl("https://demoqa.com/login");
        }
        @Step
        public boolean validateOnLoginPage(){
            return $(loginButton()).isDisplayed();
        }
        @Step
        public void inputUsername(String username){
            $(usernameField()).type(username);
        }
        @Step
        public void inputPassword(String password){
            $(passwordField()).type(password);
        }
         @Step
        public void clickLoginButton(){
            $(loginButton()).click();
        }
        @Step
        public boolean errorMessageAppears(){
        return $(errorMessage()).isDisplayed();
        }
        @Step
        public boolean errorMessageEquals(String text){
        return $(errorMessage()).getText().equals(text);
        }
        @Step
        public boolean errorFieldAlert(){
        return $(alertField()).isSelected();
    }

}
