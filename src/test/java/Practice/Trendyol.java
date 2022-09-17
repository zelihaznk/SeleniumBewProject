package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Trendyol {
    public static void main(String[] args) throws InterruptedException {
        /*
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //https://www.trendyol.com/
        driver.get("https://www.trendyol.com/");

        //Sayfayı yenile
        driver.navigate().refresh();

        //Çerezleri kabul et
        driver.findElement(By.xpath("//*[text()='KABUL ET']")).click();

        /*
        //Başlığın "Trendyol" içerdiğini test ediniz.
        WebElement title = driver.findElement(By.xpath("//img[@alt='Trendyol']"));
        if (title.isDisplayed()){
            System.out.println("Title testi PASSED");
        }else System.out.println("Title testi PASSED");

         */
/*
        //Anasayfanın istenildiği gözüktüğünü tet ediniz
        WebElement test = driver.findElement(By.xpath("//div[@id='browsing-gw-homepage']"));
        if (test.isDisplayed()){
            System.out.println("Anasayfa testi PASSED");
        }else System.out.println("Anasayfa testi FAILED");

        //Sepete ençok eklenenler butonuna tıklayınız
        driver.findElement(By.xpath("(//img[@class='p-card-img '])[1]")).click();

        Thread.sleep(2000);


        //
        driver.findElement(By.xpath("//a[normalize-space()='Uygula']")).click();
        //Thread.sleep(2000);
        driver.navigate().refresh();


        //İlgili kategorilerden Sneaker kısmına tıklayın
        WebElement sneaker = driver.findElement(By.xpath("//div[text()='Sneaker']"));
        sneaker.click();
        driver.navigate().refresh();
        Thread.sleep(2000);


        //Cinsiyet kısmından Kadın olanı seçiniz
        WebElement kadın = driver.findElement(By.xpath("(//div[@class='chckbox'])[1]"));
        kadın.click();
        Thread.sleep(2000);



        //Marka ara kısmına adidas yazınız
       WebElement adidas = driver.findElement(By.xpath("//div[normalize-space()='adidas']"));
        adidas.click();
        Thread.sleep(2000);

 */



    }
}
