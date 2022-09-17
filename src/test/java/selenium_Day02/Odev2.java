package selenium_Day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Odev2 {
    public static void main(String[] args) {

        /*
         /*
        Yeni bir class olusturun (TekrarTesti)
        2. Youtube web sayfasına gidin ve sayfa başlığının "youtube" olup olmadığını doğrulayın
        (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        3. Sayfa URL'sinin "youtube" içerip içermediğini (contains) doğrulayın, içermiyorsa doğru
        URL'yi yazdırın.
        4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        5. Youtube sayfasina geri donun
        6. Sayfayi yenileyin
        7. Amazon sayfasina donun
        8. Sayfayi tamsayfa yapin
        9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa
        doğru başlığı(Actual Title) yazdırın.
        10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
        URL'yi yazdırın
        11.Sayfayi kapatin
         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();


        // 2. Youtube web sayfasına gidin ve sayfa başlığının "youtube" olup olmadığını doğrulayın
        // (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.youtube.com/");

        System.out.println("Actual Title : "+driver.getTitle());

        String actualTitle = driver.getTitle();
        String istenenBaslik = "youtube";
        if (actualTitle.contains(istenenBaslik)){
            System.out.println("Title testi PASSED");
        }else System.out.println("Title testi FAILED");



        //3. Sayfa URL'sinin "youtube" içerip içermediğini (contains) doğrulayın, içermiyorsa doğru
        //   URL'yi yazdırın.
        String actualUrl = driver.getCurrentUrl();
        String arananKelime ="youtube";
        if (actualUrl.contains(arananKelime)){
            System.out.println("Url testi PASSED");
        }else System.out.println("Url testi FAILED");


        //4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.get("https://www.amazon.com.tr/");

        //5. Youtube sayfasina geri donun
        driver.navigate().back();

        //6. Sayfayi yenileyin
        driver.navigate().refresh();

        //7. Amazon sayfasina donun
        driver.navigate().forward();

        //8. Sayfayi tamsayfa yapin
        driver.manage().window().maximize();

        //9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa
        //   doğru başlığı(Actual Title) yazdırın.
        String actualTitle2 = driver.getTitle();
        String istenenBaslik2 = "amazon";
        if (actualTitle2.contains(istenenBaslik2)){
            System.out.println("Title testi PASSED");
        }else System.out.println("Title testi FAILED");


        //10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
        //   URL'yi yazdırın
        String actualUrl2 = driver.getCurrentUrl();
        String arananKelime2 ="youtube";
        if (actualUrl2.contains(arananKelime2)){
            System.out.println("Url testi PASSED");
        }else System.out.println("Url testi FAILED");

        //11.Sayfayi kapatin
        driver.close();






    }
}
