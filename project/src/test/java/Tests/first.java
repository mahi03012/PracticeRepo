package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class first {


    @Test(groups = {"smoke"})
    void launch(){
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");

        System.out.println(driver.getTitle());


        driver.quit();
    }

    @Test(groups = {"regression"})
    void some(){
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.deloitte.com/global/en/careers.html");

        System.out.println(driver.getTitle());


        driver.quit();
    }
}
