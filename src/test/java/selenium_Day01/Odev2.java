package selenium_Day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Odev2 {
    public static void main(String[] args) {

        /**
        Youtube ana sayfasina gidelim . https://www.youtube.com/
        Amazon soyfasina gidelim. https://www.amazon.com/
        Tekrar YouTube’sayfasina donelim
        Yeniden Amazon sayfasina gidelim
        Sayfayi Refresh(yenile) yapalim
        Sayfayi kapatalim / Tum sayfalari kapatalim
         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); //sakince bekle demek

        //Youtube ana sayfasina gidelim . https://www.youtube.com/
        driver.navigate().to("https://www.youtube.com/");

        //Amazon soyfasina gidelim. https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com/");

        //Tekrar YouTube’sayfasina donelim
        driver.navigate().back();

        //Yeniden Amazon sayfasina gidelim
        driver.navigate().forward();

        //Sayfayi Refresh(yenile) yapalim
        driver.navigate().refresh();

        //Sayfayi kapatalim / Tum sayfalari kapatalim (Tüm sayfalar dediği için driver.quit() methodunu kullandık.
        driver.quit();

        //Tek sayfayı kapatın deseydi driver.close() methodu kullanılırdı.
        //driver.close();



    }
}
