package PageFactory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class testfireLoginTest {

    WebDriver driver;
    testfireLogin objLogin;
    testfireHomePage objHomePage;

    @Before
    public void setup(){
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","F:/Program Files/chromedriver/chromedriver.exe");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.testfire.net/login.jsp");
    }


    @Test
    public void test(){
        objLogin = new testfireLogin(driver);
        objLogin.loginTotestfire("admin", "admin");
        String loginPageTitle = objLogin.getLoginTitle();
        Assert.assertTrue(loginPageTitle.toLowerCase().contains("Hello Admin User"));
        objHomePage = new testfireHomePage(driver);
        Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("Congratulations!"));
    }
}