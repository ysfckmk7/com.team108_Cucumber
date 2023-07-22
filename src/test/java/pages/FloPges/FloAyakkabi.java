package pages.FloPges;

import io.cucumber.java.en.Then;
import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class FloAyakkabi {
    public FloAyakkabi(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "//*[@alt='FLO']")
    public WebElement floLOgoButonu;

    @FindBy (xpath = "(//*[@class='listing__categories-collapse-icon js-category-collapse-icon'])[1]")
    public WebElement Kategori_Ayakkabi;

    @FindBy (xpath = "(//*[@class='listing__categories-collapse-icon js-category-collapse-icon'])[2]")
    public WebElement Kategori_GunlukAyakkabi;

    @FindBy (xpath = "(//*[@title='Rahat Ayakkabı'])")
    public WebElement Kategori_GunlukAyakkabi_RahatAyakkabi;

    @FindBy (xpath = "(//*[@class='listing__categories-collapse-icon js-category-collapse-icon'])[3]")
    public WebElement Kategori_Bot;

    @FindBy (xpath = "(//*[@class='listing__categories-collapse-icon js-category-collapse-icon'])[4]")
    public WebElement Kategori_Sandalet;

    @FindBy (xpath = "(//*[@class='listing__categories-collapse-icon js-category-collapse-icon'])[5]")
    public WebElement Kategori_TopukluAyakkabi;

    @FindBy (xpath = "(//*[@class='listing__categories-collapse-icon js-category-collapse-icon'])[6]")
    public WebElement Kategori_Terlik;

    @FindBy (xpath = "(//*[@class='listing__categories-collapse-icon js-category-collapse-icon'])[7]")
    public WebElement Kategori_Sneaker;

    @FindBy (xpath = "(//*[@class='listing__categories-collapse-icon js-category-collapse-icon'])[8]")
    public WebElement Kategori_EvAyakkabisi;

    @FindBy (xpath = "(//*[@class='listing__categories-collapse-icon js-category-collapse-icon'])[9]")
    public WebElement Kategori_OutDoorAyakkabi;

    @FindBy (xpath = "(//*[@class='listing__categories-collapse-icon js-category-collapse-icon'])[10]")
    public WebElement Kategori_SporAyakkabi;

    @FindBy (xpath = "(//*[@class='listing__categories-collapse-icon js-category-collapse-icon'])[11]")
    public WebElement Kategori_Cizme;

    @FindBy (xpath = "(//*[@class='listing__categories-collapse-icon js-category-collapse-icon'])[12]")
    public WebElement Kategori_AyakkabiBakim;

    @FindBy (xpath = "(//*[@class='checkbox listing__filter-item js-listing-filter-item '])[1]")
    public WebElement CinsiyetKadin;

    @FindBy (xpath = "(//*[@class='checkbox listing__filter-item js-listing-filter-item '])[2]")
    public WebElement CinsiyetErkekCocuk;

    @FindBy (xpath = "(//*[@class='checkbox listing__filter-item js-listing-filter-item '])[3]")
    public WebElement CinsiyetKizCocuk;

    @FindBy (xpath = "(//*[@class='checkbox listing__filter-item js-listing-filter-item '])[4]")
    public WebElement CinsiyetUnisex;

    @FindBy (xpath = "(//*[@class='checkbox listing__filter-item js-listing-filter-item '])[5]")
    public WebElement CinsiyetUnisexCocuk;
    @FindBy (xpath = "(//*[@class='listing__filter-title js-listing-filter-detail-toggle js-back-btn-trigger'])[3]")
    public WebElement bedenButonu;

    @FindBy (xpath = "//*[@class='js-listing-filter-search']")
    public WebElement bedenAramaKutusu;

    @FindBy (xpath = "(//*[@class='listing__filter-list js-listing-filter-list '])")
    public List<WebElement> bedenButonuListesi;

    @FindBy (xpath = "(//*[text()='42'])[2]")
    public WebElement bedenButonuKirkikiNumara;

    @FindBy (xpath = "(//*[@class='listing__filter-title js-listing-filter-detail-toggle js-back-btn-trigger'])[4]")
    public WebElement markaButonu;

    @FindBy (xpath = "(//*[text()='Polaris'])[6]")
    public WebElement markaPolarisButonu;

    @FindBy (xpath = "(//*[@class=' lazyloaded'])[2]")
    public WebElement PolarisIlkUrun;

    @FindBy (xpath ="//*[@class='product d-flex flex-column align-items-start']")
    public WebElement PolarisIlkUrunText;

    @FindBy (xpath = "//*[@class='btn btn-green detail__add2cart add-to-cart']")
    public WebElement sepeteEkleButonu;

    @FindBy (xpath = "//*[@class='header__minibasket-icon']")
    public WebElement sepetimButonu;

    @FindBy (xpath = "//*[@class='primary-color generic-total']")
    public WebElement secilenUrununFiyati;

    @FindBy (xpath = "//*[@class='vl-boxes-close']")
    public WebElement surprizHediyeAlert;

    public WebElement istenenUrunElementi(int index){

        String dinamikXpath = "(//*[@data-type='F2'])["+(index+2)+"]";
        WebElement istenenUrun=Driver.getDriver().findElement(By.xpath(dinamikXpath));

        return istenenUrun;
    }
    @FindBy (xpath = "//*[@class='product d-flex flex-column align-items-start']")
    public WebElement istenenUrunText;
}
