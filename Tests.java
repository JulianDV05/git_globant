package tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.PageLogin;
import pages.Pagelogon;
import pages.PageReservation; 
public class Test {
  private WebDriver driver;
  @BeforeMethod
  public void setUp() {
      //System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe";
      driver = new ChromeDriver();
      //driver.manage().window().maximize();
      //driver.manage().window().fullscreen();
      driver.manage().window().setSize(new Dimension(800,600));
      driver.navigate().to("http://newtours.demoaut.com/");

  }  

  @Test
  public void loginIncorrecto() {
    PageLogin pageLogin = new PageLogin(driver);
    PageLogon pageLogon = new PageLogon(driver);
    pageLogin.login("user", "user");
    pageLogon.assertLogonPage();
  }
}
