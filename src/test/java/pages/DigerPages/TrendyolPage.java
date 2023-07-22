package pages.DigerPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TrendyolPage {
    public TrendyolPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[@data-testid='suggestion']")
    public WebElement aramaKutusu;

    @FindBy (xpath = "//div[@class='dscrptn']")
    public WebElement aramaSonuctext;

    @FindBy (xpath = "//*[@data-testid='search-icon']")
    public WebElement aramaIconu;






}
