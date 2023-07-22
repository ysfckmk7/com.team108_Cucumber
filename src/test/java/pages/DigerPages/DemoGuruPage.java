package pages.DigerPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class DemoGuruPage {

    public DemoGuruPage() {


        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//tr/td[1]")
    public List<WebElement> company;


    @FindBy(xpath = "//tr/td[3]")
    public List<WebElement> istenensirket;

    @FindBy(xpath = "//tr[3]/td[3]")
    public List<WebElement> satirsutun;










}
