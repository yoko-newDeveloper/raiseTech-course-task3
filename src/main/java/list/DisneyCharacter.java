package list;

import java.util.ArrayList;
import java.util.List;

public class DisneyCharacter {
    public static void main(String[] args) {
        List<String> characters = new ArrayList<>();
        characters.add("ミッキー");
        characters.add("ミニー");
        characters.add("ドナルド");
        characters.add("ダッフィー");
        characters.add("シェリーメイ");

        // 拡張for文に変更
        for (String character : characters) {
            System.out.println(character);
        }

        // ドナルドをジェラトーニに上書き
        characters.set(2, "ジェラトーニ");
        System.out.println("-------------");
        System.out.println("ドナルドを上書き");
        System.out.println(characters.get(2));
        System.out.println("-------------");
        System.out.println("上書き後");

        // 全てのデータを表示
        characters.forEach(System.out::println);
    }
}
