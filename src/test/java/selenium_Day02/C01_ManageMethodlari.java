package selenium_Day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_ManageMethodlari {
    public static void main(String[] args) throws InterruptedException {

        /**
        Yeni bir Class olusturalim.C06_ManageWindow
        Amazon soyfasina gidelim. https://www.amazon.com/
        Sayfanin konumunu ve boyutlarini yazdirin
        Sayfayi simge durumuna getirin
        simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        Sayfayi fullscreen yapin
        Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        Sayfayi kapatin
         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();


        //Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Pencere konumu :"+driver.manage().window().getPosition());// Açılan browser'ın konumunu verir
        System.out.println("Pencere olculeri"+driver.manage().window().getSize()); // Açılan browser'ın ölçülerini verir

        //Sayfayi simge durumuna getirin
        driver.manage().window().minimize(); //Pencereyi simge durumuna getirir

        //simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        Thread.sleep(3000);
        driver.manage().window().maximize();

        //Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        System.out.println("Yeni pencere konumu :"+driver.manage().window().getPosition());// Açılan browser'ın konumunu verir
        System.out.println("Yeni pencere olculeri"+driver.manage().window().getSize()); // Açılan browser'ın ölçülerini verir

        //Sayfayi fullscreen yapin
        Thread.sleep(3000);
        driver.manage().window().fullscreen();

        //Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        System.out.println("Fullscreen pencere konumu :"+driver.manage().window().getPosition());// Açılan browser'ın konumunu verir
        System.out.println("Fullscreen pencere olculeri"+driver.manage().window().getSize()); // Açılan browser'ın ölçülerini verir

        //Sayfayi kapatin
        Thread.sleep(3000);
        driver.close();




    }
}
