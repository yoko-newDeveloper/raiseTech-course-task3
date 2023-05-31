package map;

import java.util.LinkedHashMap;

public class SportsLinkedHashMap {

    public static void main(String[] args) {
        LinkedHashMap<String, String> sports = new LinkedHashMap<>();

        // 要素の追加
        sports.put("c", "野球");
        sports.put("a", "サッカー");
        sports.put("e", "バレーボール");
        sports.put("b", "バスケットボール");
        sports.put("d", "ボクシング");

        // LinkedHashMap：データは追加した順番で格納され、要素の追加順やアクセス順が保持される
        System.out.println(sports);


        // キーと値を表示
        System.out.println("キー" + "a" + "のバリュー：" + sports.get("a"));

        // ラムダ式
        sports.forEach((key, value) -> System.out.println(key + "：" + value));
    }
}
