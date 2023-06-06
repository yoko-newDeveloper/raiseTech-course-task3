package map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PrefectureHashMap {
    public static void main(String[] args) {
        Map<Integer, String> pref = new HashMap<>();

        // HashMap：データは追加した順番で格納されるが、順序が保持されない

        // 要素を格納
        pref.put(3, "東京都");
        pref.put(4, "大阪府");
        pref.put(5, "愛知県");
        pref.put(1, "北海道");
        pref.put(6, "福岡県");
        pref.put(2, "宮城県");

        // キー3を指定してデータを取り出す
        System.out.println("キー３の値");
        System.out.println(pref.get(3));
        System.out.println();
        System.out.println("HashMap:追加した順にデータを表示");

        // 全ての値を取得
        for (String value : pref.values())
            System.out.println(value);
            System.out.println();
            System.out.println("ソート結果");

        // 北からソートする
        Object[] enPrefKeys = pref.keySet(). toArray();
        Arrays.sort(enPrefKeys);

        Iterator<Object> iterator = Arrays.asList(enPrefKeys).iterator();

        // hasNextを使用して値がある場合はループを継続する
        while (iterator.hasNext()) {
            Object key = iterator.next();
            String value = pref.get(key);
            System.out.println(value);
        }
    }
}
