package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.DigerPages.LGPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class LGStepdefinitions {
    LGPage lgPage=new LGPage();
    Actions actions=new Actions(Driver.getDriver());

    @Then("cerezleri Kabul Eder")
    public void cerezleri_kabul_eder() {
        lgPage.cerezlerinKabulu.click();
    }
    @Then("tv butonun uzerıne gelir")
    public void tv_butonun_uzerıne_gelir() {
        ReusableMethods.bekle(1);
        actions.moveToElement(lgPage.tvButonu).perform();
    }
    @Then("ses butonun uzerıne gelir")
    public void ses_butonun_uzerıne_gelir() {
        ReusableMethods.bekle(1);
        actions.moveToElement(lgPage.sesButonu).perform();
    }
    @Then("beyaz eşya butonun uzerıne gelir")
    public void beyaz_eşya_butonun_uzerıne_gelir() {
        ReusableMethods.bekle(1);
        actions.moveToElement(lgPage.beyazesyaButonu).perform();
    }
    @Then("klima_isitma butonun uzerıne gelir")
    public void klima_isitma_butonun_uzerıne_gelir() {
        ReusableMethods.bekle(1);
        actions.moveToElement(lgPage.Klima_IsıtmaButonu).perform();
    }
    @Then("monitor butonun uzerıne gelir")
    public void monitor_butonun_uzerıne_gelir() {
        ReusableMethods.bekle(1);
        actions.moveToElement(lgPage.MONİTÖRButonu).perform();
    }
    @Then("projektor butonun uzerıne gelir")
    public void projektor_butonun_uzerıne_gelir() {
        ReusableMethods.bekle(1);
        actions.moveToElement(lgPage.ProjektörButonu).perform();
    }
    @Then("lg brandshop butonun uzerıne gelir")
    public void lg_brandshop_butonun_uzerıne_gelir() {
        ReusableMethods.bekle(1);
        actions.moveToElement(lgPage.LG_BRANDSHOPButonu).perform();
    }
    @Then("destek brandshop butonun uzerıne gelir")
    public void destek_brandshop_butonun_uzerıne_gelir() {
        ReusableMethods.bekle(1);
        actions.moveToElement(lgPage.DESTEKButonu).perform();
    }
    @Then("arama butonuna tıklar")
    public void arama_butonuna_tıklar() {
        ReusableMethods.bekle(1);
        lgPage.aramaLogosu.click();
        lgPage.aramaLogosu.click();
    }


    @Then("arama kutusuna leptop yazar ve enter tusuna basar")
    public void aramaKutusunaLeptopYazarVeEnterTusunaBasar() {
        ReusableMethods.bekle(2);
        lgPage.aramaKutusu.sendKeys("Bilgisayar", Keys.ENTER);
    }

    @Then("listede cıkan urunler butonuna tıklar")
    public void listedeCıkanUrunlerButonunaTıklar() {
        lgPage.arananUrunler.click();
    }
    @And("ikinci urunu secer")
    public void ikinciUrunuSecer() {
        lgPage.ikinciUrun.click();
    }


    @And("secilen urunun isminde {string} icerdigini test eder")
    public void secilenUrununIsmindeIcerdiginiTestEder(String arananKelime) {
        String arananKelimeText=lgPage.ikinciUrununIsmi.getText();
        Assert.assertTrue(arananKelimeText.contains(arananKelime));
    }


    @And("ikinci urunun ozellıkleri kontrol eder")
    public void ikinciUrununOzellıkleriKontrolEder() {
        lgPage.IkinciUrunOzellikleri.click();
    }

    @And("ikici urunun ekran ozelliklerinden cozunurluk oranını ekrana yazdırır")
    public void ikiciUrununEkranOzelliklerindenCozunurlukOranınıEkranaYazdırır() {
        String cozunurluk=lgPage.IkinciUrunCozunurlukOranı.getText();
        System.out.println("cozunurluk orani : " + cozunurluk);
    }

    @And("anasayfaya doner")
    public void anasayfayaDoner() {
        actions.moveToElement(lgPage.ikinciUrununIsmi).perform();
        lgPage.lgLogosu.click();
    }
}
