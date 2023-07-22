package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.DigerPages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.GridBase;

public class GridStepDefinitions extends GridBase {

    AmazonPage amazonPage=new AmazonPage();

    WebDriver driver;

    @Before
    public void gridDriver(){
        driver=setDriver(driver);
    }

    @Given("kullanici Amazon anasayfaya gider")
    public void kullanici_amazon_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

    }
    @Then("arama kutusuna Nutella yazar ve enter tusuna basar")
    public void arama_kutusuna_nutella_yazar_ve_enter_tusuna_basar() {
        amazonPage.aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
    }
    @Then("arama sonuclarinin Nutella icerdigini test eder")
    public void arama_sonuclarinin_nutella_icerdigini_test_eder() {
        String expectedIcerik="Nutella";
        String actualAramaSonucYazisi= amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucYazisi.contains(expectedIcerik));
    }
    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }


}
