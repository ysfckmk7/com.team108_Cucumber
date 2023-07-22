package pages.DigerPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EditorPage {

    public EditorPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }


    @FindBy(xpath = "//span[text()='New']")
    public WebElement NewKutusu;

    @FindBy(xpath = "//input[@id='DTE_Field_first_name']")
    public WebElement firstname;

    @FindBy(xpath = "//input[@id='DTE_Field_last_name']")
    public WebElement lastname;

    @FindBy(xpath = "//input[@id='DTE_Field_position']")
    public WebElement position;

    @FindBy(xpath = "//input[@id='DTE_Field_office']")
    public WebElement office;

    @FindBy(xpath = "//input[@id='DTE_Field_extn']")
    public WebElement extention;

    @FindBy(xpath = "//input[@id='DTE_Field_start_date']")
    public WebElement startdate;

    @FindBy(xpath = "//input[@id='DTE_Field_salary']")
    public WebElement salary;

    @FindBy(xpath = "//button[text()='Create']")
    public WebElement createTusu;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchTusu;

    @FindBy(xpath = "//td[@class='sorting_1']")
    public WebElement isimDogrulama;




}
