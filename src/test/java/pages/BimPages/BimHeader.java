package pages.BimPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BimHeader {
    public BimHeader(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[@class='btn btn-danger']")
    public WebElement bimCerezRed;

    @FindBy (xpath = "(//*[@class='textArea'])[1]")
    public WebElement aktuelUrunler;

    @FindBy (xpath = "(//*[@class='textArea'])[2]")
    public WebElement bimeOzel;

    @FindBy (xpath = "(//*[@class='textArea'])[3]")
    public WebElement afisler;

    @FindBy (xpath = "(//*[@class='textArea'])[4]")
    public WebElement tarifler;

    @FindBy (xpath = "(//*[@class='textArea'])[5]")
    public WebElement magazalar;

    @FindBy (xpath = "(//*[@class='textArea'])[6]")
    public WebElement iletisim;

    @FindBy (xpath = "//*[text()='BU HAFTA']")
    public WebElement actuelUrunlerBuHaftaButonu;

    @FindBy (xpath = "(//*[@class='product col-xl-3 col-lg-3 col-md-4 col-sm-6  col-12'])[6]")
    public WebElement setUstuOcakUrunu;

    @FindBy (xpath = "(//*[@class='rightSide col-md-6'])[1]")
    public WebElement setUstuOcakUrunText;

    @FindBy (xpath = "(//*[@ROLE='presentation'])[2]")
    public WebElement sagYonOku;

    @FindBy (xpath = "(//*[@ROLE='presentation'])[1]")
    public WebElement solYonOku;

    @FindBy (xpath = "(//*[@class='markArea'])[1]")
    public WebElement sayfaSonuButonu;

    @FindBy (xpath = "(//*[@class='col-3 col-lg-3 logoArea '])[1]")
    public WebElement headerBimLogosu;









}
