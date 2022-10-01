package mymap;

import java.util.ArrayList;

public class RoadAddressParser {
    public String parsing(String address){
        ArrayList<String> list = new ArrayList<String>();
        String arr2[] = address.split(" ", 0);
        int cnt = 0;
        for(String s: arr2)
        {


            if(s.equals("서울특별시")){
                cnt++;
                list.add(s);

                continue;
            }
            if(cnt > 0)
            {
                list.add(s);
            }
        }

        String keyword="";
        for (String s: list) {
            keyword += s;
            keyword += " ";
        }
        return keyword;
    }

}
