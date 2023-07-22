package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.DigerPages.AutoPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class AutoStepdefinitions {


    AutoPage autoPage=new AutoPage();

    @Given("user sign up linkine tiklar")
    public void user_sign_up_linkine_tiklar() {

        autoPage.singupLoginLink.click();
    }
    @And("user Create an account bölümüne name bilgisini girer")
    public void userCreateAnAccountBölümüneNameBilgisiniGirer() {
        autoPage.singupname.sendKeys("ali");
    }
    @Given("user Create an account bölümüne email adresi girer")
    public void user_create_an_account_bölümüne_email_adresi_girer() {
        ReusableMethods.bekle(3);
       autoPage.singupemail.sendKeys("atay@1905");
    }
    @Given("signUp butonuna basar")
    public void sign_up_butonuna_basar() {
        autoPage.singupButonu.click();

    }
    @Given("user kisisel bilgilerini ve iletisim bilgilerini girer")
    public void user_kisisel_bilgilerini_ve_iletisim_bilgilerini_girer() {

        autoPage.title.click();
        autoPage.password.sendKeys("123");
        autoPage.day.sendKeys("13");
        autoPage.months.sendKeys("April");
        autoPage.years.sendKeys("2023");
        autoPage.firstname.sendKeys("asi");
        autoPage.lastname.sendKeys("mahoo");
        autoPage.company.sendKeys("madrid");
        autoPage.address1.sendKeys("newyork carsisi");
        autoPage.address2.sendKeys("carsininalti");
        //Select select=new Select(autoPage.company);
        //select.selectByVisibleText("Canada");
        autoPage.state.sendKeys("yahyakaptan");
        autoPage.city.sendKeys("acity");
        autoPage.zipcode.sendKeys("12345");
        autoPage.mobilenumber.sendKeys("5538975623");

    }
    @Given("user Create Account butonuna basar")
    public void user_create_account_butonuna_basar() {

        Actions actions=new Actions(Driver.getDriver());

        actions.moveToElement(autoPage.reklam);
        ReusableMethods.bekle(3);
        actions.click(autoPage.creataccount).perform();
        actions.click(autoPage.continuee).perform();
        ReusableMethods.bekle(10);
        Driver.getDriver().navigate().back();

    }

    @Then("hesap olustugunu test edin")
    public void hesap_olustugunu_test_edin() {

        Assert.assertTrue(autoPage.hesapOlustu.isDisplayed());

    }



}
