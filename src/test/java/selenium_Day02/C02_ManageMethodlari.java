package selenium_Day02;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_ManageMethodlari {
    public static void main(String[] args) throws InterruptedException {


        /**
        Yeni bir Class olusturalim.C07_ManageWindowSet
        Amazon soyfasina gidelim. https://www.amazon.com/
        Sayfanin konumunu ve boyutlarini yazdirin
        Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        Sayfayi kapatin
         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        //Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Sayfanin konumu :"+driver.manage().window().getPosition());// Açılan browser'ın konumunu verir
        System.out.println("Sayfanin olculeri"+driver.manage().window().getSize()); // Açılan browser'ın ölçülerini verir

        //Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        driver.manage().window().setPosition(new Point(20,20));//Sayfanın konumunu istediğimiz şekilde ayarlar
        driver.manage().window().setSize(new Dimension(600,300));//Sayfanın ölçülerini istediğimiz şekilde ayarlar


        //Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        System.out.println("Sayfanin yeni konumu :"+driver.manage().window().getPosition());// Açılan browser'ın konumunu verir
        System.out.println("Sayfanin yeni olculeri"+driver.manage().window().getSize()); // Açılan browser'ın ölçülerini verir

        //Sayfayi kapatin
        Thread.sleep(300);
        driver.close();

        /**
        Yani get 'ler hiç bir şeyi değiştirmiyor sadece sonucu görmek için kullanıyoruz
        Set de ise değişiklik yapıyoruz

         get--> getirir
         set--> setting yapar
         */








    }
}
