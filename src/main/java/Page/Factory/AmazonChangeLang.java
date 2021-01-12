package Page.Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AmazonChangeLang {
    public AmazonChangeLang(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.ID, using = "icp-touch-link-language")
    WebElement btnLanguage;
    @FindBy(how = How.XPATH, using = "/html/body/div[3]/div/div/div[1]/form/div/div/div/div/div[1]/div[2]/div/label/i")
    WebElement btnFrench;
    @FindBy(how = How.XPATH, using = "/html/body/div[3]/div/div/div[2]/span[2]/span/span/input")
    WebElement btnSelectLang;


    public void clickLanguage() { btnLanguage.click();}
    public void clickbtnFrench(){btnFrench.click();}
    public void clickOKLanguage() {btnSelectLang.click();}

}
