package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en_old.Ac;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.FloPges.FloAyakkabi;
import pages.FloPges.Floheader;
import utilities.Driver;
import utilities.ReusableMethods;

public class FloStepdefinitions {
    Floheader floheader=new Floheader();

    FloAyakkabi floAyakkabi=new FloAyakkabi();

    Actions actions=new Actions(Driver.getDriver());

    @Then("kullanici header bolumunden Erkek butonuna tıklar")
    public void kullanici_header_bolumunden_erkek_butonuna_tıklar() {
       floheader.ErkekButonu.click();
    }
    @Then("kullanici header bolumunden Ayakkabi butonuna tıklar")
    public void kullanici_header_bolumunden_ayakkabi_butonuna_tıklar() {
        floheader.AyakkabiButonu.click();
        floAyakkabi.surprizHediyeAlert.click();
        floheader.hizliSepeteEkleText.click();
    }
    @Then("Kategori bolumunden Gunluk Ayakkabi urunlerini secer")
    public void kategori_bolumunden_gunluk_ayakkabi_urunlerini_secer() {
        floAyakkabi.Kategori_GunlukAyakkabi.click();

    }
    @Then("gunluk ayakkabi sekmesinden rahat ayakkabi secenegini tercih eder")
    public void gunluk_ayakkabi_sekmesinden_rahat_ayakkabi_secenegini_tercih_eder() {
        floAyakkabi.Kategori_GunlukAyakkabi_RahatAyakkabi.click();
    }
    @Then("Cinsiyet'e kadin olarak ekleme yapilir")
    public void cinsiyet_e_kadin_olarak_ekleme_yapilir() {
        ReusableMethods.bekle(2);


        actions.moveToElement(floAyakkabi.bedenButonu).perform();
        floAyakkabi.CinsiyetKadin.click();
    }
    @Then("beden olarak {int} numara secilir")
    public void bedenOlarakNumaraSecilir(int numara) {
        ReusableMethods.bekle(1);
        actions.moveToElement(floAyakkabi.markaButonu).perform();
        floAyakkabi.bedenAramaKutusu.sendKeys("42");
        ReusableMethods.bekle(1);
        floAyakkabi.bedenButonuKirkikiNumara.click();
    }
    @And("marka'yi Polaris olarak belirler")
    public void markaYiPolarisOlarakBelirler() {
        ReusableMethods.bekle(1);
        actions.moveToElement(floAyakkabi.markaButonu).perform();
        floAyakkabi.markaPolarisButonu.click();
    }

    @And("ilk urun secilir")
    public void ilkUrunSecilir() {
        ReusableMethods.bekle(2);
        floAyakkabi.PolarisIlkUrun.click();
    }

    @And("secilen urunun ismi console'a yazdirilir")
    public void secilenUrununIsmiConsoleAYazdirilir() {
        ReusableMethods.bekle(2);
        String urunText=floAyakkabi.PolarisIlkUrunText.getText();
        System.out.println("URUN BİLGİLERİ\n" + urunText);

    }
    @Then("urun sepete eklenir ve sepetime gidilir")
    public void urun_sepete_eklenir_ve_sepetime_gidilir() {
        floAyakkabi.sepeteEkleButonu.click();
        floAyakkabi.sepetimButonu.click();
    }
    @Then("urun fiyatinin {int} Tl'nin altinda oldugu dogrulanir")
    public void urun_fiyatinin_tl_nin_altinda_oldugu_dogrulanir(Integer BinTl) {
       String urunFiyatText=floAyakkabi.secilenUrununFiyati.getText();
       urunFiyatText=urunFiyatText.replaceAll("\\D","");
       urunFiyatText=urunFiyatText.substring(0,3);
        System.out.println(urunFiyatText);
       int urunIntText=Integer.parseInt(urunFiyatText);
        System.out.println(urunIntText);
        Assert.assertTrue(urunIntText<1000);
    }
    @Then("FloLogosuna tıklayarak anasayfaya donulur")
    public void flo_logosuna_tıklayarak_anasayfaya_donulur() {
        floAyakkabi.floLOgoButonu.click();
    }

    @Then("arama kutusuna {string} yazar ve aratir")
    public void aramaKutusunaYazarVeAratir(String istenenKelimeler) {
        floheader.aramaKutusu.click();
        ReusableMethods.bekle(3);
        floheader.aramaKutusu.sendKeys(istenenKelimeler, Keys.ENTER);
        ReusableMethods.bekle(3);

    }


    @Then("arama kutusuna tıklar")
    public void aramaKutusunaTıklar() {
        floheader.aramaKutusu.click();
        floheader.aramaKutusu.sendKeys("ayakkabi",Keys.ENTER);
        ReusableMethods.bekle(3);
    }

    @Then("kullanici ana ekranda {int} saniye bekler")
    public void kullanici_ana_ekranda_saniye_bekler(Integer saniye) {
        ReusableMethods.bekle(saniye);
    }
    @Then("kullanici arama kutusuna {string} yazar ve aratir")
    public void kullanici_arama_kutusuna_yazar_ve_aratir(String istenenUrun) {
       floheader.ErkekButonu.click();
       floheader.AyakkabiButonu.click();
       floheader.hizliSepeteEkleText.click();


    }

    @And("ekrana cikan urunlerin {int}. urunu secer")
    public void ekranaCikanUrunlerinUrunuSecer(int secilenUrun) {
       floAyakkabi.istenenUrunElementi(3).click();
    }
    @Then("urun bilgilerini ekrana yazdirir")
    public void urun_bilgilerini_ekrana_yazdirir() {

        String urunText=floAyakkabi.istenenUrunText.getText();
        System.out.println("URUN BİLGİLERİ\n"+urunText);
    }


}
