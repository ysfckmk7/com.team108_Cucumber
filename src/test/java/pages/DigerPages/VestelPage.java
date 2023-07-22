package pages.DigerPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class VestelPage {
    public VestelPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//input[@id='txtbxArama']")
    public WebElement aramaKutusu;

    @FindBy (xpath = "(//a[@class='detailLink detailUrl'])[9]")
    public WebElement enalttakiUrun;

    @FindBy (xpath = "//div[@class='ProductName']")
    public WebElement urunKodu;

    @FindBy (xpath = "//span[@class='left_line teksatir']")
    public WebElement urunBilgileri;

    @FindBy (xpath = "//*[text()='MÜŞTERİ HİZMETLERİ']")
    public WebElement sayfaninEnalti;

    @FindBy (xpath = "//*[text()='Fırsat Ürünleri']")
    public WebElement sayfaninEnustu;

    @FindBy (xpath = "//*[@class='col-sm-2']")
    public WebElement vestelLogosu;

    @FindBy (xpath = "(//*[@title='BEYAZ EŞYA'])[2]")
    public WebElement beyazEsyaButonu;

    @FindBy (xpath = "(//*[@title='Şarap Soğutucu'])[2]")
    public WebElement sarapSogutucuButonu;

    @FindBy (xpath = "//*[@class='detailLink detailUrl']")
    public WebElement sarapSogutucuUrunu;

    @FindBy (xpath = "//*[@class='ProductName']")
    public WebElement sarapUrunuText;



}
