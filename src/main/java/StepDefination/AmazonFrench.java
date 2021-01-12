package StepDefination;

import Page.Factory.AmazonChangeLang;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonFrench {
    public AmazonChangeLang ele;
    public WebDriver driver;

    @Given("precondition launching amazon homepage1")
    public void amazon_precondition() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        ele = new AmazonChangeLang(driver);
        driver.get("https://www.amazon.ca/");
        ele.clickLanguage();
        Thread.sleep(2000);
        ele.clickbtnFrench();
        ele.clickOKLanguage();
        Thread.sleep(2000);
        String url = driver.getCurrentUrl();
        if (url.equals("https://www.amazon.ca/?language=fr_CA"))
            System.out.println("Test pass");
        else
            System.out.println("Test fail");
        throw new io.cucumber.java.PendingException();
    }

    @When("change language to french")
    public void Enter_amazon_id()  {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("validation language is french")
    public void validate_amazonLogin() {

        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
