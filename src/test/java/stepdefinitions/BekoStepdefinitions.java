package stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.DigerPages.BekoPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import java.util.Set;
public class BekoStepdefinitions {
    String whdilksayfa="";
    String whdikincisayfa = "";
    BekoPage bekoPage=new BekoPage();
    @Given("Kullanici Beko anasayfaya gider")
    public void kullanici_beko_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("bekoUrl"));
        whdilksayfa = Driver.getDriver().getWindowHandle();
        ReusableMethods.bekle(2);
    }
    @Then("Cerezler kabul edilmez")
    public void cerezlerKabulEdilmez() {
        ReusableMethods.bekle(2);
        bekoPage.cerezleriKabulEtme.click();


    }
    @Then("Kullanıcı avrupa kıtasını secer ve turkıye ulkesını secer")
    public void kullanıcı_avrupa_kıtasını_secer_ve_turkıye_ulkesını_secer() {
        bekoPage.avrupaUlkesilogosu.click();
        bekoPage.turkiyeButonu.click();

        whdikincisayfa = "";
        Set<String> butunWhd = Driver.getDriver().getWindowHandles();
        for (String each : butunWhd) {
            whdikincisayfa = each;
            if (!each.equals(whdilksayfa)){
                whdikincisayfa=each;
            }
        }
    }
    @Then("cerezler kabul edilmez ikinci sayfa")
    public void cerezlerKabulEdilmezIkinciSayfa() {
        Driver.getDriver().switchTo().window(whdikincisayfa);
        bekoPage.CerezleriKabulEtmeikinciSayfa.click();
    }
    @Then("Anasayfada arama kutusuna tıklar {string} aratır")
    public void anasayfadaAramaKutusunaTıklarAratır(String arananKelime) {
        bekoPage.aramaKutusu1.click();
        bekoPage.aramaKutusu2.click();
        bekoPage.aramaKutusu2.sendKeys(arananKelime,Keys.ENTER);
    }
    @And("Arama sonuclarının {string} yazıldıgını test eder")
    public void aramaSonuclarınınYazıldıgınıTestEder(String arananKelime) {
        String sonucText=bekoPage.aramaSonucYazisi.getText();
        Assert.assertTrue(sonucText.contains(arananKelime));
    }

    @Then("Sayfayı kapatır")
    public void sayfayı_kapatır() {
        Driver.closeDriver();
    }


}
