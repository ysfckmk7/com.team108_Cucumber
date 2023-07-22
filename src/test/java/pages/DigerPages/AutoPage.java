package pages.DigerPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AutoPage {

    public AutoPage() {


        PageFactory.initElements(Driver.getDriver(), this);


    }
    @FindBy(xpath = "//i[@class='fa fa-lock']")
    public WebElement singupLoginLink;
    @FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement singupname;
    @FindBy(xpath = "(//input[@placeholder='Email Address'])[2]")
    public WebElement singupemail;
    @FindBy(xpath = "//button[@data-qa='signup-button']")
    public WebElement singupButonu;

    @FindBy(xpath = "//input[@type='radio']")
    public WebElement title;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement password;

    @FindBy(xpath = "//select[@id='days']")
    public WebElement day;

    @FindBy(xpath = "//select[@id='months']")
    public WebElement months;

    @FindBy(xpath = "//select[@id='years']")
    public WebElement years;

    @FindBy(xpath = "//input[@id='first_name']")
    public WebElement firstname;

    @FindBy(xpath = "//input[@id='last_name']")
    public WebElement lastname;

    @FindBy(xpath = "//input[@id='company']")
    public WebElement company;

    @FindBy(xpath = "//input[@id='address1']")
    public WebElement address1;

    @FindBy(xpath = "//input[@id='address2']")
    public WebElement address2;

    @FindBy(xpath = "//select[@id='country']")
    public WebElement country;

    @FindBy(xpath = "//input[@id='state']")
    public WebElement state;

    @FindBy(xpath = "//input[@id='city']")
    public WebElement city;

    @FindBy(xpath = "//input[@id='zipcode']")
    public WebElement zipcode;

    @FindBy(xpath = "//input[@id='mobile_number']")
    public WebElement mobilenumber;

    @FindBy(xpath = "(//button[@class='btn btn-default'])[1]")
    public WebElement creataccount;

    @FindBy(xpath = "//h2[text()='Subscription']")
    public WebElement reklam;

    @FindBy(xpath = "//a[text()='Continue']")
    public WebElement continuee;

    @FindBy(xpath = "//b[text()='Account Created!']")
    public WebElement hesapOlustu;

}
