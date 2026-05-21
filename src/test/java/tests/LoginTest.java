package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void validLoginTest(){
        LoginPage loginPage = new LoginPage(driver);

        loginPage.login("Admin","admin123");

//        String currentUrl = driver.getCurrentUrl();
//
//        Assert.assertTrue(currentUrl.contains("dashboard"));

        DashboardPage dashboardPage = new DashboardPage(driver);

        Assert.assertTrue(dashboardPage.isDashboardDisplayed());
    }
}
