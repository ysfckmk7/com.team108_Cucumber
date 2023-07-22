package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.DigerPages.DemoGuruPage;
import utilities.Driver;


public class DemoGuruStepdefinitions {

    DemoGuruPage demoGuruPage=new DemoGuruPage();

    @Given("user web sayfasinda")
    public void user_web_sayfasinda() {

        Driver.getDriver().get("demoGuruUrl");
    }
    @Then("Company listesini consola yazdirir")
    public void company_listesini_consola_yazdirir() {
        for (WebElement each: demoGuruPage.company
             ) {
            System.out.println(each.getText());
        }


    }
    @Then("DCB Bank'in listede oldugunu test eder")
    public void dcb_bank_in_listede_oldugunu_test_eder() {
        for (WebElement each: demoGuruPage.company
        ) {

            String expected="DCB Bank";
            String actual=each.getText();
            Assert.assertTrue(actual.contains(expected));
        }



    }


    @And("{string} Prev.Close degerini yazdirir")
    public void prevCloseDegeriniYazdirir(String istenensirket) {
        for (WebElement each: demoGuruPage.istenensirket
        ) {
            System.out.println(each.getText());
        }




    }

    @And("{string}, {string} daki yaziyi yazdirir")
    public void dakiYaziyiYazdirir(String satir, String sutun) {
        System.out.println(demoGuruPage.satirsutun.toString());

    }

    @And("“Istenen Baslik”, sutunundaki tum degerleri yazdirir")
    public void istenenBaslikSutunundakiTumDegerleriYazdirir() {
        for (WebElement each: demoGuruPage.company
        ) {
            System.out.println(each.getText());
        }


    }
}
