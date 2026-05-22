package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage extends BasePage {
//    WebDriver driver;

    public DashboardPage(WebDriver driver){
        super((driver));
    }

    By dashBoardHeader = By.xpath("//h6[text()='Dashboard']");
    By profileMenu = By.xpath("//p[@class='oxd-userdropdown-name']");
    By logotBtn = By.xpath("//a[text()='Logout']");

    public boolean isDashboardDisplayed(){

        return driver.findElement(dashBoardHeader).isDisplayed();
    }

    public void logout(){
        driver.findElement(profileMenu).click();
        driver.findElement(logotBtn).click();
    }
}
