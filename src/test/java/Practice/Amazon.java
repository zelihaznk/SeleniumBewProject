package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Amazon {
    public static void main(String[] args) {
        /*
2 https://www.amazon.com/ adresine gidin
3 Browseri tam sayfa yapin
4 Sayfayi "refresh" yapin
5 Sayfa basliginin "Spend less" ifadesi icerdigini test edin
6 Gift Cards sekmesine basin
7 Birthday butonuna basin
8 Best Seller bolumunden ilk urunu tiklayin
9 Gift card details'den 25 $'i secin
10 Urun ucretinin 25$ oldugunu test edin
11 Sayfayi kapatin
 */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //2 https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");

        //3 Browseri tam sayfa yapin
        driver.manage().window().maximize();

        driver.navigate().refresh();

        //5 Sayfa basliginin "Spend less" ifadesi icerdigini test edin
        String actualTitle = driver.getTitle();
        String istenenBaslik = "Spend less";
        if (actualTitle.contains(istenenBaslik)){
            System.out.println("Title testi PASSED");
        }else System.out.println("Title testi FAILED");

        driver.navigate().refresh();

        //6 Gift Cards sekmesine basin
        driver.findElement(By.xpath("(//*[text()='Gift Cards'])[1]")).click();

        //7 Birthday butonuna basin
        driver.findElement(By.xpath("//img[@alt='Birthday gift cards']")).click();

        //8 Best Seller bolumunden ilk urunu tiklayin
        driver.findElement(By.xpath("(//img[@alt='Amazon.com eGift Card'])[1]")).click();

        //9 Gift card details'den 25 $'i secin
        driver.findElement(By.id("a-autoid-28")).click();

        //10 Urun ucretinin 25$ oldugunu test edin
        WebElement ucret = driver.findElement(By.xpath("(//button[@id='gc-mini-picker-amount-1'])[1]"));
        if (ucret.isDisplayed()){
            System.out.println("PASSED");
        }else System.out.println("FAILED");

        driver.close();








    }
}
