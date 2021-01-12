package StepDefination;

import Page.Factory.PFAmazonLogin;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLogin {
    public PFAmazonLogin ele;
    public WebDriver driver;


    @Given("precondition launching amazon homepage")
    public void amazon_precondition(){
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        ele = new PFAmazonLogin(driver);
        driver.get("https://www.amazon.ca/");
    }

    @When("Enter amazon username and password")
    public void Enter_amazon_id(){
        ele.clickLoginPage();
        ele.enterUsernameAmazon("amazonUser@gmail.com");
        ele.click_continueAmazon();
        ele.enter_passwordAmazon("12345678");
        ele.enter_loginbtn();

    }

    @Then("validation amazon that i am login")
    public void validate_amazonLogin() {
        String url = driver.getCurrentUrl();
        System.out.println(url);
        throw new io.cucumber.java.PendingException();
    }
}
