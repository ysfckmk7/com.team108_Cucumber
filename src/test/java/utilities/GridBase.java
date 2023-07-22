package utilities;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class GridBase {

    DesiredCapabilities cap=new DesiredCapabilities();

    public static String hubUrl="http://192.168.1.18:4444";

    public static String browser="chrome";

    public WebDriver setDriver(WebDriver driver){


        if (browser=="crome"){


            cap.setPlatform(Platform.ANY);
            cap.setBrowserName("chrome");
          //  cap.setVersion("112.0.5615.121");  // Bazen bilgisayarımız versiyonumuzu bulamayabilir bu yuzden yoruma aldık

            ChromeOptions options=new ChromeOptions();
            options.merge(cap);

        }

        if (browser=="IE"){

            cap.setPlatform(Platform.WINDOWS);
            cap.setBrowserName("IE");
         //   cap.setVersion("112.0.1722.48");

            InternetExplorerOptions ieoptions=new InternetExplorerOptions();
            ieoptions.merge(cap);
        }


        try {
            driver= new RemoteWebDriver(new URL(hubUrl),cap);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();



        return driver;


    }

}
