package selenium_Day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Xpath {
    public static void main(String[] args) throws InterruptedException {
        /*
        https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        2- Add Element butonuna basin
        Delete butonu’nun gorunur oldugunu test edin
        Delete tusuna basin
        “Add/Remove Elements” yazisinin gorunur oldugunu test edin
         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// Gidilen sayfada 10 sn icinde calısmazsa kapanir

        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/ ");


        //2- Add Element butonuna basin
        driver.findElement(By.xpath("(//button[text()='Add Element'])[1]")).click(); //  driver.findElement(By.xpath("//*[text()='Add Element']")).click(); olarakda yapılabilir
        Thread.sleep(3000);

        //Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButonu = driver.findElement(By.xpath("//*[text()='Delete']")); // //button[normalize-space()='Delete'] şeklinde de yazılabilir.
        if (deleteButonu.isDisplayed()){
            System.out.println("Delete butonu PASSED");
        }else System.out.println("Delete butonu FAILED");

        // 4- Delete tusuna basin
        deleteButonu.click();

        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemoveButonu = driver.findElement(By.xpath("//h3"));// //h3[normalize-space()='Add/Remove Elements'] şeklinde de yazılabilir
        if (addRemoveButonu.isDisplayed()){
            System.out.println("AddRemove yazisi PASSED");
        }else System.out.println("AddRemove yazisi FAİLED");

        //Sayfaları kapatın
        driver.quit();


        //   *--> tagname
        //   . --> atributu



    }
}
