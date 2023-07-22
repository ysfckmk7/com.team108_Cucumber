package pages.ColinsPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ColinsOutlet {
    public ColinsOutlet(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "(//*[text()='Çorap'])[4]")
    public WebElement corapUrunu;

    @FindBy (xpath = "//*[text()='CİNSİYET']")
    public WebElement cinsiyetButonu;

    @FindBy (xpath = "(//*[text()='Erkek'])[5]")
    public WebElement cinsiyetErkekButonu;

    @FindBy (xpath = "(//*[text()='Kategori'])[1]")
    public WebElement kategoriButonu;

    @FindBy (xpath = "(//*[text()='Çorap'])[9]")
    public WebElement kategoriCorapButonu;

    @FindBy (xpath = "(//*[text()='Renk'])[1]")
    public WebElement renkButonu;

    @FindBy (xpath = "(//*[text()='Siyah'])[1]")
    public WebElement renkSiyahButonu;

    @FindBy (xpath = "(//*[text()='Beden'])[1]")
    public WebElement bedenButonu;

    @FindBy (xpath = "(//*[text()='Fit'])[1]")
    public WebElement fitButonu;

    @FindBy (xpath = "(//*[text()='FİYAT'])[1]")
    public WebElement fiyatButonu;

    @FindBy (xpath = "(//*[@class='product-detail-product-name text-center text-lg-left p-2 p-lg-0'])[1]")
    public WebElement secilenUrununTexti;

    @FindBy(xpath = "(//*[text()='Beden Tablosu'])[1]")
    public WebElement bedenTablosuButonu;

    @FindBy (xpath = "(//*[text()='ERKEK ÖLÇÜ TABLOSU'])[1]")
    public WebElement erkekOlcuTablosuButonu;

    @FindBy (xpath = "(//*[text()='PANTOLON ve CARGO'])[1]")
    public WebElement erkekOlcuTablosuPantolonveCargoButonu;

    @FindBy (xpath = "(//*[text()='54,25'])[2]")
    public WebElement kirkBelOlcusuButonu;

    @FindBy (xpath = "(//*[@class='close'])[2]")
    public WebElement bedenTablosuKapat;

    @FindBy (xpath = "(//*[@alt='Baskılı Siyah Erkek Çorap'])")
    public WebElement ucuncuUrunButonu;




}
