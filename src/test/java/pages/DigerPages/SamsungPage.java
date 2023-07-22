package pages.DigerPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SamsungPage {
    public SamsungPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[text()=' Kabul ']")
    public WebElement cerezleriKabulEt;

    @FindBy (xpath = "//*[@class='nv00-gnb__utility-btn gnb__search-btn-js']")
    public WebElement aramaLogosu;

    @FindBy (xpath = "//input[@id='gnb-search-keyword']")
    public WebElement aramaKutusu;

    @FindBy (xpath = "//*[text()='Akıllı Telefonlar']")
    public WebElement aramasonuctext;

    @FindBy (xpath = "(//*[@class='image__main responsive-img image--loaded'])[2]")
    public WebElement ilkUrun;

    @FindBy (xpath = "(//*[text()='Galaxy A32'])[3]")
    public WebElement aramasonuctextmodel;

    @FindBy (xpath = "(//label[@class='pd-option-selector__label'])[3]")
    public WebElement maviTelefonsecimi;

    @FindBy (xpath = "//input[@id='js-input-search']")
    public WebElement aramaSonucElementi;



}
