package mymap;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class Test1 {

    @Autowired
    private NaverClient naverClient;


    @Test
    public void test1() {
        naverClient.printValue();
    }

    @Test
    public void test2() {
        var search = new SearchLocalRequest();
        search.setQuery("카페");

        SearchLocalResponse result = naverClient.localSearch(search);
        System.out.println(result);

        List<SearchLocalItem> items = result.getItems();
        int n = 0;
        ArrayList<String> keywords = new ArrayList<>();
        for (SearchLocalItem searchLocalItem:
             items) {
            System.out.print(++n + "번째 : ");
            System.out.println(searchLocalItem.getTitle());
            System.out.println(searchLocalItem.getRoadAddress());
            String keyword = searchLocalItem.getTitle() + " " + searchLocalItem.getRoadAddress();
            System.out.println("keyword = " + keyword);
        }


    }
}
