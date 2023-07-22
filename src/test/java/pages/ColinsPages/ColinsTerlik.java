package pages.ColinsPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ColinsTerlik {
    public ColinsTerlik(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "(//*[text()='Terlik'])[4]")
    public WebElement terlikUrunu;

    @FindBy (xpath = "//*[text()='Renk']")
    public WebElement renkButonu;

    @FindBy (xpath = "//*[text()='Beden']")
    public WebElement bedenButonu;

    @FindBy (xpath = "//*[text()='43']")
    public WebElement kirkucNumaraButonu;

    @FindBy (xpath = "//*[text()='Mavi']")
    public WebElement maviRenkButonu;

    @FindBy (xpath = "//*[@alt='Mavi Erkek Terlik']")
    public WebElement tekUrunKalanMaviErkekTerlikUrunu;

    @FindBy (xpath = "//*[@class='product-detail-price float-left mr-md-3']")
    public WebElement siyahTerlikFiyati;

    @FindBy (xpath = "//*[@class=' p-color-value pull-left']")
    public WebElement siyahTerlikUrunu;

    @FindBy (xpath = "//*[@class='size-select-list border p-3 w-100']")
    public WebElement siyahTerlikOlcuButonu;

    @FindBy (xpath = "//*[@selected='selected']")
    public WebElement kirkBirNumaraButonu;

    @FindBy (xpath = "//*[text()='SEPETE EKLE']")
    public WebElement sepeteEkleButonu;






}
