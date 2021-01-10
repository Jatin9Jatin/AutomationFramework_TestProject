package StepDefination;

import Page.Factory.Login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Definations {


    public Login abc;




    @Given("precondition landing on facebook webpage")
    public void precondition_landing_on_facebook_webpage() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        abc = new Login(driver);
        driver.manage().window().fullscreen();;
        driver.get("https://www.facebook.com/");
        abc.EnterEmail("");
        abc.EnterPasword("");
        Thread.sleep(2000);
        abc.ClickLogin();
        String def = abc.login_error();
        if (def.contains("doesn’t match"))
            System.out.println("test pass");
        else
            System.out.println("test fail");
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("Enter username and password")
    public void enter_username_and_password() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("validation that i am login")
    public void validation_that_i_am_logein() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
