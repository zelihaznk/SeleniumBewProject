package selenium_Day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class C05_findelements {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        //Amazon sayfasına gidin
        driver.get("https://www.amazon.com/");

        //Amazon sayfasındaki tag'ları link(a) olanların sayısını yazdırın
        List<WebElement> tag = driver.findElements(By.tagName("a"));
        System.out.println("A tag'inin sayisi :"+tag.size());

        //Amazon sayfasındaki tag'ları link(input) olanların sayısını yazdırın
        List<WebElement> tag2 = driver.findElements(By.tagName("input"));
        System.out.println("input tag'inin sayisi :"+tag2.size());

        System.out.println(driver.findElement(By.xpath("(//*[@class='a-color-base headline truncate-2line'])[1]")).getText());

        driver.close();





    }
}
