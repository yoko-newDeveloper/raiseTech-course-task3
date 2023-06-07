package map;

import java.util.Map;
import java.util.TreeMap;

public class CountryTreeMap {
    public static void main(String[] args) {

        // TreeMap：データが自動的にソートされて格納される

        // TreeMapオブジェクトの生成
        Map<String, String> country = new TreeMap<>();

        // TreeMapオブジェクトにランダムなキーと値を追加
        country.put("C", "France");
        country.put("T", "China");
        country.put("E", "America");
        country.put("H", "Japan");
        country.put("Z", "England");

        System.out.println("TreeMap:キーのソート順で値を表示");

        for (String key : country.keySet()) {
            System.out.println(country.get(key));
        }
    }
}