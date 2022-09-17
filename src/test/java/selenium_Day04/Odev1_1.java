package selenium_Day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Odev1_1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        Thread.sleep(2000);

        WebElement addElementButton = driver.findElement(By.xpath("//*[@onclick='addElement()']"));
        int sayac = 0;
        while (sayac < 10) {
            addElementButton.click();
            sayac++;
        }
        Thread.sleep(2000);
        WebElement deleteElementButton = driver.findElement(By.xpath("//div[@id='elements']/button[10]"));
        int sayac2 = 0;
        while (sayac2 < 10) {
            deleteElementButton.click();
            sayac2++;
        }
        Thread.sleep(2000);
        WebElement expectedDB = driver.findElement(By.className("example"));
        String actualDB= expectedDB.getText();
        if (actualDB.contains("Delete")) {
            System.out.println("Delete testi FAILED");
        } else {
            System.out.println("Delete tesi PASSED");
        }
        driver.close();
        /*
        Delete testi PASSED
         */
    }
}
