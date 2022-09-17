package selenium_Day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Odev1 {
    public static void main(String[] args) throws InterruptedException {

        /**
        ÖDEV 1:
        Amazon sayfasina gidelim. https://www.amazon.com/
        Sayfa basligini(title) yazdirin
        Sayfa basliginin “Amazon” icerdigini test edin
        Sayfa adresini(url) yazdirin
        Sayfa url’inin “amazon” icerdigini test edin.
        Sayfa handle degerini yazdirin
        Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        Sayfayi kapatin.
         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        //Amazon sayfasina gidelim. https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com/");

        //Sayfa basligini(title) yazdirin
        System.out.println("Actual Title : "+driver.getTitle());

        //Sayfa basliginin “Amazon” icerdigini test edin

        String actualTitle = driver.getTitle();
        String istenenBaslik = "Amazon";
        if (actualTitle.contains(istenenBaslik)){
            System.out.println("Title testi PASSED");
        }else System.out.println("Title testi FAILED");

        // Sayfa adresini(url) yazdirin
        System.out.println("Actual Url "+driver.getCurrentUrl());

        // Sayfa url’inin “amazon” icerdigini test edin.

        String actualUrl = driver.getCurrentUrl();
        String arananKelime ="amazon";
        if (actualUrl.contains(arananKelime)){
            System.out.println("Url testi PASSED");
        }else System.out.println("Url testi FAILED");

        //Sayfa handle degerini yazdirin
        System.out.println("Window Handle :"+driver.getWindowHandle());

        //Sayfadaki kaynak kodlarını yazdırınız
        System.out.println(driver.getPageSource());

        System.out.println("***********************************");

        //Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        String istenenKelime = "Gateway";
        if (driver.getPageSource().contains(istenenKelime)){
            System.out.println("PageSource testi PASSED");
        }else System.out.println("PageSource testi FAILED");

        //Sayfa kapanmadan önce görebilmek amacıyla bir bekleme kısmı ekledim
        Thread.sleep(3000);

        //Sayfayi kapatin.
        driver.close();


    }
}
