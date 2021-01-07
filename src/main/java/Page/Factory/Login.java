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

    public void EnterEmail(String abc)
    {
        email.sendKeys(abc);
    }

    public void EnterPasword(String qwe)
    {
        password.sendKeys(qwe);
    }

    public void ClickLogin(String qwe)
    {
        btnlogin.click();
    }
}
