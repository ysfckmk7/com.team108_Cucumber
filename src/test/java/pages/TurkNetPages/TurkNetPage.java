package pages.TurkNetPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TurkNetPage {
    public TurkNetPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[@class='wisCloseIcon-231696']")
    public WebElement homeAlertKapat;

    @FindBy (xpath = "//*[@data-test-id='megaMenu-individual']")
    public WebElement bireyselButonu;

    @FindBy (xpath = "//*[@id='menu-item-5994']")
    public WebElement aboneOlButonu;

    @FindBy (xpath = "(//*[@class='sc-dIUggk kHVwCx'])[1]")
    public WebElement adSoyad;

    @FindBy (xpath = "(//*[@class='sc-dIUggk kHVwCx'])[2]")
    public WebElement ePosta;

    @FindBy (xpath = "(//*[@class='sc-dIUggk kHVwCx'])[3]")
    public WebElement gsmNo;

    @FindBy (xpath = "(//*[text()='Devam'])[1]")
    public WebElement devamButonu;

    @FindBy (xpath = "(//*[@type='checkbox'])[1]")
    public WebElement kisiselVeriBox;

    @FindBy (xpath = "(//*[text()='Okudum ve anladım'])[1]")
    public WebElement okudumAnladimButonu;

    @FindBy (xpath = "(//*[text()='Geçerli bir e-posta giriniz'])[1]")
    public WebElement gecerliEpostaAdresiGirinizText;

    @FindBy (xpath = "(//*[text()='Anladım'])[1]")
    public WebElement cerezKullaniyorumAnladimButonu;

    @FindBy (xpath = "(//*[@class='sc-hKgILt ePQFyU'])[1]")
    public WebElement adresBilgileriInternetVar;

    @FindBy (xpath = "(//*[@class='sc-hKgILt ePQFyU'])[2]")
    public WebElement adresBilgileriInternetYok;

    @FindBy (xpath = "(//*[@class='sc-hKgILt ePQFyU'])[3]")
    public WebElement adresBilgileriTelefonVar;

    @FindBy (xpath = "(//*[@class='sc-hKgILt ePQFyU'])[4]")
    public WebElement adresBilgileriTelefonYok;

    @FindBy (xpath = "(//*[@class='select__input-container css-ackcql'])[1]")
    public WebElement adresBilgileriIl;

    @FindBy (xpath = "(//*[@class='select__input-container css-ackcql'])[2]")
    public WebElement adresBilgileriIlce;

    @FindBy (xpath = "(//*[@class='select__input-container css-ackcql'])[3]")
    public WebElement adresBilgileriMahalle;

    @FindBy (xpath = "(//*[@class='select__input-container css-ackcql'])[4]")
    public WebElement adresBilgileriCadde_Sokak;

    @FindBy (xpath = "(//*[@class='select__input-container css-ackcql'])[5]")
    public WebElement adresBilgileriBina;

    @FindBy (xpath = "(//*[@class='select__input-container css-ackcql'])[6]")
    public WebElement adresBilgileriDaire;

    @FindBy (xpath = "//*[text()='İSTANBUL']")
    public WebElement istanbulButonu;

    @FindBy (xpath = "//*[text()='ATAŞEHİR']")
    public WebElement atasehirButonu;

    @FindBy (xpath = "//*[text()='BARBAROS']")
    public WebElement barbarosButonu;

    @FindBy (xpath = "//*[text()='AÇELYA SOKAGI']")
    public WebElement acelyaSokagiButonu;

    @FindBy (xpath = "//*[text()='NO :2 A_D2 1 BLOK']")
    public WebElement kapiNoButonu;

    @FindBy (xpath = "//*[text()='Ic Kapi(Daire) No :1']")
    public WebElement daireNoButonu;

    @FindBy (xpath = "//*[@data-test-id='funnel-suggestionPackage-text-campaignPrice']")
    public WebElement tekFiyatUcretText;

    @FindBy (xpath = "//*[@data-test-id='funnel-additionalServiceForm-checkbox-staticIP']")
    public WebElement tercihStatikIpTekliText;

    @FindBy (xpath = "(//*[@type='checkbox'])[1]")
    public WebElement tercihStatikTekliTextBox;

    @FindBy (xpath = "//*[@data-test-id='funnel-additionalServiceForm-checkbox-fixedPhone']")
    public WebElement tercihEvTelefonuText;

    @FindBy (xpath = "(//*[@type='checkbox'])[2]")
    public WebElement tercihEvTelefonuTextBox;

    @FindBy (xpath = "//*[@class='sc-hKgILt jYHCvB']")
    public WebElement faturaTercihiDegistirButonu;

    @FindBy (xpath = "//*[@class='select__control css-1s2u09g-control']")
    public WebElement faturaTercihiOptions;

    @FindBy (xpath = "//*[text()='E-Posta']")
    public WebElement faturaTercihiEposta;

    @FindBy (xpath = "//*[@class='sc-hKgILt cCpUId']")
    public WebElement telefonDogrulamaText;

















}
