package selenium_Day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Odev4 {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //sayfa açılmazsa 10 saniye bekle

        //a. https://www.trendyol.com/ adresine gidiniz.
        driver.get("https://www.trendyol.com/");
        driver.navigate().refresh();//Buraya bir refresh ekledik çünkü sayfayı refresh yapmadan giriş yap butonu tıklanmıyor


        //b. Giriş yap(sing in) butonuna basin
        driver.findElement(By.xpath("(//p[@class='link-text'])[1]")).click(); // //p[contains(text(),'Giriş Yap')] bu şekilde de kullanabilirdik


        // Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:

        // Kullanıcı adı için :
        driver.findElement(By.xpath("//input[@id='login-email']")).sendKeys("");
        Thread.sleep(3000);

        //Şifre için :
        driver.findElement(By.id("login-password-input")).sendKeys("");
        WebElement giris = driver.findElement(By.xpath("//button[@type='submit']/span[text()='Giriş Yap']"));//button[@type='submit']/span[text()='Giriş Yap']
        giris.click();

        //Arama kutusuna "Bilgisayar" yazın ve aratın
        driver.findElement(By.xpath("//input[@placeholder='Aradığınız ürün, kategori veya markayı yazınız']")).sendKeys("Bilgisayar",Keys.ENTER);
        Thread.sleep(3000);

        //Apple Macbook Air 13'' M1 8gb 256gb Ssd Gümüş MGN93TU/A ---> Modelli bilgisayara tıklayın
        driver.findElement(By.xpath("(//div[@class='image-overlay-body'])[2]")).click();


        /*
        WebElement tıkla = driver.findElement(By.xpath("(//div[@class='add-to-basket-button-text'])[1]"));
        tıkla.sendKeys(Keys.ENTER);

         */

        driver.navigate().refresh();

        driver.quit();











    }
}
