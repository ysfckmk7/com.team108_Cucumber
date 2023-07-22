package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.DigerPages.ToshibaPage;
import utilities.ReusableMethods;

public class ToshibaStepdefinitions {
    ToshibaPage toshibaPage=new ToshibaPage();

    @Then("anasayfadaki butonlarin tek tek uzerinden gecer")
    public void anasayfadaki_butonlarin_tek_tek_uzerinden_gecer() {
        toshibaPage.BusinessButonu.click();
        ReusableMethods.bekle(1);
        toshibaPage.HealthcareButonu.click();
        ReusableMethods.bekle(1);
        toshibaPage.IndustrialButonu.click();
        ReusableMethods.bekle(1);
        toshibaPage.Power_EnergyButonu.click();
        ReusableMethods.bekle(1);
        toshibaPage.RetailButonu.click();
        ReusableMethods.bekle(1);
        toshibaPage.SemiconductorsButonu.click();
        ReusableMethods.bekle(1);
        toshibaPage.SupportButonu.click();
    }
    @Then("business altbilgileri tıklar")
    public void businessAltbilgileriTıklar() {
        toshibaPage.BusinessButonu.click();
        ReusableMethods.bekle(1);
        toshibaPage.Businessaltbilgi1.click();
        ReusableMethods.bekle(1);
        toshibaPage.BusinessaltbilgiHomeButonu.click();
        ReusableMethods.bekle(1);
        toshibaPage.BusinessaltbilgiAbout_UsButonu.click();
        ReusableMethods.bekle(1);
        toshibaPage.BusinessaltbilgiProductsButonu.click();
        ReusableMethods.bekle(1);
        toshibaPage.BusinessaltbilgiContact_UsButonu.click();
    }
    @Then("Contact us kismindan iletisim numarasi-mail-adres bilgilerini ekrana yazdirir")
    public void contactUsKismindanIletisimNumarasiMailAdresBilgileriniEkranaYazdirir() {
    String tel=toshibaPage.iletisimNO.getText();
    String mail=toshibaPage.Mail.getText();
    String adres=toshibaPage.Adress.getText();
        System.out.println("TEL :" + tel);
        System.out.println("MAİL :" + mail);
        System.out.println("ADRESS :" + adres);
    }
    @And("toshiba logosuna tiklar ve anasayfaya geri doner")
    public void toshibaLogosunaTiklarVeAnasayfayaGeriDoner() {
        toshibaPage.toshibaLogosu.click();
    }


    @And("Tosbiha About butonuna tıklar ve bilgilere erisir")
    public void tosbihaAboutButonunaTıklarvebilgilereerisir() {
        toshibaPage.tosbihaAboutButonu.click();
        toshibaPage.tosbihaAboutButonuIcerik.click();
    }

    @And("Tosbiha ile ilgili bilgileri ekrana yazdirir")
    public void tosbihaIleIlgiliBilgileriEkranaYazdirir() {
        String clip=toshibaPage.tosbihaClipYazisi.getText();
        String muze=toshibaPage.tosbihaMuzeYazisi.getText();

        System.out.println("Tosbiha Clip : " + clip);
        System.out.println("Tosbiha Bilim Muzesi : " + muze);

    }
}
