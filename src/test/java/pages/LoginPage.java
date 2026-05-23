package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WaitUtils;

public class LoginPage extends BasePage {


    public LoginPage(WebDriver driver){
        super(driver);
    }

    By username = By.name("username");
    By password = By.name("password");
    By loginBtn = By.xpath("//button[@type='submit']");
    By errorMessage = By.xpath("//p[contains(@class,'alert')]");


    public void login(String user, String pass){
        WaitUtils.waitForVisibility(driver,username);
//        driver.findElement(username).sendKeys(user);
//        driver.findElement(password).sendKeys(pass);
//        driver.findElement(loginBtn).click();
        type(username,user);
        type(password,pass);
        click(loginBtn);
    }

    public String getErrorMessage(){
        return getText(errorMessage);
    }
}
