package Page.Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AmazonLogin {
    public AmazonLogin(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.ID, using = "nav-link-accountList")
    WebElement loginPage;
    @FindBy(how = How.NAME, using = "email")
    WebElement usernameAmazon;
    @FindBy(how = How.ID, using = "continue")
    WebElement btncontinueAmazon;
    @FindBy(how = How.NAME, using = "password")
    WebElement tbpassword;
    @FindBy(how = How.ID, using = "auth-signin-button")
    WebElement btnloginAmazon;


    public void clickLoginPage() { loginPage.click();}
    public void enterUsernameAmazon(String abc) {usernameAmazon.sendKeys(abc);}
    public void click_continueAmazon() {btncontinueAmazon.click();}
    public void enter_passwordAmazon(String abc) {tbpassword.sendKeys(abc);}
    public void enter_loginbtn(){btnloginAmazon.click();}

}
