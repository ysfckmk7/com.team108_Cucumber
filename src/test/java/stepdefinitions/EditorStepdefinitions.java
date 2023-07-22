package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.DigerPages.EditorPage;
import utilities.ConfigReader;
import utilities.Driver;

public class EditorStepdefinitions {


    EditorPage editorPage=new EditorPage();

    @When("kullanici editorUrl anasayfaya gider")
    public void kullaniciEditorUrlAnasayfayaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("editorUrl"));
    }
    @Then("new butonuna basar")
    public void new_butonuna_basar() {
        editorPage.NewKutusu.click();

    }
    @Then("tum bilgileri girer")
    public void tum_bilgileri_girer() {
        editorPage.firstname.sendKeys("ali");
        editorPage.lastname.sendKeys("atay");
        editorPage.position.sendKeys("mudur");
        editorPage.office.sendKeys("ust");
        editorPage.extention.sendKeys("cevrim");
        editorPage.startdate.sendKeys("2023-03-27");
        editorPage.salary.sendKeys("150.000");

    }

    @Then("Create tusuna basar")
    public void create_tusuna_basar() {
        editorPage.createTusu.click();

    }
    @When("kullanici ilk isim ile arama yapar")
    public void kullanici_ilk_isim_ile_arama_yapar() {
        editorPage.searchTusu.sendKeys("ali atay"+ Keys.ENTER);

    }
    @Then("isim bolumunde isminin oldugunu dogrular")
    public void isim_bolumunde_isminin_oldugunu_dogrular() {

       Assert.assertTrue(editorPage.isimDogrulama.isEnabled());

    }

}
