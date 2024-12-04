package Pages; //menyimpan selector

import org.openqa.selenium.By;

import static Helper.utility.driver;

public class WebPages {
    By input_username = By.id("txt-username");
    By input_password = By.id("txt-password");
    By btn_login = By.id("btn-login");
    By menu_toggle = By.id("menu-toggle");
    By text_login_Failed (String message){
        return By.xpath("//p[text()='" + message + "']");
    }
    By comment_limit = By.id("txt_comment");


    public void openBrowser() {
        driver.get("https://katalon-demo-cura.herokuapp.com/profile.php#login");
    }

    public void input_username(String username) {
        driver.findElement(input_username).sendKeys(username);
    }

    public void input_password(String password) {
        driver.findElement(input_password).sendKeys(password);
    }
    public void clickButton() {
        driver.findElement(btn_login).click();
    }
   public void assertHomePage() {
        driver.findElement(menu_toggle).isDisplayed();
  }
  public void assertLoginFailed(String loginFailed){
        driver.findElement(text_login_Failed(loginFailed)).isDisplayed();
  }
    public void comment_limit(String comment) {
        driver.findElement(comment_limit).sendKeys(comment);
    }
}
//ThisIsNotAPassword