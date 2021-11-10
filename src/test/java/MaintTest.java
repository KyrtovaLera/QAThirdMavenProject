import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class MaintTest extends Setup{

    @Test
    void newTest() {
        driver.get("https://www.browserstack.com/users/sign_in");

        WebElement username = driver.findElement(By.id("user_email_login"));
        WebElement password = driver.findElement(By.id("user_password"));
        WebElement login = driver.findElement(By.name("commit"));

        username.sendKeys("abc@gmail.com");
        password.sendKeys("yourpassword");
        login.click();

//        String actualUrl = "https://live.browserstack.com/dashboard";
//        String expectedUrl = driver.getCurrentUrl();
//        Assert.assertEquals(expectedUrl, actualUrl);

        WebElement error = driver.findElement(By.id("bs-alert-text-id"));
        Assert.assertEquals(error.getText(), "There have been several failed attempts to sign in from this account. Please wait a while and try again later.");
    }

    @Test
    void testsFromReview() throws InterruptedException {
        driver.get("https://shop.demoqa.com/my-account/");
        Thread.sleep(5000);
        WebElement pass =  driver.findElement(By.linkText("Lost your password?"));
        pass.click();

        driver.navigate().to("https://shop.demoqa.com/my-account/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }
    @Test
    void secondTestsFromReview() throws InterruptedException {
        driver.get("https://demoqa.com/automation-practice-form");

        WebElement radioBtn =  driver.findElement(By.xpath("//label[contains(text(), 'Female')]"));
        radioBtn.click();
        Thread.sleep(2000);

    }

    @Test
    void testSearches(){ //14 урок
        driver.get("https://www.webstaurantstore.com");

        driver.findElement(By.id("searchval")).sendKeys("table\n");
        List<WebElement> itemList = driver.findElements(By.xpath
                ("//div[@id = 'details']/a[@data-testid = 'itemDescription']")); //для получения списка элементов
        //itemList.get(номер эл-та) - возвращает эл-т с id с скобках
        //temList.size() - возвращает длину листа

        for (int i = 0; i < itemList.size(); i++) {
            Assert.assertTrue(itemList.get(i).getText().toLowerCase().contains("table"));
        } //проверили что в каждом товаре - в каждом эл-те из листа было слово table
    }
}
