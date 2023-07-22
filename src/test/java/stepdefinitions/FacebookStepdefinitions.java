package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;

import pages.DigerPages.FacebookPage;
import utilities.ReusableMethods;

public class FacebookStepdefinitions {
    FacebookPage facebookPage=new FacebookPage();
    @Then("facebook anasayfadan username olarak examples dan {string}  girer")
    public void facebook_anasayfadan_username_olarak_examples_dan_girer(String mail) {
        facebookPage.emailButonu.sendKeys(mail);
        ReusableMethods.bekle(1);
    }
    @Then("facebook anasayfadan password olarak examples dan {string}  girer")
    public void facebookAnasayfadanPasswordOlarakExamplesDanGirer(String password) {
        facebookPage.passwordButonu.sendKeys(password);
        ReusableMethods.bekle(1);
    }
    @Then("Login butonuna tıklar")
    public void Login() {
        facebookPage.loginButonu.click();
        ReusableMethods.bekle(2);
        if (facebookPage.hesapDogrulamaBilgisi.isDisplayed()){
            facebookPage.hesapDogrulamaKapat.click();
        }

    }
    @Then("giris yapılamadıgını test eder")
    public void giris_yapılamadıgını_test_eder() {
        String basarisizYazisi=facebookPage.basarisizSonucText.getText();
        Assert.assertTrue(basarisizYazisi.contains("Forgotten password"));
    }



}
