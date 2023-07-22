package pages.DigerPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ToshibaPage {
    public ToshibaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "(//div[@class='hov'])[7]")
    public WebElement BusinessButonu;

    @FindBy (xpath = "(//div[@class='hov'])[6]")
    public WebElement HealthcareButonu;

    @FindBy (xpath = "(//div[@class='hov'])[5]")
    public WebElement SupportButonu;

    @FindBy (xpath = "(//div[@class='hov'])[4]")
    public WebElement IndustrialButonu;

    @FindBy (xpath = "(//div[@class='hov'])[3]")
    public WebElement Power_EnergyButonu;

    @FindBy (xpath = "(//div[@class='hov'])[2]")
    public WebElement RetailButonu;

    @FindBy (xpath = "(//div[@class='hov'])[1]")
    public WebElement SemiconductorsButonu;

    @FindBy (xpath = "(//*[text()='Automotive Lighting'])[2]")
    public WebElement Businessaltbilgi1;

    @FindBy (xpath = "//*[text()='Home']")
    public WebElement BusinessaltbilgiHomeButonu;

    @FindBy (xpath = "//*[text()='About Us']")
    public WebElement BusinessaltbilgiAbout_UsButonu;

    @FindBy (xpath = "//*[text()='Products']")
    public WebElement BusinessaltbilgiProductsButonu;

    @FindBy (xpath = "(//*[text()='Contact Us'])[3]")
    public WebElement BusinessaltbilgiContact_UsButonu;

    @FindBy (xpath = "(//*[@class='pl100'])[1]")
    public WebElement iletisimNO;

    @FindBy (xpath = "(//*[@class='pl100'])[1]")
    public WebElement Mail;

    @FindBy (xpath = "(//*[@class='pl100'])[1]")
    public WebElement Adress;

    @FindBy (xpath = "//*[@id='logoImg']")
    public WebElement toshibaLogosu;

    @FindBy (xpath = "(//*[@class='menu-item child'])[2]")
    public WebElement tosbihaAboutButonu;

    @FindBy (xpath = "(//*[@class='popup-child-item top '])[2]")
    public WebElement tosbihaAboutButonuIcerik;

    @FindBy (xpath = "(//div[@class='cmp-rectanglelink__content'])[10]")
    public WebElement tosbihaClipYazisi;

    @FindBy (xpath = "(//div[@class='cmp-rectanglelink__content'])[11]")
    public WebElement tosbihaMuzeYazisi;

}
