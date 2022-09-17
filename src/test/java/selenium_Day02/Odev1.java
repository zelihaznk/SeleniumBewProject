package selenium_Day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Odev1 {
    public static void main(String[] args) throws InterruptedException {
        /*
        /*
        1.Yeni bir class olusturalim (Homework)
        2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) "facebook"
        oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        3.Sayfa URL'inin "facebook" kelimesi icerdigini dogrulayin, icermiyorsa "actual" URL'i
        yazdirin.
        4.https://www.walmart.com/ sayfasina gidin.
        5. Sayfa basliginin "Walmart.com" icerdigini dogrulayin.
        6. Tekrar "facebook" sayfasina donun
        7. Sayfayi yenileyin
        8. Sayfayi tam sayfa (maximize) yapin
        9.Browser'i kapatin
         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        //2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) "facebook"
        //  oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        driver.get("https://tr-tr.facebook.com/");

        System.out.println("Actual Title : "+driver.getTitle());

        String actualTitle = driver.getTitle();
        String istenenBaslik = "facebook";
        if (actualTitle.contains(istenenBaslik)){
            System.out.println("Title testi PASSED");
        }else System.out.println("Title testi FAILED");

        //3.Sayfa URL'inin "facebook" kelimesi icerdigini dogrulayin, icermiyorsa "actual" URL'i
        //  yazdirin.
        String actualUrl = driver.getCurrentUrl();
        String arananKelime ="facebook";
        if (actualUrl.contains(arananKelime)){
            System.out.println("Url testi PASSED");
        }else System.out.println("Url testi FAILED");

        // 4.https://www.walmart.com/ sayfasina gidin.
        driver.get("https://www.walmart.com/");

        //5. Sayfa basliginin "Walmart.com" icerdigini dogrulayin.
        String actualTitle2 = driver.getTitle();
        String istenenBaslik2 = "walmart";
        if (actualTitle2.contains(istenenBaslik2)){
            System.out.println("Title testi PASSED");
        }else System.out.println("Title testi FAILED");

        //6. Tekrar "facebook" sayfasina donun
        driver.navigate().back();

        //7. Sayfayi yenileyin
        driver.navigate().refresh();

        //8. Sayfayi tam sayfa (maximize) yapin
        driver.manage().window().maximize();

        //Kapanmadan önce yapılanları görebilmek için 3 sayine bekleme ekledim
        Thread.sleep(3000);

        //9.Browser'i kapatin
        driver.close();




    }
}
