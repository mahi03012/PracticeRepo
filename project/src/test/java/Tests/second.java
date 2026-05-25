package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class second {


    @Test(groups = {"regression"})
    void open() {

        ChromeOptions options = new ChromeOptions();

// 1. Run without a visible UI window (Crucial for CI/CD)
        options.addArguments("--headless=new");

// 2. Security & resource fixes required for Linux cloud runners
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
    WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.3ds.com/");

        System.out.println(driver.getTitle());

        driver.quit();
}

    @Test(groups = {"smoke"})
    void sec() {

        ChromeOptions options = new ChromeOptions();

// 1. Run without a visible UI window (Crucial for CI/CD)
        options.addArguments("--headless=new");

// 2. Security & resource fixes required for Linux cloud runners
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.3ds.com/careers");

        System.out.println(driver.getTitle());

        driver.quit();
    }
}
