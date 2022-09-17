package selenium_Day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_WindowHandle {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.amazon.com.tr/");

        System.out.println(driver.getWindowHandle());//CDwindow-1087B5A7FA3BF084B146B52806CCCBDB
        //Burası bize her çalışmada yeni bir hashcod verir
        //Farklı pencereler arasında gezinebilmek için getWindowHandle() methodunu kullanırız

        driver.close();

    }
}
