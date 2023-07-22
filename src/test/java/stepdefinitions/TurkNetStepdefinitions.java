package stepdefinitions;

import com.beust.ah.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.checkerframework.checker.units.qual.K;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.TurkNetPages.TurkNetPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class TurkNetStepdefinitions {
    Actions actions=new Actions(Driver.getDriver());
    TurkNetPage turkNetPage=new TurkNetPage();

    /*
     1- https://turk.net adresine gidin
     2- Üst menüden "Bireysel" kategorisi altından "Abone Ol"u seçin.
     3- "Kişisel Bilgiler" sekmesinde:
     a- E-postanın yanlış formatta girilmesi ve ilgili uyarı mesajının görüntülenip görüntülenmediğinin kontrol edilmesi ekranda
     b- Geçerli girişleri yaptıktan sonra "Devam Et" butonuna tıklayın

     4- "Adres Bilgileri" kısmı aşağıdaki ekran görüntüsündeki gibi doldurulur.
     5-"Tercihleriniz" sekmesinde :
     a- "Tek Fiyat" başlığı altındaki ücretin 139,90 ₺ olduğunu kontrol ediniz.
     b- "Ek Hizmet" seçim bölümünde "Modem","Statik IP Tekli(Bireysel)" ve
     "Her Yöne 1000 Dakika Ev Telefonu" seçenekleri görüntülenebilir ve tıklanabilir.

     6- "Fatura Tercihi" bölümünde "Değiştir" linkine tıklayın, seçenekler listesinden E-posta'yı seçin ve "Devam"a tıklayın düğme.
     7- "Telefon numarasını doğrulama" açılır penceresinin görünüp görünmediğini kontrol edin.
     */

    @Then("Üst menüden {string} kategorisi altından \"Abone Ol\"u seçin.")
    public void üst_menüden_kategorisi_altından_abone_ol_u_seçin(String string) {
        turkNetPage.aboneOlButonu.click();
        turkNetPage.cerezKullaniyorumAnladimButonu.click();
    }
    @Then("{string} sekmesinde:")
    public void sekmesinde(String KişiselBilgiler) {

    }
    @Then("E-postanın yanlış formatta girilmesi ve ilgili uyarı mesajının görüntülenip görüntülenmediğinin kontrol edilmesi ekranda")
    public void e_postanın_yanlış_formatta_girilmesi_ve_ilgili_uyarı_mesajının_görüntülenip_görüntülenmediğinin_kontrol_edilmesi_ekranda() {

        turkNetPage.adSoyad.click();
        actions.sendKeys("ronaldo")
                        .sendKeys(Keys.TAB)
                        .sendKeys("asdf")
                        .sendKeys(Keys.TAB)
                        .sendKeys("5555555555").perform();
        turkNetPage.kisiselVeriBox.click();
        turkNetPage.okudumAnladimButonu.click();
        turkNetPage.devamButonu.click();
        Assert.assertTrue(turkNetPage.gecerliEpostaAdresiGirinizText.isDisplayed());
    }
    @Then("Geçerli girişleri yaptıktan sonra {string} butonuna tıklayın")
    public void geçerli_girişleri_yaptıktan_sonra_butonuna_tıklayın(String string) {
        turkNetPage.adSoyad.click();
        actions.sendKeys("ronaldo")
                .sendKeys(Keys.TAB)
                .sendKeys("netabag814@eimatro.com")
                .sendKeys(Keys.TAB)
                .sendKeys("5555555559").perform();
        turkNetPage.devamButonu.click();

    }
    @Then("{string} kısmı aşağıdaki ekran görüntüsündeki gibi doldurulur.")
    public void kısmı_aşağıdaki_ekran_görüntüsündeki_gibi_doldurulur(String string) {
        turkNetPage.devamButonu.click();

    }
    @Then("{string} sekmesindeki:")
    public void sekmesindeki(String Tercihleriniz) {

        turkNetPage.adresBilgileriInternetYok.click();
        turkNetPage.adresBilgileriTelefonYok.click();

        turkNetPage.adresBilgileriIl.click();
        turkNetPage.istanbulButonu.click();

        turkNetPage.adresBilgileriIlce.click();
        turkNetPage.atasehirButonu.click();

        turkNetPage.adresBilgileriMahalle.click();
        turkNetPage.barbarosButonu.click();

        turkNetPage.adresBilgileriCadde_Sokak.click();
        turkNetPage.acelyaSokagiButonu.click();

        turkNetPage.adresBilgileriBina.click();
        turkNetPage.kapiNoButonu.click();

        turkNetPage.adresBilgileriDaire.click();
        turkNetPage.daireNoButonu.click();

        turkNetPage.devamButonu.click();
    }
    @Then("{string} başlığı altındaki ücretin {double} ₺ olduğunu kontrol ediniz.")
    public void başlığı_altındaki_ücretin_₺_olduğunu_kontrol_ediniz(String TekFiyat, Double fiyat) {

        ReusableMethods.bekle(2);
        actions.scrollToElement(turkNetPage.tekFiyatUcretText);
        String tekFiyat=turkNetPage.tekFiyatUcretText.getText();
        System.out.println(tekFiyat);
        Assert.assertEquals(tekFiyat,"₺249,90");
    }
    @Then("{string} seçim bölümünde {string},{string} ve")
    public void seçim_bölümünde_ve(String string, String string2, String string3) {

    }
    @Then("{string} seçenekleri görüntülenebilir ve tıklanabilir.")
    public void seçenekleri_görüntülenebilir_ve_tıklanabilir(String string) {

        Assert.assertTrue(turkNetPage.tercihStatikIpTekliText.isDisplayed());
        ReusableMethods.clickWithTimeOut(turkNetPage.tercihStatikTekliTextBox,3);
        Assert.assertTrue(turkNetPage.tercihEvTelefonuText.isDisplayed());
        ReusableMethods.clickWithTimeOut(turkNetPage.tercihEvTelefonuTextBox,3);

    }
    @Then("{string} bölümünde {string} linkine tıklayın, seçenekler listesinden E-posta'yı seçin ve \"Devam\"a tıklayın düğme.")
    public void bölümünde_linkine_tıklayın_seçenekler_listesinden_e_posta_yı_seçin_ve_devam_a_tıklayın_düğme(String string, String string2) {

        actions.scrollToElement(turkNetPage.devamButonu);
        turkNetPage.faturaTercihiDegistirButonu.click();
        turkNetPage.faturaTercihiOptions.click();
        turkNetPage.faturaTercihiEposta.click();
        turkNetPage.devamButonu.click();
    }
    @Then("{string} açılır penceresinin görünüp görünmediğini kontrol edin.")
    public void açılır_penceresinin_görünüp_görünmediğini_kontrol_edin(String string) {

        Assert.assertTrue(turkNetPage.telefonDogrulamaText.getText().contains("Telefon numarası doğrulama"));
    }



}
