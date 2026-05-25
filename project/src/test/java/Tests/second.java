package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class second {


    @Test(groups = {"regression"})
    void open() {
    WebDriver driver = new ChromeDriver();

        driver.get("https://www.3ds.com/");

        System.out.println(driver.getTitle());

        driver.quit();
}

    @Test(groups = {"smoke"})
    void sec() {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.3ds.com/careers");

        System.out.println(driver.getTitle());

        driver.quit();
    }
}
