package map;

import java.util.Map;
import java.util.TreeMap;

public class CountryTreeMap {
    public static void main(String[] args) {

        // TreeMap：データが自動的にソートされて格納される

        // TreeMapオブジェクトの生成
        Map<String, String> country = new TreeMap<>();

        // TreeMapオブジェクトにデータを追加
        country.put("F", "France");
        country.put("C", "China");
        country.put("A", "America");
        country.put("J", "Japan");
        country.put("E", "England");

        System.out.println("HashMap:値をソート順で表示");

        for (String key : country.keySet()) {
            System.out.println(country.get(key));
        }
    }
}