import java.util.Random;

public class Practice07_04 {
    public static void main(String[] args) {
        int color = new Random().nextInt(5) + 1;

        if (color == 1) {
            System.out.println("今日のラッキーカラーは ピンク です");
        } else if (color == 5) {
            System.out.println("今日のラッキーカラーは ゴールド です");
        } else {
            System.out.println("今日のラッキーカラーは レッド です");
        }
    }
}