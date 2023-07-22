package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.DigerPages.VestelPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class VestelStepdefinitions {

    VestelPage vestelPage=new VestelPage();
    Actions actions=new Actions(Driver.getDriver());

    @Given("Kullanici vestel anasayfaya gider")
    public void kullanici_vestel_anasayfaya_gider() {
        Driver.getDriver().get("https://kktc.vestel.com/");
    }
    @Then("aramakutusuna tıklar")
    public void aramakutusuna_tıklar() {
        vestelPage.aramaKutusu.click();
    }
    @Then("aramakutunda TV aratir")
    public void aramakutunda_tv_aratir() {
        vestelPage.aramaKutusu.sendKeys("TV", Keys.ENTER);
    }
    @Then("sayfanini enaltindaki ürünü secer")
    public void sayfanini_enaltindaki_ürünü_secer() {
        actions.moveToElement(vestelPage.enalttakiUrun).click().perform();
    }
    @Then("acilan sayfadaki urunun 55U9700T kodlu ürün oldugunu test eder")
    public void acilan_sayfadaki_urunun_55u9700t_kodlu_ürün_oldugunu_test_eder() {
        String urunKoduText=vestelPage.urunKodu.getText();
        Assert.assertTrue(urunKoduText.contains("55U9700T"));
    }

    @And("urunun {int} inc  oldugunu test eder")
    public void urununIncOldugunuTestEder(int inc) {
        String urunBilgisiText=vestelPage.urunBilgileri.getText();
        Assert.assertTrue(urunBilgisiText.contains("55 İnç"));
    }

    @And("sayfayi asagıya dogru kaydırır sonra geri yukarı cıkar")
    public void sayfayiAsagıyaDogruKaydırırSonraGeriYukarıCıkar() {
        actions.moveToElement(vestelPage.sayfaninEnalti).perform();
        actions.moveToElement(vestelPage.sayfaninEnustu).perform();
    }
    @And("vestel logosuna tıklayarak anasayfaya geri doner")
    public void vestelLogosunaTıklayarakAnasayfayaGeriDoner() {
        vestelPage.vestelLogosu.click();
    }
    @Then("beyazesya urunun butonu üzerine gelir")
    public void beyazesya_urunun_butonu_üzerine_gelir() {
        ReusableMethods.bekle(2);
        actions.moveToElement(vestelPage.beyazEsyaButonu).perform();
    }
    @Then("şarap sogutucu urunune tıklar")
    public void şarap_sogutucu_urunune_tıklar() {
        vestelPage.sarapSogutucuButonu.click();

    }
    @Then("tek olan sogutucuyu secer")
    public void tek_olan_sogutucuyu_secer() {

        vestelPage.sarapSogutucuUrunu.click();
    }
    @Then("urun bilgilerinin Vestel VLP {int} kodlu urun oldugunu test eder")
    public void urun_bilgilerinin_vestel_vlp_kodlu_urun_oldugunu_test_eder(Integer urunKodu) {

        String sarapUrunBilgileri=vestelPage.sarapUrunuText.getText();
        Assert.assertTrue(sarapUrunBilgileri.contains("Vestel VLP 4000"));

    }






}
