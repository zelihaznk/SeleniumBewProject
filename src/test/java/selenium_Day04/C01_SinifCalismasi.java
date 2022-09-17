package selenium_Day04;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_SinifCalismasi {
    public static void main(String[] args) throws InterruptedException {

        /*
        ClasslassWork : L oginoginTest
        1. Bir class oluşturun: LoginTest
        2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        a. http://a.testaddressbook.com adresine gidiniz.
        b. Sign in butonuna basin
        c. email textbox,password textbox, and signin button elementlerini locate
        d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        i. Username :
        testtechproed@gmail.com
        ii. Password : Test1234!
        e. Expected user id nin
        testtechproed@gmail.com oldugunu dogrulayin(verify).
        f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        3. Sayfada kac tane link oldugunu bulun.
         */


        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// Gidilen sayfada 10 sn icinde calısmazsa kapanir

        driver.get("http://a.testaddressbook.com");

        driver.findElement(By.id("sign-in")).click();  //Bir defa kullanacaksak bir web elemente atamamıza gerek yoktur

        //-Amazon sayfasına gidiniz
        driver.get("https://amazon.com");
        //-Arama kutusunu locate ediniz
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        //-Arama kutusunun tagName'inin input olduğunu test ediniz
        String expectedTagName = "input";
        String actualTagName = aramaKutusu.getTagName();
        if (actualTagName.equals(expectedTagName)){
            System.out.println("TagName TESTI PASSED : "+actualTagName);
        }else {
            System.out.println("TagName TESTI FAILED" +actualTagName);
        }
        //-Arama kutusunun name atributu'nun değerinin field-keywords olduğunu test ediniz
        String expectedAtributuName = "field-keywords";
        String actualAtributuName = aramaKutusu.getAttribute("name");
        if (actualAtributuName.equals(expectedAtributuName)){
            System.out.println("Atribute TESTI PASSED");
        } else System.out.println("Atribute TESTI FAILED");

        // Arama kutusunun konumunu yazdırınız
        System.out.println("Arama kutusu konumu "+aramaKutusu.getLocation());

        //-Sayfayı kapatınız
        driver.close();











    }
}
