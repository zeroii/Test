package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class testfireLogin {
    WebDriver driver;
    @FindBy(id="uid")
    WebElement usertestfireName;

    @FindBy(id="passw")
    WebElement passwordtestfire;

    @FindBy(xpath="/html/body/table[2]/tbody/tr/td[2]/div/h1")
    WebElement titleText;


    @FindBy(name="btnSubmit")
    WebElement login;

    public testfireLogin(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void setUserName(String strUserName){
        usertestfireName.sendKeys(strUserName);

    }

    public void setPassword(String strPassword){
        passwordtestfire.sendKeys(strPassword);
    }

    //Click on login button
    public void clickLogin(){
        login.click();
    }

    //Get the title of Login Page
    public String getLoginTitle(){
        return	titleText.getText();
    }

    public void loginTotestfire(String strUserName,String strPasword){
        //Fill user name
        this.setUserName(strUserName);
        //Fill password
        this.setPassword(strPasword);
        //Click Login button
        this.clickLogin();

    }
}
