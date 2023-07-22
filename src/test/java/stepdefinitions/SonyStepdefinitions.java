package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.DigerPages.SonyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class SonyStepdefinitions {

    SonyPage sonyPage=new SonyPage();
    Actions actions=new Actions(Driver.getDriver());


    @Given("Kullanici {string} sayfasina gider")
    public void kullanici_sayfasina_gider(String Url) {
        Driver.getDriver().get(ConfigReader.getProperty(Url));
    }
    @Then("cerezleri kabul etmez")
    public void cerezleri_kabul_etmez() {
        sonyPage.cerezlerRed.click();
    }

    @Then("sayfanın Url'sinin {string} kelimesinin icerdigini test eder")
    public void sayfanın_url_sinin_kelimesinin_icerdigini_test_eder(String Sony) {
        String sayfaUrl="Sony Group Portal-Home";
        Assert.assertTrue(sayfaUrl.contains(Sony));

    }
    @Then("Businesses_ProductsButonuna tıklar")
    public void businesses_products_butonuna_tıklar() {

        sonyPage.Businesses_ProductsButonu.click();
    }
    @Then("acılan bolumlerden Muzık butonunu secer")
    public void acılan_bolumlerden_muzık_butonunu_secer() {
        sonyPage.muzikButonu.click();
    }
    @Then("ilgili okuma parcasina gider")
    public void ilgili_okuma_parcasina_gider() {
        ReusableMethods.bekle(2);
        actions.moveToElement(sonyPage.okumaBasligi).perform();

    }
    @Then("sayfanin {string} urunune gidip geri yukarı {string} urune gelir")
    public void sayfanin_urunune_gidip_geri_yukarı_urune_gelir(String alt, String ust) {

        actions.moveToElement(sonyPage.sayfaninalti).perform();
        ReusableMethods.bekle(2);
        actions.moveToElement(sonyPage.sayfaninUstu).perform();


    }


















}
