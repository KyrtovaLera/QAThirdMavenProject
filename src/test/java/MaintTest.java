import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

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
}
