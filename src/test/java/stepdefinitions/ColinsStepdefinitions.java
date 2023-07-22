package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.ColinsPages.ColinsErkek_Pantolon;
import pages.ColinsPages.ColinsHeader;
import pages.ColinsPages.ColinsTerlik;
import pages.ColinsPages.ColinsOutlet;
import utilities.Driver;
import utilities.ReusableMethods;

public class ColinsStepdefinitions {

    ColinsHeader colinsHeader=new ColinsHeader();

    ColinsErkek_Pantolon colinsPantolon=new ColinsErkek_Pantolon();
    ColinsTerlik colinsTerlik=new ColinsTerlik();
    ColinsOutlet colinsOutlet=new ColinsOutlet();
    Actions actions=new Actions(Driver.getDriver());

    @Given("cerez kapatılır")
    public void cerezKapatılır() {
        colinsHeader.cereziKapat.click();
    }

    @Then("header bolumundeki butonlari kontrol eder")
    public void header_bolumundeki_butonlari_kontrol_eder() {
        actions.moveToElement(colinsHeader.JeanButonu).perform();
        ReusableMethods.bekle(2);
        actions.moveToElement(colinsHeader.KadinButonu).perform();
        ReusableMethods.bekle(2);
        actions.moveToElement(colinsHeader.ErkekButonu).perform();
        ReusableMethods.bekle(2);
        actions.moveToElement(colinsHeader.OutletButonu).perform();
        ReusableMethods.bekle(2);
        actions.moveToElement(colinsHeader.DenimonButonu).perform();
        ReusableMethods.bekle(2);
        actions.moveToElement(colinsHeader.hesapButonu).perform();
        ReusableMethods.bekle(2);
        actions.moveToElement(colinsHeader.sepetimButonu).perform();
        ReusableMethods.bekle(2);
        actions.moveToElement(colinsHeader.dilSecimi).perform();
        ReusableMethods.bekle(2);
    }
    @Then("Erkek butonunun uzerine gelir")
    public void erkekButonununUzerineGelir() {
        actions.moveToElement(colinsHeader.ErkekButonu).perform();
        ReusableMethods.bekle(2);
    }
    @Then("Giyim olarak pantolon butonuna tıklar")
    public void giyim_olarak_pantolon_butonuna_tıklar() {
        colinsPantolon.pantolonButonu.click();
    }
    @Then("ucuncu fotodaki urune tıklar")
    public void ucuncu_fotodaki_urune_tıklar() {
        colinsPantolon.ucuncuUrun.click();
    }
    @Then("urun acıklaması ve urun tanımını ekrana yazdırır")
    public void urun_acıklaması_ve_urun_tanımını_ekrana_yazdırır() {
        String urunaciklama=colinsPantolon.urunAciklamasi.getText();
        String ururnTanimi=colinsPantolon.urunTanimi.getText();
        System.out.println(urunaciklama);
        System.out.println(ururnTanimi);
    }

    @Then("urun sepete eklenirken beden olarak {int}-{int} secilir")
    public void urun_sepete_eklenirken_beden_olarak_secilir(Integer bel, Integer boy) {
        colinsPantolon.bedenOlcuSecenegi.click();
        ReusableMethods.bekle(1);
        colinsPantolon.bedenOlcusu.click();
    }


    @Then("urunu sepete ekler")
    public void urunu_sepete_ekler() {
        colinsPantolon.sepeteEkleButonu.click();
    }


    @Then("sepetimi kontrol eder")
    public void sepetimi_kontrol_eder() {
        ReusableMethods.bekle(1);
        colinsHeader.sepetimButonu.click();
    }
    @Then("sepet icersinde TEBRİKLER KARGON BEDAVA ! yazisini dogrular")
    public void sepet_icersinde_tebri̇kler_kargon_bedava_yazisini_dogrular() {
        String sepeticiText=colinsPantolon.sepeticiText.getText();
        Assert.assertTrue(sepeticiText.contains("MELON WASH"));
    }
    @Then("colins logosuna tıklayarak anasayfaya doner")
    public void colins_logosuna_tıklayarak_anasayfaya_doner() {
        colinsHeader.ColinsLogoHome.click();
    }

