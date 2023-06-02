package exception;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileConfirmation {
    public static void main (String[] args) {
        // チェックするファイル
        File file1 = new File("対象外ファイル.txt");
        File file2 = null;
        File file3 = new File("通常のファイル.txt");

        try {
            if (file1.getName().equals("対象外ファイル.txt")) {
                System.out.println("このファイルは対象外です");
            } else if (file2 == null) {
                System.out.println("このファイルは空です");
            } else {
                // 通常のファイルを作成
                file3.createNewFile();
                FileWriter writer = new FileWriter(file3);
                // 例外が発生する可能性のあるコード
                writer.write("ファイルの内容を記入してください");
                writer.close();
                System.out.println("通常のファイルを作成しました");
            }
        } catch (IOException e) {
            // 例外の詳細
            e.printStackTrace();
        }
    }
}
