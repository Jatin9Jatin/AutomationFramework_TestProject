package Page.Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Login {
    public Login(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.ID, using = "email")
    WebElement email;
    @FindBy(how = How.ID, using = "pass")
    WebElement password;
    @FindBy(how = How.ID, using = "u_0_b")
    WebElement btnlogin;
    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div[1]/div/div[2]/div[2]/form/div/div[1]/div[2]")
    WebElement l_error;

    public void EnterEmail(String abc)
    {
        email.sendKeys(abc);
    }

    public void EnterPasword(String qwe)
    {
        password.sendKeys(qwe);
    }

    public void ClickLogin()
    {
        btnlogin.click();
    }

    public String login_error() {
           String cc = l_error.getText();
           return cc;
    }
}