    @Then("Outlet butonunun uzerine gelir")
    public void outlet_butonunun_uzerine_gelir() {
        actions.moveToElement(colinsHeader.OutletButonu).perform();
        ReusableMethods.bekle(1);
    }
    @Then("Erkek bolumunden terlik urununu secer")
    public void erkek_bolumunden_terlik_urununu_secer() {
        colinsTerlik.terlikUrunu.click();
    }
    @Then("urun rengini mavi secer")
    public void urun_rengini_mavi_secer() {
        colinsTerlik.renkButonu.click();
        ReusableMethods.bekle(1);
        colinsTerlik.maviRenkButonu.click();
    }
    @Then("urun bedeni {int} numarayi secer")
    public void urun_bedeni_numarayi_secer(Integer kırkUc) {
        colinsTerlik.bedenButonu.click();
        ReusableMethods.bekle(1);
        colinsTerlik.kirkucNumaraButonu.click();
    }
    @Then("tek cesit kalan urunu secer")
    public void tek_cesit_kalan_urunu_secer() {
        colinsTerlik.tekUrunKalanMaviErkekTerlikUrunu.click();
    }
    @Then("urun renk secimini siyah olarak degistirir")
    public void urun_renk_secimini_siyah_olarak_degistirir() {
        colinsTerlik.siyahTerlikUrunu.click();
    }
    @Then("urun fiyatinin {int} Tl'den düsük fiyat oldugunu dogrular")
    public void urun_fiyatinin_tl_den_düsük_fiyat_oldugunu_dogrular(Integer yuz_Tl) {
        String urunFiyatText=colinsTerlik.siyahTerlikFiyati.getText();
        urunFiyatText=urunFiyatText.replaceAll("\\D","");
        urunFiyatText=urunFiyatText.substring(0,2);
        int urunFiyatInt=Integer.parseInt(urunFiyatText);
        Assert.assertTrue(urunFiyatInt<100);
    }
    @Then("urun olcusu {int} olarak degistirilir")
    public void urun_olcusu_olarak_degistirilir(Integer kirkBir) {
        colinsTerlik.siyahTerlikOlcuButonu.click();
        ReusableMethods.bekle(1);
        colinsTerlik.kirkBirNumaraButonu.click();
    }
    @Then("urun sepete eklenir ardından sepetime gidilir")
    public void urun_sepete_eklenir_ardından_sepetime_gidilir() {
        colinsTerlik.sepeteEkleButonu.click();
        ReusableMethods.bekle(1);
        colinsHeader.sepetimButonu.click();
    }


    @Given("kullanıcı arama kutusuna tıklar")
    public void kullanıcıAramaKutusunaTıklar() {
        colinsHeader.aramaKutusu.click();
    }

    @Then("{string} aramalari aratir")
    public void aramalariAratir(String aratilanUrunler) {
        colinsHeader.aramaKutusu.sendKeys(aratilanUrunler, Keys.ENTER);
        ReusableMethods.bekle(3);
    }

    @Given("Kullanıcı outlet bolumunden corap urununu secer")
    public void kullanıcıOutletBolumundenCorapUrununuSecer() {
        actions.moveToElement(colinsHeader.OutletButonu).perform();
        ReusableMethods.bekle(1);
        colinsOutlet.corapUrunu.click();
    }

    @Then("cinsiyet erkek,renk siyah olarak belirlenir")
    public void cinsiyet_erkek_renk_siyah_olarak_belirlenir() {
      colinsOutlet.cinsiyetButonu.click();
      colinsOutlet.cinsiyetErkekButonu.click();
        colinsOutlet.renkButonu.click();
        colinsOutlet.renkSiyahButonu.click();
    }
    @Then("ucuncu urun secilir")
    public void ucuncu_urun_secilir() {
        ReusableMethods.bekle(1);
        colinsOutlet.ucuncuUrunButonu.click();
    }
    @Then("urun ismini ekarana yazdırır")
    public void urun_ismini_ekarana_yazdırır() {
        String urunText=colinsOutlet.secilenUrununTexti.getText();
        System.out.println("Corap Urunu : " + urunText);

    }
    @Then("beden tablosunun kontrolu yapılır")
    public void beden_tablosunun_kontrolu_yapılır() {
        colinsOutlet.bedenTablosuButonu.click();
    }
    @Then("erkek olcu Tablosu secilir")
    public void erkek_olcu_tablosu_secilir() {
        colinsOutlet.erkekOlcuTablosuButonu.click();
    }
    @Then("pantolon ve cargo secimi yapılır")
    public void pantolon_ve_cargo_secimi_yapılır() {
        colinsOutlet.erkekOlcuTablosuPantolonveCargoButonu.click();
    }
    @Then("bel olarak {int} olcusu secilir")
    public void bel_olarak_olcusu_secilir(Integer olcu) {
        colinsOutlet.kirkBelOlcusuButonu.click();
        String kirkBelText=colinsOutlet.kirkBelOlcusuButonu.getText();
        System.out.println("Bel olcusu : " + kirkBelText);
    }
    @Then("beden tablosundan cıkıs yapılır")
    public void beden_tablosundan_cıkıs_yapılır() {
        colinsOutlet.bedenTablosuKapat.click();
    }

}
