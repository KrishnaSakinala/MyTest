package steps;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class TestExcel {

    public static void main(String[] args) {
        ExcelApiTest eat = new ExcelApiTest("D:\\MockTestData.xlsx");

        List<Map<String, String>> data = new ArrayList<Map<String, String>>();

        int rowCount = eat.getRowCount("user");
        int colCount = eat.getColumnCount("user");
        String key;
        String value;
        for(int i = 1; i<rowCount; i++) {
            Map<String, String> mapData = new LinkedHashMap<>();
            for(int j = 0; j<colCount; j++) {

                key = eat.getCellData("user", j, 0);
                value = eat.getCellData("user", j, i);
                mapData.put(key,value);
            }
            data.add(mapData);
        }

        System.out.println(data);
    }
}
