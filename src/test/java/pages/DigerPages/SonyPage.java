package pages.DigerPages;

import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SonyPage {
    public SonyPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//button[@id='onetrust-reject-all-handler']")
    public WebElement cerezlerRed;

    @FindBy (xpath = "//a[@class='tmpl-headerNavItem_label']")
    public WebElement Businesses_ProductsButonu;

    @FindBy (xpath = "//a[@data-analytics-name='Music']")
    public WebElement muzikButonu;

    @FindBy (xpath = "(//div[@class='title'])[5]")
    public WebElement okumaBasligi;

    @FindBy (xpath = "//a[@class='copyright extInfo']")
    public WebElement sayfaninalti;

    @FindBy (xpath = "//*[@alt='Sony']")
    public WebElement sayfaninUstu;








}
