package pages.FloPges;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Floheader {
    public Floheader(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "(//*[@class=' ls-is-cached lazyloaded'])")
    public WebElement FloLogoButonuHome;

    @FindBy (xpath = "//*[@id='pw-sac-desktop']")
    public WebElement aramaKutusu;

    @FindBy (xpath = "(//*[@class='d-none d-lg-inline-block'])[4]")
    public WebElement sepetimButonu;

    @FindBy (xpath = "(//*[@class='navigation__item-title'])[1]")
    public WebElement KadinButonu;

    @FindBy (xpath = "(//*[@class='navigation__item-title'])[2]")
    public WebElement ErkekButonu;

    @FindBy (xpath = "(//*[@class='navigation__item-title'])[3]")
    public WebElement CocukButonu;

    @FindBy (xpath = "(//*[@class='navigation__item-title'])[15]")
    public WebElement AyakkabiButonu;

    @FindBy (xpath = "(//*[@class='navigation__item-title'])[16]")
    public WebElement SporButonu;

    @FindBy (xpath = "(//*[@class='navigation__item-title'])[17]")
    public WebElement GiyimButonu;

    @FindBy (xpath = "(//*[@class='navigation__item-title'])[18]")
    public WebElement CantaveAksesuarButonu;

    @FindBy (xpath = "(//*[@class='navigation__item-title'])[19]")
    public WebElement MarkalarButonu;

    @FindBy (xpath = "(//*[@class='navigation__item-title'])[20]")
    public WebElement IndirimButonu;

    @FindBy (xpath = "(//*[@class='navigation__item-title'])[21]")
    public WebElement TumKategorilerButonu;

    @FindBy (xpath = "(//*[@class='form-control js-commerce-sort-order'])")
    public WebElement urunOneriKutucugu;

    @FindBy (xpath = "//*[@class='easy-add-to-cart']")
    public WebElement hizliSepeteEkleText;


}
