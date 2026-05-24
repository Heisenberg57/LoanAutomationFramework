package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;
import pages.PIMPage;
import utils.WaitUtils;

public class EmployeeSearchText extends BaseTest {

    @Test
    public void employeeSearchTest(){
        LoginPage loginPage = new LoginPage(driver);

        loginPage.login("Admin","admin123");

        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.openPIMModule();

        PIMPage pimPage = new PIMPage(driver);

        pimPage.searchEmployee("Linda");



        Assert.assertTrue(pimPage.isEmployeePresent("Linda"));
    }
}
