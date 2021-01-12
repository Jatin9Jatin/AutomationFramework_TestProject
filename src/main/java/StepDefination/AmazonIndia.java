package StepDefination;


import Page.Factory.AmazonCountryChange;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonIndia {
    public AmazonCountryChange ele;
    public WebDriver driver;

    @Given("precondition launching amazon homepage2")
    public void amazon_precondition() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        ele = new AmazonCountryChange(driver);
        driver.get("https://www.amazon.ca/");
        ele.click_btnCountry();
        Thread.sleep(1000);
        ele.click_btnCurrentCountry();
        Thread.sleep(1000);
        ele.click_btnIndia();
        ele.click_btnSelect();

        String url = driver.getCurrentUrl();
        System.out.println(url);
        if (url.equals("https://www.amazon.ca/?language=fr_CA"))
            System.out.println("Test pass");
        else
            System.out.println("Test fail");
        throw new io.cucumber.java.PendingException();
    }

    @When("change country to India")
    public void Enter_amazon_id()  {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("validation country is India")
    public void validate_amazonLogin() {

        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
