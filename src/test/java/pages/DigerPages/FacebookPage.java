package pages.DigerPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookPage {
    public FacebookPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[@id='email']")
    public WebElement emailButonu;

    @FindBy (xpath = "//*[@id='pass']")
    public WebElement passwordButonu;

    @FindBy (xpath = "//*[@name='login']")
    public WebElement loginButonu;

    @FindBy (xpath = "//*[text()='Forgotten password?']")
    public WebElement basarisizSonucText;

    @FindBy (xpath = "(//*[@type='submit'])[2]")
    public WebElement hesapDogrulamaKapat;

    @FindBy (xpath = "//*[@class='_9kpn']")
    public WebElement hesapDogrulamaBilgisi;

}
