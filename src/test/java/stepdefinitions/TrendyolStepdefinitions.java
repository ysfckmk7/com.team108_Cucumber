package stepdefinitions;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.DigerPages.TrendyolPage;

public class TrendyolStepdefinitions {
    TrendyolPage trendyolPage=new TrendyolPage();
    @Then("trendyolda {string} icin arama yapar")
    public void trendyolda_icin_arama_yapar(String arananKelimeler) {
        trendyolPage.aramaKutusu.sendKeys(arananKelimeler,Keys.ENTER);
    }
    @Then("sonuclarin {string} icerdigini kontrol eder")
    public void sonuclarin_icerdigini_kontrol_eder(String arananKelimeler) {
        String sonucYazisi=trendyolPage.aramaSonuctext.getText();
        Assert.assertTrue(sonucYazisi.contains(arananKelimeler));
    }
















}
