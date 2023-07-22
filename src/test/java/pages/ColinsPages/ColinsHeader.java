package pages.ColinsPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ColinsHeader {

    public ColinsHeader(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[@class='cookie-close position-absolute']")
    public WebElement cereziKapat;

    @FindBy (xpath = "//*[@data-label='Logo']")
    public WebElement ColinsLogoHome;

    @FindBy (xpath = "(//*[@onmouseout='menuElementclose(this)'])[1]")
    public WebElement JeanButonu;

    @FindBy (xpath = "(//*[@onmouseout='menuElementclose(this)'])[2]")
    public WebElement KadinButonu;

    @FindBy (xpath = "(//*[@onmouseout='menuElementclose(this)'])[3]")
    public WebElement ErkekButonu;

    @FindBy (xpath = "//*[text()='Outlet']")
    public WebElement OutletButonu;

    @FindBy (xpath = "(//*[@onmouseout='menuElementclose(this)'])[5]")
    public WebElement DenimonButonu;

    @FindBy (xpath = "//*[text()='Puan Sorgula']")
    public WebElement PuanSorgulamaButonu;

    @FindBy (xpath = "//*[@id='TxtSearchBox']")
    public WebElement aramaKutusu;

    @FindBy (xpath = "//*[@alt='user-icon']")
    public WebElement hesapButonu;

    @FindBy (xpath = "//*[@class='cart-link-container']")
    public WebElement sepetimButonu;

    @FindBy (xpath = "//*[@class='selected-lang']")
    public WebElement dilSecimi;

















}
