package list;

import java.util.ArrayList;
import java.util.List;

public class DisneyCharacter {
    public static void main(String[] args) {
        List<String> character = new ArrayList<>();
        character.add("ミッキー");
        character.add("ミニー");
        character.add("ドナルド");
        character.add("ダッフィー");
        character.add("シェリーメイ");

        // 拡張for文に変更
        for (String s : character) {
            System.out.println(s);
        }

        // ドナルドをジェラトーニに上書き
        character.set(2, "ジェラトーニ");
        System.out.println("-------------");
        System.out.println("ドナルドを上書き");
        System.out.println(character.get(2));
        System.out.println("-------------");
        System.out.println("上書き後");

        // 全てのデータを表示
        character.forEach(System.out::println);
    }
}
