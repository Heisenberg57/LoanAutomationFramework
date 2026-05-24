package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WaitUtils;

import java.util.List;

public class PIMPage extends BasePage {

    public PIMPage(WebDriver driver){
        super(driver);
    }


    By employeeNameInput = By.xpath("(//input[@placeholder='Type for hints...'])[1]");
    By searchButton = By.xpath("//button[@type='submit']");
    By employeeTableRows = By.xpath("//div[@role='row']");



    public void searchEmployee(String empName){
        type(employeeNameInput,empName);
        click(searchButton);
    }

    public boolean isEmployeePresent(String employeeName){
        WaitUtils.waitForVisibility(driver,employeeTableRows);
        List<WebElement> rows = driver.findElements(employeeTableRows);

        for (WebElement row : rows){
            if(row.getText().contains(employeeName)){
                return true;
            }

        }
        return false;
    }
}
