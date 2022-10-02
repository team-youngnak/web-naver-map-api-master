package mymap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

    private RoadAddressParser roadAddressParser = new RoadAddressParser();

    public String execute(String keyword) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //크롬 브라우저를 연다
        driver.get("https://www.naver.com/"); // get을 통해 해당 url을 open
        //네이버 접속
        Thread.sleep(1000);
        //sleep, wait
        WebElement webElement = driver.findElement(By.id("query"));
        //네이버 검색
        webElement.sendKeys(keyword);
        WebElement webElement2 = driver.findElement(By.id("search_btn"));
        webElement2.click();
        Thread.sleep(1000);
        WebElement star = driver.findElement(By.xpath(
                "//*[@id=\"place-main-section-root\"]/div/section/div/div[2]/div[1]/div[2]/span[1]/em"));
        String rstar = star.getText(); // text string으로 태그 안의 값 추출
        return rstar;
        //driver.findElement(By.id("place-main-section-root"));
        // driver.findElement(By.id("_title"));
        //*[@id="place-main-section-root"]/div/section/div/div[2]/div[1]/div[2]/span[1]/em

    }
}
