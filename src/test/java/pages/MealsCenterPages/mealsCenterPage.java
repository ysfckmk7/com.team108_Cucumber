package pages.MealsCenterPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class mealsCenterPage {
    public mealsCenterPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='el-button el-button--default is-round w-100']")
    public WebElement cerezRedButonuHome;

    @FindBy (xpath = "//*[@class='top-logo']")
    public WebElement mealsCenterLogoHome;

    @FindBy (xpath = "(//*[@class='btn btn-link readButton'])[1]")
    public WebElement DiscoverHealthyFoodText;

    @FindBy (xpath = "(//*[@class='btn btn-link readButton'])[2]")
    public WebElement MealsCenterforYourHealthyText;

    @FindBy (xpath = "(//*[@class='btn btn-link readButton'])[3]")
    public WebElement HowtoEatText;

    @FindBy (xpath = "(//*[@class='btn btn-link readButton'])[4]")
    public WebElement DiscovertheBestText;


    @FindBy (xpath = "(//*[@class='btn btn-link w25'])[1]")
    public WebElement joinButonuHome;

    @FindBy (xpath = "(//*[@class='owl-carousel-nav next'])[1]")
    public WebElement PopularNearbySeattle_SagYonTusu;












































}
