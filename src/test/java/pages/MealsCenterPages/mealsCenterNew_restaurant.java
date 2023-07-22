package pages.MealsCenterPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class mealsCenterNew_restaurant {
    public mealsCenterNew_restaurant(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//*[@class='owl-item active'])[6]")
    public WebElement NewRestaurantSeattle_KosherRestaurantMekani;

    @FindBy (xpath = "(//*[@class='owl-item active'])[7]")
    public WebElement NewRestaurantSeattle_SichuaneseCuisineMekani;

    @FindBy (xpath = "(//*[@class='owl-item active'])[8]")
    public WebElement NewRestaurantSeattle_UmiSakeHouseMekani;

    @FindBy (xpath = "(//*[@class='owl-item active'])[9]")
    public WebElement NewRestaurantSeattle_LapalmeraMekani;

    @FindBy (xpath = "(//*[@class='owl-item active'])[10]")
    public WebElement NewRestaurantSeattle_HumblePieMekani;


    @FindBy (xpath = "(//*[@class='owl-item active'])[6]")
    public WebElement NewRestaurantSeattle_7ElevenMekani;

    @FindBy (xpath = "(//*[@class='owl-item active'])[7]")
    public WebElement NewRestaurantSeattle_BurgerKingMekani;

    @FindBy (xpath = "(//*[@class='owl-item active'])[8]")
    public WebElement NewRestaurantSeattle_VeganSeasonMekani;

    @FindBy (xpath = "(//*[@class='owl-item active'])[9]")
    public WebElement NewRestaurantSeattle_ASPAVAMekani;

    @FindBy (xpath = "(//*[@class='owl-item active'])[10]")
    public WebElement NewRestaurantSeattle_KavurmacıNecoMekani;


}
