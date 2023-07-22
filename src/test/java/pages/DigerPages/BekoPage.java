package pages.DigerPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BekoPage {
    public BekoPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[text()='Reject All']")
    public WebElement cerezleriKabulEtme;

    @FindBy (xpath = "//*[text()='Europe']")
    public WebElement avrupaUlkesilogosu;

    @FindBy (xpath = "(//*[text()=' Turkey'])[2]")
    public WebElement turkiyeButonu;

    @FindBy (xpath = "//*[text()='Tüm Çerezleri Reddet']")
    public WebElement CerezleriKabulEtmeikinciSayfa;

    @FindBy (xpath = "//div[@class='placeholder']")
    public WebElement aramaKutusu1;

    @FindBy (xpath = "//button[@class='icon-holder btn-search-post d js_search_button']")
    public WebElement aramaIconu;

    @FindBy (xpath = "//input[@id='searchText']")
    public WebElement aramaKutusu2;

    @FindBy (xpath = "//h1[@class='title']")
    public WebElement aramaSonucYazisi;






}
