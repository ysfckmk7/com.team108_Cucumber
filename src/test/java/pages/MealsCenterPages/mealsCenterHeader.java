package pages.MealsCenterPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class mealsCenterHeader {
    public mealsCenterHeader(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[@class='form-control form-control-text']")
    public WebElement aramaKutusuHome;

    @FindBy (xpath = "//*[@class='text-center mb-3']")
    public WebElement girisYazisiHome;

    @FindBy (xpath = "//*[@class='ssm-toggle-navx']")
    public WebElement cartHome;

    @FindBy (xpath = "(//*[@class='cart-empty text-center'])[1]")
    public WebElement CartHomeIcerik;

    @FindBy (xpath = "//*[@class='d-inline pr-2']")
    public WebElement sepetHome;

    @FindBy (xpath = "//*[@class='d-none d-lg-inline line-left']")
    public WebElement sing_inHome;

    @FindBy (xpath = "(//*[@class='col cuisineMainPage'])[1]")
    public WebElement americanButonuHome;

    @FindBy (xpath = "(//*[@class='col cuisineMainPage'])[2]")
    public WebElement mediterraneanButonuHome;

    @FindBy (xpath = "(//*[@class='col cuisineMainPage'])[3]")
    public WebElement sandwichesButonuHome;

    @FindBy (xpath = "(//*[@class='col cuisineMainPage'])[4]")
    public WebElement italianButonuHome;

    @FindBy (xpath = "(//*[@class='col cuisineMainPage'])[5]")
    public WebElement mexicanButonuHome;

    @FindBy (xpath = "(//*[@class='col cuisineMainPage'])[6]")
    public WebElement burgersButonuHome;

    @FindBy (xpath = "(//*[@class='col cuisineMainPage'])[7]")
    public WebElement japaneseButonuHome;

    @FindBy (xpath = "//*[text()='Thai']")
    public WebElement thaiButonuHome;

    @FindBy (xpath = "(//*[@class='col'])[1]")
    public WebElement moreButonuHome;

    @FindBy (xpath = "(//*[@class='p-2 pl-2 d-block'])[1]")
    public WebElement moreButonuHome_Chinese;

    @FindBy (xpath = "(//*[@class='p-2 pl-2 d-block'])[2]")
    public WebElement moreButonuHome_Kosher;

    @FindBy (xpath = "(//*[@class='p-2 pl-2 d-block'])[3]")
    public WebElement moreButonuHome_Halal;

    @FindBy (xpath = "(//*[@class='p-2 pl-2 d-block'])[4]")
    public WebElement moreButonuHome_Vegetarian;








}
