package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;
import pages.MealsCenterPages.*;
import utilities.Driver;
import utilities.ReusableMethods;

public class MealsCenterStepdefinitions {
  mealsCenterPage mealsCenter=new mealsCenterPage();
  pages.MealsCenterPages.mealsCenterHeader mealsCenterHeader=new mealsCenterHeader();
  pages.MealsCenterPages.mealsCenterFooter mealsCenterFooter=new mealsCenterFooter();

  mealsCenterNew_restaurant mealsCenternew_restaurant=new mealsCenterNew_restaurant();
  mealsCenterPopular_nearby mealsCenterpopular_nearby=new mealsCenterPopular_nearby();
  Actions actions=new Actions(Driver.getDriver());



  @Then("cerezleri KabulEder")
  public void cerezleri_kabul_eder() {
    mealsCenter.cerezRedButonuHome.click();
  }
  @Then("Header bolumundeki butonlari tanıtır")
  public void header_bolumundeki_butonlari_tanıtır() {
    mealsCenter.mealsCenterLogoHome.click();
    ReusableMethods.bekle(1);
    mealsCenterHeader.americanButonuHome.click();
    Driver.getDriver().navigate().back();
    ReusableMethods.bekle(1);

    mealsCenterHeader.mediterraneanButonuHome.click();
    Driver.getDriver().navigate().back();
    ReusableMethods.bekle(1);

    mealsCenterHeader.sandwichesButonuHome.click();
    Driver.getDriver().navigate().back();
    ReusableMethods.bekle(1);

    mealsCenterHeader.italianButonuHome.click();
    Driver.getDriver().navigate().back();
    ReusableMethods.bekle(1);

    mealsCenterHeader.mexicanButonuHome.click();
    Driver.getDriver().navigate().back();
    ReusableMethods.bekle(1);

    mealsCenterHeader.burgersButonuHome.click();
    Driver.getDriver().navigate().back();
    ReusableMethods.bekle(1);

    mealsCenterHeader.japaneseButonuHome.click();
    Driver.getDriver().navigate().back();
    ReusableMethods.bekle(1);

    mealsCenterHeader.thaiButonuHome.click();
    Driver.getDriver().navigate().back();
    ReusableMethods.bekle(1);

    mealsCenterHeader.moreButonuHome.click();
    ReusableMethods.bekle(1);
    mealsCenterHeader.moreButonuHome_Chinese.click();
    Driver.getDriver().navigate().back();
    ReusableMethods.bekle(1);

    mealsCenterHeader.moreButonuHome.click();
    ReusableMethods.bekle(1);
    mealsCenterHeader.moreButonuHome_Kosher.click();
    Driver.getDriver().navigate().back();
    ReusableMethods.bekle(1);

    mealsCenterHeader.moreButonuHome.click();
    ReusableMethods.bekle(1);
    mealsCenterHeader.moreButonuHome_Halal.click();
    Driver.getDriver().navigate().back();
    ReusableMethods.bekle(1);

    mealsCenterHeader.moreButonuHome.click();
    ReusableMethods.bekle(1);
    mealsCenterHeader.moreButonuHome_Vegetarian.click();
    Driver.getDriver().navigate().back();
    ReusableMethods.bekle(1);

  }


  @Then("Footer bolumundeki Contact us butonuna tıkla")
  public void footerBolumundekiContactUsButonunaTıkla() {
    actions.click(mealsCenterHeader.sing_inHome).perform();
    mealsCenterFooter.MealsCenterCorp_Contact_us.click();
  }
  @Then("Contact us sayfasının iceriginideki text'i yazdır")
  public void contactUsSayfasınınIceriginidekiTextIYazdır() {
    String contact_us_icerik=mealsCenterFooter.Contact_usText.getText();
    System.out.println("Contact us : " + contact_us_icerik);
  }


  @And("anasayfaya geri doner")
  public void anasayfayaGeriDoner() {
    mealsCenterFooter.mealsCenterLogoHome.click();
  }


  @And("cart sekmesini giris yaparak icergini yazdirir")
  public void cartSekmesiniGirisYaparakIcerginiYazdirir() {
    mealsCenterHeader.cartHome.click();
    String carttext=mealsCenterHeader.CartHomeIcerik.getText();
    System.out.println("Cart Text : " + carttext);
  }


}
