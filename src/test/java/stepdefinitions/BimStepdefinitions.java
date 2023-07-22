package stepdefinitions;

import com.beust.ah.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;
import pages.BimPages.BimHeader;
import utilities.Driver;
import utilities.ReusableMethods;

public class BimStepdefinitions {
    BimHeader bimHeader = new BimHeader();
    Actions actions=new Actions(Driver.getDriver());

    @Then("cerezler red edilir")
    public void cerezlerRedEdilir() {
        bimHeader.bimCerezRed.click();
    }
    @Then("header butonlari tıklayarak geri donus yapılır")
    public void headerbutonlaritıklayarakgeridonusyapılır() {

        bimHeader.aktuelUrunler.click();
        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(2);

        bimHeader.bimeOzel.click();
        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(2);

        bimHeader.afisler.click();
        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(2);

        bimHeader.aktuelUrunler.click();
        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(2);

        bimHeader.tarifler.click();
        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(2);

        bimHeader.magazalar.click();
        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(2);

        bimHeader.iletisim.click();
        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(2);
    }
    @Given("anasayfanin bu haftanin aktuel urunlerine tıklar")
    public void anasayfanin_bu_haftanin_aktuel_urunlerine_tıklar() {
        bimHeader.aktuelUrunler.click();
    }
    @Then("sayfayi asagiya indirerek Kumtel Cam Set Üstü Ocak urunu secilir")
    public void sayfayi_asagiya_indirerek_kumtel_cam_set_üstü_ocak_urunu_secilir() {
        actions.scrollToElement(bimHeader.setUstuOcakUrunu).perform();
        ReusableMethods.bekle(2);
        actions.click(bimHeader.setUstuOcakUrunu).perform();
    }
    @Then("urun bilgileri ekrana yazdirilir")
    public void urun_bilgileri_ekrana_yazdirilir() {
        String urunBilgileri=bimHeader.setUstuOcakUrunText.getText();
        System.out.println(urunBilgileri);
    }


    @Then("anasayfadaki karsimiza cikan urunleri yana kaydir")
    public void anasayfadakiKarsimizaCikanUrunleriYanaKaydir() {
        bimHeader.sagYonOku.click();
        ReusableMethods.bekle(2);
        bimHeader.sagYonOku.click();
        ReusableMethods.bekle(2);
        bimHeader.solYonOku.click();
        ReusableMethods.bekle(2);
        bimHeader.solYonOku.click();
    }

    @Then("anasaydan iken yavasca sayfayi asagiya dogru kaydir sonra tekrar yukari dogru kaydir")
    public void anasaydanIkenYavascaSayfayiAsagiyaDogruKaydirSonraTekrarYukariDogruKaydir() {
        actions.scrollToElement(bimHeader.sayfaSonuButonu).perform();
        ReusableMethods.bekle(2);
        actions.scrollToElement(bimHeader.actuelUrunlerBuHaftaButonu).perform();

    }
}
