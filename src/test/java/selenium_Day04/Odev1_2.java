package selenium_Day04;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
public class Odev1_2 {

    public static void main(String[] args) throws InterruptedException {
        //    1-https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
//    2- Add Element butonuna 10 kez basinız
//    3- 10 kez Add element butonuna basıldığını test ediniz
//    4 - Delete butonuna görünmeyene kadar basınız
//    5- Delete butonunun görünmediğini test ediniz
//    6- Sayfayı kapatınız

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        WebElement addButton = driver.findElement(By.xpath("//*[text()='Add Element']"));
        //    2- Add Element butonuna 10 kez basinız
        for (int i = 0; i < 10; i++) {
            addButton.click();
        }
        //    3- 10 kez Add element butonuna basıldığını test ediniz
        List<WebElement> deleteButtonList = driver.findElements(By.xpath("//*[text()='Delete']"));
        String checkDeleteButton = deleteButtonList.size() == 10 ? "true" : "false";
        System.out.println("Add button pressed ten times : " + checkDeleteButton);

        // 4 - Delete butonuna görünmeyene kadar basınız
        WebElement deleteButton = driver.findElement(By.xpath("//*[text()='Delete']"));
        int i = deleteButtonList.size();
        Thread.sleep(3000);
        while (i>0){
            try {
                deleteButton.click();
            } catch (StaleElementReferenceException e) {
                deleteButton = driver.findElement(By.xpath("//*[text()='Delete']"));
                deleteButton.click();
            }
            deleteButtonList.remove(i-1);
            i--;
        }
        //    5- Delete butonunun görünmediğini test ediniz
        if (deleteButtonList.size()!=0){
            System.out.println("Delete button is visible");
        }else{
            System.out.println("Delete button is not visible");
        }
        //    6- Sayfayı kapatınız
        driver.close();
    }
}
