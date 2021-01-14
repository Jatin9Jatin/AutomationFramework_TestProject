package Page.Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;



public class SearchingAmazonDot {
    public SearchingAmazonDot(WebDriver driver){
        PageFactory.initElements(driver ,this);
    }

    @FindBy(how = How.ID, using = "nav-logo-sprites")
    WebElement btnImgAmazonLogo;
    @FindBy(how = How.ID, using = "nav-hamburger-menu")
    WebElement btnAllMenu;
    @FindBy(how = How.XPATH, using = "/html/body/div[3]/div[2]/div/ul[1]/li[7]/a")
    WebElement btnMenu1;
    @FindBy(how = How.XPATH, using = "/html/body/div[3]/div[2]/div/ul[2]/li[8]/a")
    WebElement btnMenu2;

    public void clickAmazonLogo(){ btnImgAmazonLogo.click(); }
    public void clickAllMenu(){ btnAllMenu.click();}
    public void clickMenu1(){ btnMenu1.click();}
    public void clickMenu2(){ btnMenu2.click();}

}
