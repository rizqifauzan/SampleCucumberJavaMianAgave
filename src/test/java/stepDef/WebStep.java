package stepDef;

import Pages.WebPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class WebStep {

    WebPages webPages;

    public WebStep(){
        this.webPages = new WebPages();
    }

    @Given("open web login page")
    public void openWebLoginPage() {
        webPages.openBrowser();
    }

    @And("user input Username {string}")
    public void userInputUsername(String username) {
        webPages.input_username(username);
        
    }

    @And("user input Password {string}")
    public void userInputPassword(String password) {
        webPages.input_password(password);
        
    }

    @And("user click Login  button")
    public void userClickLoginButton() {
        webPages.clickButton();
        
    }

    @And("the user will be redirected to the menu toggle")
    public void theUserWillBeRedirectedToTheMenu() {
        webPages.assertHomePage();
    }

    @And("the user will see login failed {string}")
    public void theUserWillSeeLoginFailed(String loginFailed) {
        webPages.assertLoginFailed(loginFailed);
    }


    @And("user fills in comment form {string}")
    public void userFillsInCommentForm(String comment) {
        webPages.comment_limit(comment);
    }
}
