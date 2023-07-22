package pages.MealsCenterPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class mealsCenterPopular_nearby {
    public mealsCenterPopular_nearby(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//*[text()='McDonalds'])[1]")
    public WebElement PopularNearbySeattle_McDonaldsMekani;

    @FindBy (xpath = "(//*[@class='owl-item active'])[2]")
    public WebElement PopularNearbySeattle_BaiTongThaiStreetCafeMekani;

    @FindBy (xpath = "(//*[@class='owl-item active'])[3]")
    public WebElement PopularNearbySeattle_SubwayMekani;

    @FindBy (xpath = "(//*[@class='owl-item active'])[4]")
    public WebElement PopularNearbySeattle_KosherRestaurantMekani;

    @FindBy (xpath = "(//*[@class='owl-item active'])[5]")
    public WebElement PopularNearbySeattle_SichuaneseCuisineMekani;


    @FindBy (xpath = "(//*[@class='owl-item active'])[1]")
    public WebElement PopularNearbySeattle_UmiSakeHouseMekani;

    @FindBy (xpath = "(//*[@class='owl-item active'])[1]")
    public WebElement PopularNearbySeattle_LapalmeraMekani;

    @FindBy (xpath = "(//*[@class='owl-item active'])[1]")
    public WebElement PopularNearbySeattle_HumblePieMekani;

    @FindBy (xpath = "(//*[@class='owl-item active'])[1]")
    public WebElement PopularNearbySeattle_7ElevenMekani;

    @FindBy (xpath = "(//*[@class='owl-item active'])[1]")
    public WebElement PopularNearbySeattle_StarbucksMekani;






}
