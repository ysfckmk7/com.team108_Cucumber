package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.DigerPages.SamsungPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class SamsungStepdefinitions {

    SamsungPage samsungPage=new SamsungPage();

    @Given("kullanici samsung anasayfaya gider")
    public void kullanici_samsung_anasayfaya_gider() {
        Driver.getDriver().get("https://www.samsung.com/");
    }
    @Then("cerezleriKabulEder")
    public void cerezleri_Kabul_eder() {

        samsungPage.cerezleriKabulEt.click();
        ReusableMethods.bekle(3);

    }
    @Then("aramalogosunu tıklar")
    public void aramalogosunu_tıklar() {
        samsungPage.aramaLogosu.click();
    }
    @Then("aramakutusunanda samsung A32 cihazini aratir")
    public void aramakutusunanda_samsung_a32_cihazini_aratir() {
        samsungPage.aramaKutusu.sendKeys("samsung A32",Keys.ENTER);

    }
    @Then("arama sonucunun Akıllı Telefonlar icerdigini test eder")
    public void arama_sonucunun_AkıllıTelefonlar_icerdigini_test_eder() {

        String akıllıTelefon=samsungPage.aramasonuctext.getText();
        Assert.assertTrue(akıllıTelefon.contains("Akıllı Telefonlar"));

    }
    @Then("ilk urune tıklar")
    public void ilk_urune_tıklar() {

        samsungPage.ilkUrun.click();
    }
    @Then("arama sonucunun Galaxy A32 icerdigini test eder")
    public void arama_sonucunun_galaxy_A32_icerdigini_test_eder() {

        String model=samsungPage.aramasonuctextmodel.getText();
        Assert.assertTrue(model.contains("Galaxy A32"));
        ReusableMethods.bekle(2);

    }
    @Then("telefon rengini mavi olarak belirler")
    public void telefon_rengini_mavi_olarak_belirler() {
        samsungPage.maviTelefonsecimi.click();
    }


    @Then("samsung adresinde {string} icin arama yapar")
    public void samsungAdresindeIcinAramaYapar(String arananKelime) {
        samsungPage.aramaKutusu.sendKeys(arananKelime,Keys.ENTER);
    }

    @And("arama sonuclarinin {string} icerdigini test eder")
    public void aramaSonuclarininIcerdiginiTestEder(String arananKelime) {
        String sonucElementiText=samsungPage.aramaSonucElementi.getText();
        Assert.assertTrue(sonucElementiText.contains(arananKelime));
    }



}
