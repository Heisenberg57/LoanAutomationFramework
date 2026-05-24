package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PIMPage extends BasePage {

    public PIMPage(WebDriver driver){
        super(driver);
    }

    By pimMenu = By.xpath("//span[text()='PIM']");
    By employeeNameInput = By.xpath("(//input[@placeholder='Type for hints...'])[1]");
    By searchButton = By.xpath("//button[@type='submit']");

    public void openPIMModule(){
        click(pimMenu);
    }

    public void searchEmployee(String empName){
        type(employeeNameInput,empName);
        click(searchButton);
    }
}
