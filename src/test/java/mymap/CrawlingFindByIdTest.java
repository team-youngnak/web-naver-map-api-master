package mymap;

import org.junit.jupiter.api.Test;

public class CrawlingFindByIdTest {
    private Test2 test2 = new Test2();

    @Test
    public void test1() {
        try {
            String star = test2.execute("블루보트 광화문 종로구 서린동");
            System.out.println(star);
        } catch(InterruptedException e) {
            System.out.println("크롤링 중 예외 발생");
        }

    }
}
