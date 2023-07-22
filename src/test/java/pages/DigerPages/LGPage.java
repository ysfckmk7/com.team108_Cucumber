package pages.DigerPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LGPage {
    public LGPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//button[@class='btn btn-primary btn-sm accept-all']")
    public WebElement cerezlerinKabulu;

    @FindBy (xpath = "//*[text()='TV']")
    public WebElement tvButonu;

    @FindBy (xpath = "//*[text()='SES']")
    public WebElement sesButonu;

    @FindBy (xpath = "//*[text()='Beyaz Eşya']")
    public WebElement beyazesyaButonu;

    @FindBy (xpath = "//*[text()='Klima/Isıtma']")
    public WebElement Klima_IsıtmaButonu;

    @FindBy (xpath = "//*[text()='MONİTÖR']")
    public WebElement MONİTÖRButonu;


    @FindBy (xpath = "//*[text()='Projektör']")
    public WebElement ProjektörButonu;

    @FindBy (xpath = "//*[text()='LG BRANDSHOP']")
    public WebElement LG_BRANDSHOPButonu;

    @FindBy (xpath = "//*[text()='DESTEK']")
    public WebElement DESTEKButonu;

    @FindBy (xpath = "//*[@data-link-name='search']")
    public WebElement aramaLogosu;

    @FindBy (xpath = "//input[@id='useInputKeyword']")
    public WebElement aramaKutusu;

    @FindBy (xpath = "//*[@data-internal-tab-search='product']")
    public WebElement arananUrunler;

    @FindBy (xpath = "//*[@id='wa_search_PLP_1']")
    public WebElement ikinciUrun;

    @FindBy (xpath = "(//*[@class='model-title'])[2]")
    public WebElement ikinciUrununIsmi;

    @FindBy (xpath = "//*[@data-link-name='spec']")
    public WebElement IkinciUrunOzellikleri;

    @FindBy (xpath = "(//div[@class='tech-spacs-title'])[3]")
    public WebElement IkinciUrunEkranOzellikleri;

    @FindBy (xpath = "(//ul/li/dl/dd)[9]")
    public WebElement IkinciUrunCozunurlukOranı;

    @FindBy (xpath = "//*[@class='logo']")
    public WebElement lgLogosu;




}
