package mymap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

    public void execute(String keyword) {
        WebDriver driver = new ChromeDriver(); //크롬 브라우저를 연다
        driver.get("https://www.naver.com/"); // get을 통해 해당 url을 open
        //sleep, wait
        WebElement webElement = driver.findElement(By.id("query"));
        webElement.sendKeys(keyword);
    }
}
