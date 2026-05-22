package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;


public class LogoutTest extends BaseTest {

   @Test

   public void LogoutTest(){
      LoginPage lp = new LoginPage(driver);
      lp.login("Admin","admin123");

      DashboardPage dp = new DashboardPage(driver);
      dp.logout();

       Assert.assertTrue(driver.getCurrentUrl().contains("login"));
   }




}
