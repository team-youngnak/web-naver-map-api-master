package mymap;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class RoadAddressParserTest {

    @Test
    public void parsingTest() {
        RoadAddressParser roadAddressParser = new RoadAddressParser();
        String keyword = "노티드 종각 하이커 서울특별시 중구 청계천로 40";
        String string1 = roadAddressParser.parsing(keyword);

        Assertions.assertThat(string1).isEqualTo("서울특별시 중구 청계천로 40 "); //문자열 마지막 공백 처리
    }
}
