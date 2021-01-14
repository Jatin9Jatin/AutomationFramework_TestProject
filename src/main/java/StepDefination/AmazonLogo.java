package StepDefination;

import Page.Factory.SearchingAmazonDot;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AmazonLogo {
    public SearchingAmazonDot ele;
    public WebDriver driver;


    @Given("precondition launching amazon homepage3")
    public void amazon_precondition() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        ele = new SearchingAmazonDot(driver);
        driver.get("https://www.amazon.ca/");
        ele.clickAllMenu();
        Thread.sleep(2000);
        ele.clickMenu1();
        ele.clickMenu2();
        ele.clickAmazonLogo();

        String url = driver.getCurrentUrl();
        System.out.println(url);
        if (url.equals("https://www.amazon.ca/ref=nav_logo"))
            System.out.println("Test pass");
        else
            System.out.println("Test fail");
        throw new io.cucumber.java.PendingException();

    }

    @When("Checking amazon clickable logo")
    public void Enter_amazon_id(){
        throw new io.cucumber.java.PendingException();
    }

    @Then("validation came back to homepage")
    public void validate_amazonLogin() {

        throw new io.cucumber.java.PendingException();
    }
}
