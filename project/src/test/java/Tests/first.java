package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class first {


    @Test(groups = {"smoke"})
    void launch(){

        ChromeOptions options = new ChromeOptions();

// 1. Run without a visible UI window (Crucial for CI/CD)
        options.addArguments("--headless=new");

// 2. Security & resource fixes required for Linux cloud runners
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");

        System.out.println(driver.getTitle());


        driver.quit();
    }

    @Test(groups = {"regression"})
    void some(){
        ChromeOptions options = new ChromeOptions();

// 1. Run without a visible UI window (Crucial for CI/CD)
        options.addArguments("--headless=new");

// 2. Security & resource fixes required for Linux cloud runners
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.deloitte.com/global/en/careers.html");

        System.out.println(driver.getTitle());


        driver.quit();
    }
}
