package selenium_Day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GetMethodlari {
    public static void main(String[] args) {

        /*
        -Amazon sayfasına gidiniz
        -Arama kutusunu locate ediniz
        -Arama kutusunun tagName'inin input olduğunu test ediniz
        -Arama kutusunun name atributu'nun değerinin field-keywords olduğunu test ediniz
        -Sayfayı kapatınız
         */

        /*
        TAGNAME Her webelementin ilk siradaki ismidir ÖRNEK =INPUT
        ATRIBUTE ISE --->  id   ----value name --  dir --class--
        bunlarin icinde olanlar ise   atribute degerleridir .     ?
         */
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// Gidilen sayfada 10 sn icinde calısmazsa kapanir


        //Amazon sayfasına gidiniz.
        driver.get("https://www.amazon.com");

        // Arama kutusuna locate ediniz.
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));

        //Arama kutusunun tagName'inin input oldugunu test ediniz.
        String expectedTagName = "input";
        String actualTagName = aramaKutusu.getTagName();
        if (actualTagName.equals(expectedTagName)){
            System.out.println("TagName testi PASSED " + actualTagName);
        }else System.out.println("TagName testi FAILED");

        // Arama kutusunun name attributenin field-keywords  oldugunu test ediniz.
        String expectedAtributuName = "field-keywords";
        String actualAtributuName = aramaKutusu.getAttribute("name");
        if (actualAtributuName.equals(expectedAtributuName)){
            System.out.println("Atribute TESTI PASSED");
        } else System.out.println("Atribute TESTI FAILED");

        //-Sayfayı kapatınız
        driver.close();


    }
}
