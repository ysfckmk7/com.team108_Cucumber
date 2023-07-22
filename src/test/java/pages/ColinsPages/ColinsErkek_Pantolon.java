package pages.ColinsPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ColinsErkek_Pantolon {
    public ColinsErkek_Pantolon(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "(//*[text()='Pantolon'])[2]")
    public WebElement pantolonButonu;

    @FindBy (xpath = "(//*[@class='product-image-container productImage custom-swiper-slide'])[3]")
    public WebElement ucuncuUrun;

    @FindBy (xpath = "//*[@id='tabitem1']")
    public WebElement urunAciklamasi;

    @FindBy (xpath = "//*[@id='tabitem2']")
    public WebElement urunTanimi;

    @FindBy (xpath = "//*[@id='addtocartbutton']")
    public WebElement sepeteEkleButonu;

    @FindBy (xpath = "//*[@selected='selected']")
    public WebElement bedenOlcusu;

    @FindBy (xpath = "//*[@class='size-select-list border p-3 w-100']")
    public WebElement bedenOlcuSecenegi;

    @FindBy (xpath = "//*[@class='cart-link-container']")
    public WebElement sepetimButonu;

    @FindBy (xpath = "//*[@class='cart-attr-list-item mb-0 mb-md-2']")
    public WebElement sepeticiText;











}
