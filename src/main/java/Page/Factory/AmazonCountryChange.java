package Page.Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AmazonCountryChange {
    public AmazonCountryChange(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[5]/div[3]/span[2]/div/a[2]")
    WebElement btnCountry;
    @FindBy(how = How.XPATH, using = "/html/body/div[3]/div/div/div[1]/form/div/div/div/div/div[1]/div[2]/span/span/span/span")
    WebElement btnCurrentCountry;
    @FindBy(how = How.ID, using = "icp-selected-country_6")
    WebElement btnIndia;
    @FindBy(how = How.XPATH, using = "/html/body/div[3]/div/div/div[2]/span[2]/span/span")
    WebElement btnSelect;


    public void click_btnCountry()
    {
        btnCountry.click();
    }
    public void click_btnCurrentCountry()
    {
        btnCurrentCountry.click();
    }
    public void click_btnIndia(){btnIndia.click();}
    public void click_btnSelect(){btnSelect.click();}


}
