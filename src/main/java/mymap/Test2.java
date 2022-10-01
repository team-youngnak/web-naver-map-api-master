package mymap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

    private RoadAddressParser roadAddressParser = new RoadAddressParser();

    public void execute(String keyword) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //크롬 브라우저를 연다
        driver.get("https://www.naver.com/"); // get을 통해 해당 url을 open
        //네이버 접속
        Thread.sleep(10000);
        //sleep, wait

        WebElement webElement = driver.findElement(By.id("query"));
        webElement.sendKeys(keyword); //네이버 검색
        Thread.sleep(10000);

        //driver.findElement(By.id("place-main-section-root"));
        driver.findElement(By.id("wrap/place-main-section-root"));

    }
}
