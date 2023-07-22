package pages.MealsCenterPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class mealsCenterFooter {
    public mealsCenterFooter(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='top-logo']")
    public WebElement mealsCenterLogoHome;

    @FindBy(xpath = "//*[text()='Contact us']")
    public WebElement MealsCenterCorp_Contact_us;

    @FindBy(xpath = "(//*[@class='position-relative '])[1]")
    public WebElement MealsCenterCorp_Termsand_conditions;

    @FindBy(xpath = "(//*[@class='position-relative '])[1]")
    public WebElement MealsCenterCorp_Privacy_policy;

    @FindBy(xpath = "(//*[@class='position-relative '])[1]")
    public WebElement Business_Become_a_Partner;

    @FindBy(xpath = "(//*[@class='position-relative '])[1]")
    public WebElement Blog_DiscovertheBestVegetarian;

    @FindBy(xpath = "(//*[@class='position-relative '])[1]")
    public WebElement Blog_HowtoEatHealthy;

    @FindBy(xpath = "(//*[@class='position-relative '])[1]")
    public WebElement Blog_TheBenefitsofUsing;

    @FindBy(xpath = "(//*[@class='position-relative '])[1]")
    public WebElement Blog_DiscoverHealthyFood;

   @FindBy (xpath = "(//*[@class='facebook'])[1]")
    public WebElement facebookButonu;

    @FindBy (xpath = "(//*[@class='instagram'])[1]")
    public WebElement instagramButonu;

    @FindBy (xpath = "(//*[@class='linkedin'])[1]")
    public WebElement linkedinButonu;

    @FindBy (xpath = "(//*[@class='twitter'])[1]")
    public WebElement twitterButonu;

    @FindBy (xpath = "(//*[@class='youtube'])[1]")
    public WebElement youtubeButonu;

    @FindBy (xpath = "(//*[text()='mealscenter.com'])[1]")
    public WebElement mealCenterAdres;

    @FindBy (xpath = "//*[text()='Thank you for your interest in Meals Center. Please feel free to contact us if you have any questions, comments, or concerns.']")
    public WebElement Contact_usText;


















}
