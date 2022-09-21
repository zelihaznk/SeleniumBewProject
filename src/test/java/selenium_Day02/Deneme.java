package selenium_Day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Deneme {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.amazon.com");

        //Arama çubuğunda Laptop arat
        WebElement arananKelime = driver.findElement(By.id("twotabsearchtextbox"));
        arananKelime.sendKeys("Laptop", Keys.ENTER);

        //Çıkan ilk laptop'a tıkla
        driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();

        //bir önceki sayfaya git
        driver.navigate().back();



    }
}
